---------------------
Payment System Design
---------------------

Suppose you are working on a payment system that supports multiple payment methods, such as credit card, PayPal, and bank transfer. 
Each payment method requires different logic to process payments. 
To implement this, you can define an interface called PaymentStrategy that encapsulates the payment logic, 
and different classes that implement the PaymentStrategy interface for each payment method. 
Then, you can use the PaymentStrategy interface as a parameter to the payment processing function to dynamically select the payment method at runtime.
