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


}
