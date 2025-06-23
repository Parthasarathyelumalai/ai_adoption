package strategy

class CreditCardPayment(private val cardNumber: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paying $amount using Credit Card $cardNumber")
    }
} 