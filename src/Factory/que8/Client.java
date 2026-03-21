package Factory.que8;

public class Client {
    public static PaymentEcosystem createEcosystem(String paymentType){
        switch (paymentType.toLowerCase()){
            case "stripe" : return new StripeEcosystem();
            case "paypal" : return new PayPalEcosystem();
            default: throw new IllegalArgumentException("Invalid payment mode");
        }
    }

    public static void main(String[] args) {
    PaymentEcosystem ecosystem = createEcosystem("stripe");
    Application app = new Application(ecosystem);
    app.buildEcosystem();

    }
}
