package Factory.que8;

public class StripePaymentProcessor implements PaymentProcessor{

    @Override
    public void processPayment() {
        System.out.println("Stripe processing payment ...");
    }
}
