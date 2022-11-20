package com.comarch.testy;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int diff(int a, int b) {
        return a-b;
    }

    public double divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException();
        }
        return (double) a/b;
    }
}
