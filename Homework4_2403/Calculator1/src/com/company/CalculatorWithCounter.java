package com.company;

public class CalculatorWithCounter implements ICalculator  {

    private int operationCount;
    public int getOperationCount() {
        return operationCount;
    }

    public double addition(double num1,double num2){
        operationCount++;
        double add=num1+num2;
        return add;
    }
    public double subtraction(double num1,double num2){
        operationCount++;
        double sub=num1-num2;
        return sub;
    }
    public double multiplicate(double num1,double num2){
        operationCount++;
        double mult=num1*num2;
        return mult;
    }
    public double division(double num1,double num2){
        operationCount++;
        double div=num1/num2;
        return div;
    }

    public double exponentiation( double num1,double num2){
        operationCount++;
        double exp=Math.pow(num1,num2);
        return exp;
    }
    public double absolutValue(double num1){
        operationCount++;
        double val=Math.abs( num1 );
        return val;
    }
    public double rootNumber(double num1) {
        operationCount++;
        double root=Math.sqrt( num1);
        return root;
    }

}


