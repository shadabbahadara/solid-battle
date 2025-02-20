package com.khan.lsp.badexample;

public class Penguin extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("penguin can not fly");
    }
}
