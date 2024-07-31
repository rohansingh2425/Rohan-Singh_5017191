package com.example.payment;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.sendPayment(amount);
    }
}
