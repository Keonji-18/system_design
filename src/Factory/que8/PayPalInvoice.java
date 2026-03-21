package Factory.que8;

public class PayPalInvoice implements Invoice{

    @Override
    public void getInvoice() {
        System.out.println("PayPal invoice");
    }
}
