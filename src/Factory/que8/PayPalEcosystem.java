package Factory.que8;

public class PayPalEcosystem implements PaymentEcosystem{

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PayPalPaymentProcessor();
    }

    @Override
    public Invoice createInvoice() {
        return new PayPalInvoice();
    }

    @Override // modified
    public RefundHandler createRefundHandler() {
        return new PayPalRefundHandler();
    }
}
