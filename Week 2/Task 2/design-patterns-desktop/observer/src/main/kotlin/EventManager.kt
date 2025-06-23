package observer

class EventManager(private vararg val operations: String) {
    private val listeners = mutableMapOf<String, MutableList<EventListener>>()

    init {
        for (operation in operations) {
            listeners[operation] = mutableListOf()
        }
    }

    fun subscribe(eventType: String, listener: EventListener) {
        listeners[eventType]?.add(listener)
    }

    fun unsubscribe(eventType: String, listener: EventListener) {
        listeners[eventType]?.remove(listener)
    }

    fun notify(eventType: String, data: String) {
        listeners[eventType]?.forEach { it.update(eventType, data) }
    }
} 