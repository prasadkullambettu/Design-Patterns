// Client code that uses the PaymentProcessor to process payments
public class Client {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23");
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(100.0);

        paymentStrategy = new PayPalPayment("john.doe@example.com", "password");
        paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(50.0);

        paymentStrategy = new BankTransferPayment("1234567890", "9876543210");
        paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(200.0);
    }
}