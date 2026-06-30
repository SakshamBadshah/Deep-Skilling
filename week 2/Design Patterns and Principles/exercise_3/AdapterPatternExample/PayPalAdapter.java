public class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    public void processPayment(double amount) {
        payPalGateway.sendPayment((int) amount);
    }

    @Override
    public void processPayment(int amount) {
        payPalGateway.sendPayment(amount);
    }
}