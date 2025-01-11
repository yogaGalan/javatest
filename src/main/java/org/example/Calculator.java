package org.example;

public class Calculator {
    // 基本运算
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }
        return (double) a / b;
    }

    // 高级运算
    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("不能对负数进行开平方");
        }
        return Math.sqrt(a);
    }

    public int power(int base, int exponent) {
//        if (base == 0 && exponent == 0) {
//            throw new IllegalArgumentException("0的0次方不存在");
//        }
        if (exponent < 0) {
            throw new IllegalArgumentException("指数不能为负数");
        }
        return (int) Math.pow(base, exponent);
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("不能计算负数的阶乘");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 其他实用功能
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}