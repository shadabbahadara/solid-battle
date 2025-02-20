package com.khan.lsp.goodexample;

public class Client {
    public static void main(String[] args) {
        Flyable flyingBird = new Eagle();
        flyingBird.fly();

        Bird nonFlyingBird = new Penguin();
    }
}
