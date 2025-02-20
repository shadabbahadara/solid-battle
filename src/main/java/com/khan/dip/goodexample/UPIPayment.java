package com.khan.dip.goodexample;

public class UPIPayment implements PaymentProcessor {
    @Override
    public void payment() {
        System.out.println("upi payment");
    }
}
