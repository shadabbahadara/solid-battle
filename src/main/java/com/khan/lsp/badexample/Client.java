package com.khan.lsp.badexample;

public class Client {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird = new Penguin();
        bird.fly();
    }
}
