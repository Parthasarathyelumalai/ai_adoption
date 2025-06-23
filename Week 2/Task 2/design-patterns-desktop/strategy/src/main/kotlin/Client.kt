package strategy

fun main() {
    val creditCardPayment = CreditCardPayment("1234-5678-9012-3456")
    val context = PaymentContext(creditCardPayment)
    context.pay(100.0)

    val payPalPayment = PayPalPayment("user@example.com")
    context.setPaymentStrategy(payPalPayment)
    context.pay(250.50)

    val bankTransferPayment = BankTransferPayment("987654321")
    context.setPaymentStrategy(bankTransferPayment)
    context.pay(500.0)
} 