package Factory.que8;

public class PayPalRefundHandler implements RefundHandler{

    @Override
    public void handelRefund() {
        System.out.println("Paypal initiating Refund");
    }
}
