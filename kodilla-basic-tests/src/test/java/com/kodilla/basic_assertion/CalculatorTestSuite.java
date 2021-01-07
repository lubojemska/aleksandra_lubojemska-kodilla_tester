package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        int a = 5;
        int b = 8;
        int substractResult = calculator.substract(a,b);
        assertEquals(-3, substractResult);
    }

    @Test
    public void testSquare() {
        int c = 7;
        int squareResult = calculator.square(c);
        assertEquals(49,squareResult);
    }
}
