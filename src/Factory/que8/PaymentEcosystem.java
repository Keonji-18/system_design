package Factory.que8;

public interface PaymentEcosystem {

    public PaymentProcessor createPaymentProcessor();
    public Invoice createInvoice();
    public RefundHandler createRefundHandler(); // modified
}
