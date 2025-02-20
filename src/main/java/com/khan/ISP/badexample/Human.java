package com.khan.ISP.badexample;

public class Human implements Worker {
    @Override
    public void work() {
        System.out.println("I am working");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void sleep() {
        System.out.println("i am sleeping");
    }
}
