package com.khan.dip.goodexample;

public class CreditCardPayment implements PaymentProcessor {
    @Override
    public void payment() {
        System.out.println("credit card payment");
    }
}
