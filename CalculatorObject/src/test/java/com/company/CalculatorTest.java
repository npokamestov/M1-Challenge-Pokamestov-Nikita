package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void shouldAddTwoIntegersAndReturnResult() {
        int whatIShouldGet = 2;
        int whatIGot = calc.addInt(1,1);
        assertEquals(whatIShouldGet,whatIGot);
    }

    @Test
    public void shouldSubtractTwoIntegersAndReturnResult() {
        int whatIShouldGet = -29;
        int whatIGot = calc.subtractInt(23,52);
        assertEquals(whatIShouldGet,whatIGot);
    }

    @Test
    public void shouldMultiplyTwoIntegersAndReturnResult() {
        int whatIShouldGet = 64;
        int whatIGot = calc.multiplyInt(32,2);
        assertEquals(whatIShouldGet,whatIGot);
    }

    @Test
    public void shouldDivideTwoIntegersAndReturnResult() {
        int whatIShouldGet = 4;
        int whatIGot = calc.divideInt(12,3);
        assertEquals(whatIShouldGet,whatIGot);
    }

    @Test
    public void shouldDivideTwoDoublesAndReturnResult() {
        double whatIShouldGet = 1.71;
        double whatIGot = calc.divideDouble(12,7);
        assertEquals(whatIShouldGet,whatIGot, 0.01);
    }

    @Test
    public void shouldAddTwoDoublesAndReturnResult() {
        double whatIShouldGet = 5.7;
        double whatIGot = calc.addDouble(3.4,2.3);
        assertEquals(whatIShouldGet,whatIGot, 0.01);
    }

    @Test
    public void shouldMultiplyTwoDoublesAndReturnResult() {
        double whatIShouldGet = 29.48;
        double whatIGot = calc.multiplyDouble(6.7,4.4);
        assertEquals(whatIShouldGet,whatIGot, 0.01);
    }

    @Test
    public void shouldSubtractTwoDoublesAndReturnResult() {
        double whatIShouldGet = 5.0;
        double whatIGot = calc.subtractDouble(5.5,0.5);
        assertEquals(whatIShouldGet,whatIGot,0.01);
    }
}