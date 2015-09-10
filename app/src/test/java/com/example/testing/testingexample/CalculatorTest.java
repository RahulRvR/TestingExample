package com.example.testing.testingexample;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahulrv on 9/9/15.
 */
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void testSum() throws Exception {
        Assert.assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(1d,mCalculator.subtract(5d,4d),0);
    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(4d, mCalculator.divide(20d, 5d), 0);
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(10d, mCalculator.multiply(2d, 5d), 0);
    }
}