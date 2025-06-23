package strategy

import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class PaymentContextTest {

    @Test
    fun `should use credit card payment strategy`() {
        val paymentStrategy = mock(CreditCardPayment::class.java)
        val context = PaymentContext(paymentStrategy)
        context.pay(100.0)
        verify(paymentStrategy).pay(100.0)
    }

    @Test
    fun `should switch to paypal payment strategy`() {
        val creditCard = mock(CreditCardPayment::class.java)
        val payPal = mock(PayPalPayment::class.java)
        val context = PaymentContext(creditCard)

        context.setPaymentStrategy(payPal)
        context.pay(250.0)

        verify(payPal).pay(250.0)
    }

    @Test
    fun `should use bank transfer payment strategy`() {
        val paymentStrategy = mock(BankTransferPayment::class.java)
        val context = PaymentContext(paymentStrategy)
        context.pay(500.0)
        verify(paymentStrategy).pay(500.0)
    }
} 