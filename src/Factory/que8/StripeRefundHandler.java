package Factory.que8;

public class StripeRefundHandler implements RefundHandler{

    @Override
    public void handelRefund() {
        System.out.println("Stripe initiating refund");
    }
}
