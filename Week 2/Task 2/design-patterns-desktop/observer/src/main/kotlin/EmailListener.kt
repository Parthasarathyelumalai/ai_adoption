package observer

class EmailListener(private val email: String) : EventListener {
    override fun update(eventType: String, data: String) {
        println("Sending email to $email about $eventType with data: $data")
    }
} 