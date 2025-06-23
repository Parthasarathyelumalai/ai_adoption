package strategy

class BankTransferPayment(private val accountNumber: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paying $amount using Bank Transfer from account $accountNumber")
    }
} 