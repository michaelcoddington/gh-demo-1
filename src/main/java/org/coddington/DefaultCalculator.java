package org.coddington;

public class DefaultCalculator implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int num, int den) {
        return num / den;
    }

    public int multiply(int x, int y) {
        return x * y;
    }
}
