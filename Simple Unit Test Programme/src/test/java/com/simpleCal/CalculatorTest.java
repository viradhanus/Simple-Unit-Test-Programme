package com.simpleCal;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calc;

    @BeforeMethod
    public void setUp() {
        calc = new Calculator();

    }

    @Test
    public void testSum() {
        Assert.assertEquals(calc.calSum(20, 30), 50);
    }

}
