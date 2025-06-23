package observer

class SmsListener(private val phoneNumber: String) : EventListener {
    override fun update(eventType: String, data: String) {
        println("Sending SMS to $phoneNumber about $eventType with data: $data")
    }
} 