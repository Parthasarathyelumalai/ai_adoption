package strategy

class PayPalPayment(private val email: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paying $amount using PayPal account $email")
    }
} 