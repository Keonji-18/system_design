package Factory.que8;

public class  PayPalPaymentProcessor implements PaymentProcessor{

    @Override
    public void processPayment() {
        System.out.println("PayPal processing payment ...");
    }
}
