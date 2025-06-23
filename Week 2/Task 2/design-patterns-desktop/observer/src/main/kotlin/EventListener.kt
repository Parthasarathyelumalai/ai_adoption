package observer

interface EventListener {
    fun update(eventType: String, data: String)
} 