package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    // 基本运算测试
    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(2, 3), 5);
        Assert.assertEquals(calculator.add(-1, 1), 0);
        Assert.assertEquals(calculator.add(0, 0), 0);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(5, 3), 2);
        Assert.assertEquals(calculator.subtract(-1, -1), 0);
        Assert.assertEquals(calculator.subtract(0, 5), -5);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(2, 3), 6);
        Assert.assertEquals(calculator.multiply(-2, 3), -6);
        Assert.assertEquals(calculator.multiply(0, 5), 0);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calculator.divide(6, 2), 3.0);
        Assert.assertEquals(calculator.divide(5, 2), 2.5);
        Assert.assertEquals(calculator.divide(0, 5), 0.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
    }

    // 高级运算测试
    @Test
    public void testSqrt() {
        Assert.assertEquals(calculator.sqrt(4), 2.0);
        Assert.assertEquals(calculator.sqrt(0), 0.0);
        Assert.assertEquals(calculator.sqrt(2), Math.sqrt(2), 0.0000001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSqrtOfNegative() {
        calculator.sqrt(-4);
    }

    @Test
    public void testPower() {
        Assert.assertEquals(calculator.power(2, 3), 8);
        Assert.assertEquals(calculator.power(2, 0), 1);
        Assert.assertEquals(calculator.power(0, 5), 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPowerNegativeExponent() {
        calculator.power(2, -1);
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(calculator.factorial(0), 1);
        Assert.assertEquals(calculator.factorial(1), 1);
        Assert.assertEquals(calculator.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        calculator.factorial(-1);
    }

    // 其他功能测试
    @Test
    public void testIsPrime() {
        Assert.assertTrue(calculator.isPrime(2));
        Assert.assertTrue(calculator.isPrime(3));
        Assert.assertTrue(calculator.isPrime(17));
        Assert.assertFalse(calculator.isPrime(4));
        Assert.assertFalse(calculator.isPrime(1));
        Assert.assertFalse(calculator.isPrime(0));
        Assert.assertFalse(calculator.isPrime(-5));
    }
}