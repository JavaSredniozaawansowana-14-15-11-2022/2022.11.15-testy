package com.comarch.testy;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTwoPositivesTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        int actual = calculator.add(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void addTwoNegativesTest() {
        Calculator calculator = new Calculator();
        int a = -4;
        int b = -9;
        int expectedResult = -13;

        int actual = calculator.add(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void divideTwoPositivesTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;
        double expectedResult = 2.5;

        double actual = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, actual, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 0;

        calculator.divide(a, b);
    }
}
