public class PayPalAdapter implements PaymentProcessor {

    @SuppressWarnings("FieldMayBeFinal")
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    
    @SuppressWarnings("override")
    public void processPayment(double amount) {
        payPalGateway.sendPayment((int) amount);
    }

    @Override
    public void processPayment(int amount) {
        payPalGateway.sendPayment(amount);
    }
}