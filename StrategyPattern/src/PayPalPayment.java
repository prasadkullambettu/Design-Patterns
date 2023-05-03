// Define the PayPalPayment class that implements the PaymentStrategy interface
public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        // Process PayPal payment logic here
        System.out.println("Processing PayPal payment of $" + amount);
    }
}