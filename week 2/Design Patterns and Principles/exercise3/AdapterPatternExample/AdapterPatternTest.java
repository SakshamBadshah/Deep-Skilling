public class AdapterPatternTest {

    public static void main(String[] args) {

        PaymentProcessor paypalProcessor =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripeProcessor =
                new StripeAdapter(new StripeGateway());

        PaymentProcessor razorpayProcessor =
                new RazorpayAdapter(new RazorpayGateway());

        paypalProcessor.processPayment(5000);
        stripeProcessor.processPayment(3000);
        razorpayProcessor.processPayment(7000);
    }
}