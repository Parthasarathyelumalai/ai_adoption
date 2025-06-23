fun validateInputs(): Boolean {
    var isValid = true
    focusNeeded = null
    serverData?.forEach { data ->
        data.apply {
            if ((isMandatory && !resultHashMap.containsKey(id)
                        && isViewVisible(id) && isViewEnabled(id))
                ||
                (isMandatory && resultHashMap.containsKey(id)
                        && resultHashMap[id] is String && (resultHashMap[id] as String).isEmpty())
            ) {
                isValid = false
                requestFocusView(data)
            } else if (isPhoneNumberField(id) && isMandatory && resultHashMap.containsKey(id)) {
                val actualValue = resultHashMap[id] as? String
                isValid = validatePhoneNumberField(actualValue, data) && isValid
            } else if ((id == dateOfBirth || id == DateOfBirth) && isMandatory && resultHashMap.containsKey(id)) {
                val actualValue = resultHashMap[id] as? String
                maxAge?.let { ageLimit ->
                    val isValidAge = actualValue?.let {
                        val dob = DateUtils.getV2YearMonthAndWeek(it)
                        dob.years < ageLimit || (dob.years == ageLimit && dob.months == 0 && dob.weeks == 0 && dob.days == 0)
                    } ?: false

                    if (!isValidAge) {
                        isValid = false
                        requestFocusView(data, getString(R.string.dob_invalid, maxAge))
                    } else {
                        hideValidationField(data)
                    }
                } ?: run {
                    actualValue?.let {
                        hideValidationField(data)
                    } ?: run {
                        isValid = false
                        requestFocusView(data)
                    }
                }
            } else if (data.viewType.equals(VIEW_TYPE_FORM_BP, true)) {
                val list = resultHashMap[id] as ArrayList<BPModel>
                val validationBPResultModel = Validator.checkValidBPInput(
                    context, list, data
                )
                if (validationBPResultModel.status) {
                    hideValidationField(data)
                } else {
                    isValid = false
                    requestFocusView(data, validationBPResultModel.message)
                }
            } else if (data.viewType.equals(VIEW_TYPE_TIME, true)) {
                val dateKey = id + lastMealTypeDateSuffix
                val timeKey = id + lastMealTypeMeridiem
                if (resultHashMap.containsKey(Screening.BloodGlucoseID) && resultHashMap[Screening.BloodGlucoseID] != null) {
                    if (resultHashMap[dateKey] != null) {
                        val result = resultHashMap[id] as? MutableMap<*, *>
                        val hour = (result?.get(Hour) as? String)?.toIntOrNull()
                        val minute = (result?.get(Minute) as? String)?.toIntOrNull()
                        if (hour != null && minute != null && hour != 0 && resultHashMap[timeKey] != null) {
                            val minHour = data.minValueForHour
                            val maxHour = data.maxValueForHour
                            val minMinute = data.minValueForMinute
                            val maxMinute = data.maxValueForMinute

                            val isValidHour =
                                minHour != null && maxHour != null && hour in minHour..maxHour
                            val isValidMinute =
                                minMinute != null && maxMinute != null && minute in minMinute..maxMinute

                            if (((!(minHour != null && maxHour != null)) && (!(minMinute != null && maxMinute != null))) || (isValidHour && isValidMinute)) {
                                val res = (resultHashMap[dateKey] as? String)?.let { date ->
                                    if (date.equals(
                                            Screening.Today,
                                            ignoreCase = true
                                        ) && hour != null && minute != null && hour != 0 && resultHashMap[timeKey] != null
                                    ) {
                                        DateUtils.isValidTimeForLastMealTime(
                                            hour,
                                            minute,
                                            resultHashMap[timeKey] as String
                                        )
                                    } else {
                                        true
                                    }
                                } ?: false
                                if (res) {
                                    hideValidationField(data)
                                } else {
                                    isValid = false
                                    requestFocusView(data)
                                }
                            } else {
                                isValid = false
                                requestFocusView(
                                    data,
                                    getString(
                                        R.string.time_meal_error,
                                        minHour,
                                        maxHour,
                                        minMinute,
                                        maxMinute
                                    )
                                )
                            }
                        } else {
                            isValid = false
                            requestFocusView(data)
                        }
                    } else {
                        isValid = false
                        requestFocusView(data)
                    }
                }
            } else {
                if (resultHashMap.containsKey(id) && data.viewType.equals(
                        VIEW_TYPE_FORM_EDITTEXT, true
                    )
                ) {
                    val actualValue = resultHashMap[id]
                    if (actualValue is String && actualValue.isEmpty() && !isMandatory) {
                        hideValidationField(data)
                    }else if (id == Screening.NoOfNeonates && resultHashMap[id].toString().toIntOrNull() == 0) {
                        isValid = false
                        requestFocusView(data)
                    }else {
                        isValid = validateMinMaxLength(
                            actualValue,
                            isValid,
                            data
                        )
                        if (isValid && data.onlyAlphabets == true) {
                            isValid = checkOnlyAlphabets(
                                actualValue,
                                isValid,
                                data
                            )
                        }
                    }
                } else {
                    when (data.viewType) {
                        VIEW_TYPE_METAL_HEALTH -> {
                            if (isViewVisible(id)) {
                                if (checkValidMentalHealth(this, id)) {
                                    hideValidationField(data)
                                } else {
                                    isValid = false
                                    requestFocusView(data)
                                }
                            }
                        }
                        else -> {
                            hideValidationField(data)
                        }
                    }
                }
            }
        }
    }
    return isValid
}

private fun isPhoneNumberField(id: String): Boolean {
    return id == Screening.phoneNumber || id == headPhoneNumber || id == phoneNumber
            || id == CommunityDetails.EmergencyContactPhu || id == CommunityDetails.EmergencyTransportContactNo
            || id == CommunityDetails.AmbulanceDriverContactNo || id == RxBuddy.rxBuddyPhoneNumber
}

private fun validatePhoneNumberField(actualValue: String?, data: DataType): Boolean {
    if (actualValue != null) {
        if (!startsWith.isNullOrEmpty() && !checkPhoneNumberValidOrNot(
                actualValue,
                startsWith
            )
        ) {
            requestFocusView(
                data, getString(
                    R.string.start_with_validation,
                    startsWith?.joinToString(separator = " ${getString(R.string.or)} ") ?: ""
                )
            )
            return false
        } else if (!phoneNumberConatinMaxLength(
                contentLength ?: maxLength,
                actualValue
            )
        ) {
            requestFocusView(data)
            return false
        } else if (!FormFieldValidator.isValidMobileNumber(actualValue)) {
            requestFocusView(
                data, getString(
                    R.string.phone_number_invalid
                )
            )
            return false
        } else {
            hideValidationField(data)
            return true
        }
    } else {
        requestFocusView(data)
        return false
    }
} 