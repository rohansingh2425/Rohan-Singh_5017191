package com.example.strategy;

public class PaymentStrategyTest {
    public static void main(String[] args) {
       
        PaymentContext context = new PaymentContext();

       
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(150.00);

       
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(75.00);
    }
}
