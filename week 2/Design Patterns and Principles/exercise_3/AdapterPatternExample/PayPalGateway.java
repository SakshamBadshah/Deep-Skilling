public class PayPalGateway {
    public void makePayment1(double amount) {
        System.out.println("Payment of ₹" + amount + " processed using PayPal.");
    }
    @SuppressWarnings("unused")
    void makePayment(double amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @SuppressWarnings("unused")
    void sendPayment1(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    void sendPayment(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}