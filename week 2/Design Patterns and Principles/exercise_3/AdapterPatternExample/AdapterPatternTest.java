public class AdapterPatternTest {

    public static void main(String[] args) {

        PaymentProcessor paypalProcessor = new PayPalGateway();

        PaymentProcessor stripeProcessor =
                new StripeAdapter(new StripeGateway());

        PaymentProcessor razorpayProcessor =
                new RazorpayAdapter(new RazorpayGateway());

        paypalProcessor.processPayment(5000);
        stripeProcessor.processPayment(3000);
        razorpayProcessor.processPayment(7000);
    }
}

interface PaymentProcessor {
    void processPayment(int amount);
}

class PayPalGateway implements PaymentProcessor {
    @Override
    public void processPayment(int amount) {
        System.out.println("Processed payment of " + amount + " via PayPal.");
    }
}

class StripeGateway {
    void makePayment(int amount) {
        System.out.println("Processed payment of " + amount + " via Stripe.");
    }
}

class StripeAdapter implements PaymentProcessor {
    private final StripeGateway stripeGateway;

    StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(int amount) {
        stripeGateway.makePayment(amount);
    }
}

class RazorpayGateway {
    void sendPayment(int amount) {
        System.out.println("Processed payment of " + amount + " via Razorpay.");
    }
}

class RazorpayAdapter implements PaymentProcessor {
    private final RazorpayGateway razorpayGateway;

    RazorpayAdapter(RazorpayGateway razorpayGateway) {
        this.razorpayGateway = razorpayGateway;
    }

    @Override
    public void processPayment(int amount) {
        razorpayGateway.sendPayment(amount);
    }
}
