package com.linhu.concurrency.chapter2;

public class TaxCalculator {

    private final double salary;

    private final double bonus;

    private CalculatorStrategy calculatorStrategy;

    public TaxCalculator(double salary,double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    protected double calcTax(){
        return calculatorStrategy.calculate(this.salary,this.bonus);
    }

    public double calcuate(){
        return this.calcTax();
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }
}
