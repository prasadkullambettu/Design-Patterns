// Define the CreditCardPayment class that implements the PaymentStrategy interface
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolder, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(double amount) {
        // Process credit card payment logic here
        System.out.println("Processing credit card payment of $" + amount);
    }
}