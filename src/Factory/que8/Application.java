package Factory.que8;

public class Application {
    public final PaymentProcessor processor;
    public final Invoice invoice;
    public final RefundHandler refundHandler;
    public PaymentEcosystem ecosystem;

    Application(PaymentEcosystem ecosystem){
        this.processor = ecosystem.createPaymentProcessor();
        this.invoice = ecosystem.createInvoice();
        this.refundHandler = ecosystem.createRefundHandler(); // modified
    }
    public void buildEcosystem(){
        processor.processPayment();
        invoice.getInvoice();
        refundHandler.handelRefund();   // modified
    }
}
