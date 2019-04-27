package com.linhu.concurrency.chapter2;

public class SimpleCalculatorStrategy implements CalculatorStrategy {
    public double calculate(double salary, double bonus) {
        return salary*0.1+bonus*0.15;
    }
}
