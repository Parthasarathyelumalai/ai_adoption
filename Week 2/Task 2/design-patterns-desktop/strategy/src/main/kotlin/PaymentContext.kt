package strategy

class PaymentContext(private var paymentStrategy: PaymentStrategy) {
    fun setPaymentStrategy(paymentStrategy: PaymentStrategy) {
        this.paymentStrategy = paymentStrategy
    }

    fun pay(amount: Double) {
        paymentStrategy.pay(amount)
    }
} 