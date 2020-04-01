package com.company;

public class CalculatorWithCounter1 extends CalculatorWithOperator implements ICalculator{
    private int operationCount;

    public int getOperationCount(double p) {
        return operationCount;
    }

    public double addition(double num1,double num2){
        operationCount++;
        return super.addition( num1,num2 );
    }
    public double subtraction(double num1,double num2){
        operationCount++;
        return super.subtraction( num1,num2 );
    }
    public double multiplicate(double num1,double num2){
        operationCount++;
        return super.multiplicate( num1,num2 );
    }
    public double division(double num1,double num2){
        operationCount++;
        return super.division( num1,num2 );
    }
    public double exponention( double num1,double num2){
        operationCount++;
        return super.exponentiation( num1,num2 );
    }
    public double absolutValue1(double num1){
        operationCount++;
        return super.absolutValue( num1 );
    }
    public double rootNumber2(double num1) {
        operationCount++;
        return super.rootNumber( num1 );
    }

}


