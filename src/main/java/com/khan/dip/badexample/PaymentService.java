package com.khan.dip.badexample;

public class PaymentService {
    CreditCardPayment creditCardPayment;

    public PaymentService() {
        creditCardPayment =  new CreditCardPayment();
    }
    public void processPayment() {
        creditCardPayment.payment();
    }
}
