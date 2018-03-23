package org.coddington;

/** Default implementation of Calculator */
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

    public int subtract(int x, int y) {
        return x - y;
    }

    public int mod(int x, int y) {
        return x % y;
    }
}
