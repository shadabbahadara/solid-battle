package com.khan.lsp.goodexample;


public class Eagle extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("flying");
    }
}
