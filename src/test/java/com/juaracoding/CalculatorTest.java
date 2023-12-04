package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        double actual = calculator.add(10, 5);
        double expected = 15;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(10, 5), 5);
    }



}
