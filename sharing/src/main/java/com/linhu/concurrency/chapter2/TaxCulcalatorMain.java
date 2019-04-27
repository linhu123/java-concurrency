package com.linhu.concurrency.chapter2;

public class TaxCulcalatorMain {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator(10000d,2000d){
            @Override
            public double calcTax() {
                return getSalary()*0.1+getBonus()*0.1;
            }
        };
        double tax = calculator.calcuate();
        System.out.println(tax);

    }
}
