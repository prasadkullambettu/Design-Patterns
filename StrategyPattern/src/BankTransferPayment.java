// Define the BankTransferPayment class that implements the PaymentStrategy interface
public class BankTransferPayment implements PaymentStrategy {
    private String accountNumber;
    private String routingNumber;

    public BankTransferPayment(String accountNumber, String routingNumber) {
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    @Override
    public void processPayment(double amount) {
        // Process bank transfer payment logic here
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}