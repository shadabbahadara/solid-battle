package com.khan.dip.goodexample;

import com.khan.dip.badexample.CreditCardPayment;

public class PaymentService {
    PaymentProcessor paymentProcessor;
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    public void processPayment() {
        paymentProcessor.payment();
    }
}
