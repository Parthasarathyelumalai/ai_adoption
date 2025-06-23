package observer

fun main() {
    val eventManager = EventManager("login", "logout", "purchase")

    val emailListener = EmailListener("user@example.com")
    val smsListener = SmsListener("123-456-7890")

    eventManager.subscribe("login", emailListener)
    eventManager.subscribe("login", smsListener)
    eventManager.subscribe("purchase", emailListener)

    eventManager.notify("login", "User John Doe logged in")
    eventManager.notify("purchase", "User John Doe purchased an item")

    eventManager.unsubscribe("login", smsListener)

    eventManager.notify("login", "User Jane Doe logged in")
} 