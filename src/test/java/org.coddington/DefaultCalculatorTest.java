package org.coddington;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefaultCalculatorTest {

    @Test
    public void testAdd() {
        DefaultCalculator calc = new DefaultCalculator();
        int sum = calc.add(2, 2);
        assertEquals("Addition error", 4, sum);
    }

    @Test
    public void testSubtract() {
        DefaultCalculator calc = new DefaultCalculator();
        int num = calc.subtract(4, 2);
        assertEquals("Subtraction error", 2, num);
    }

    @Test
    public void testSubtractNegative() {
        DefaultCalculator calc = new DefaultCalculator();
        int num = calc.subtract(4, -2);
        assertEquals("Subtraction error", 6, num);
    }

    @Test
    public void testSubtractNegativeFromNegative() {
        DefaultCalculator calc = new DefaultCalculator();
        int num = calc.subtract(-10, -3);
        assertEquals("Subtraction error", -7, num);
    }

    @Test
    public void testDivide() {
        DefaultCalculator calc = new DefaultCalculator();
        int num = calc.divide(4, 2);
        assertEquals("Division error", 2, num);
    }

    @Test
    public void testMultiply() {
        DefaultCalculator calc = new DefaultCalculator();
        int num = calc.multiply(4, 2);
        assertEquals("Multiplication error", 8, num);
    }

    @Test
    public void testMultiplyNegatives() {
        DefaultCalculator calc = new DefaultCalculator();
        int num = calc.multiply(-4, -2);
        assertEquals("Multiplication error", 8, num);
    }
}
