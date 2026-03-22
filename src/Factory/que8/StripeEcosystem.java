package Factory.que8;

public class StripeEcosystem extends StripeRefundHandler implements PaymentEcosystem{

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new StripePaymentProcessor();
    }

    @Override
    public Invoice createInvoice() {
        return new StripeInvoice();
    }

    @Override // modified
    public RefundHandler createRefundHandler() {
        return new StripeRefundHandler();
    }
}
