package Factory.que8;

public class StripeInvoice implements Invoice{

    @Override
    public void getInvoice(){
        System.out.println("Stripe Invoice");
    }
}
