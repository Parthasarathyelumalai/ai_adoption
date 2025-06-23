fun processData(records: List<Map<String, Any>>): Map<Any, Double> {
    val result = mutableMapOf<Any, Double>()
    for (record in records) {
        try {
            if (record["status"] != "active") continue

            val value = (record["value"] as? Number)?.toDouble()
                ?: (record["value"] as? String)?.toDoubleOrNull()
                ?: throw IllegalArgumentException("Value is not a number")

            if (value < 0) throw IllegalArgumentException("Negative value not allowed")

            val id = record["id"] ?: throw IllegalArgumentException("Missing id")
            result[id] = value * 2
        } catch (e: Exception) {
            println("Skipping record due to error: ${e.message}")
        }
    }
    return result
} 