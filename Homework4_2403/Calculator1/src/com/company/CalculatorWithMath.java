package com.company;

public class CalculatorWithMath extends CalculatorWithOperator implements ICalculator{

    public double exponention( double num1,double num2){
        double exp=Math.pow(num1,num2);
        return exp;
        }
    public double absolutValue1(double num1){
        double val=Math.abs( num1 );
        return val;
        }
    public double rootNumber2(double num1) {
        double root=Math.sqrt( num1);
        return root;
        }
    }
