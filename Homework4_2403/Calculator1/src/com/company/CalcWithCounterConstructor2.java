package com.company;

public class CalcWithCounterConstructor2 implements ICalculator {
    private int count;
    private ICalculator calc;

    public CalcWithCounterConstructor2(CalculatorWithOperator calculatorWithMath) {
        this.calc=calculatorWithMath;
    }

    @Override
    public double addition(double num1, double num2) {
        count++;
        return calc.addition( num1,num2 );
    }

    @Override
    public double subtraction(double num1, double num2) {
        count++;
        return calc.subtraction( num1,num2 );
    }

    @Override
    public double multiplicate(double num1, double num2) {
        count++;
        return calc.multiplicate( num1,num2 );
    }

    @Override
    public double division(double num1, double num2) {
        count++;
        return calc.division( num1,num2 );
    }

    @Override
    public double exponentiation(double num1, double num2) {
        count++;
        return calc.exponentiation( num1,num2 );
    }

    @Override
    public double absolutValue(double num1) {
        count++;
        return calc.absolutValue( num1 );
    }

    @Override
    public double rootNumber(double num1) {
        count++;
        return calc.rootNumber( num1);
    }
}