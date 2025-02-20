package com.khan.ISP.badexample;

public class Robot implements Worker{
    @Override
    public void work() {
        System.out.println("I am working");
    }

    @Override
    public void eat() {
        System.out.println("I do not eat");
    }

    @Override
    public void sleep() {
        System.out.println("I do not sleep");
    }
}
