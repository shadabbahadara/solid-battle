package com.khan.ISP.goodexample;

public class Human implements Workable, Eatable, Sleepable {
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
        System.out.println("I am sleeping");
    }


}
