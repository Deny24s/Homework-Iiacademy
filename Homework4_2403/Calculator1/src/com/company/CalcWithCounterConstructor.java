package com.company;

public class CalcWithCounterConstructor implements ICalculator {
    private int count;

    private CalculatorWithMath calculatorWithMath;
    private CalculatorWithCounter calculatorWithCounter;

    public CalcWithCounterConstructor(CalculatorWithMath calculatorWithMath) {
        this.calculatorWithMath = calculatorWithMath;
    }

    public CalcWithCounterConstructor(CalculatorWithCounter calculatorWithCounter) {
        this.calculatorWithCounter = calculatorWithCounter;
    }

    @Override
    public double addition(double num1, double num2) {
        count++;
        if (calculatorWithCounter != null)
            return calculatorWithCounter.addition( num1, num2 );
        else {
            return calculatorWithMath.addition( num1, num2 );
        }
    }

    @Override
    public double subtraction(double num1, double num2) {

        return 0;
    }

    @Override
    public double multiplicate(double num1, double num2) {
        return 0;
    }

    @Override
    public double division(double num1, double num2) {
        return 0;
    }

    @Override
    public double exponentiation(double num1, double num2) {
        return 0;
    }

    @Override
    public double absolutValue(double num1) {
        return 0;
    }

    @Override
    public double rootNumber(double num1) {
        return 0;
    }
}