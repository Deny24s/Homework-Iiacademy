package com.company;

public class CalculatorWithMath {


    public double addition(double num1, double num2) {
        double add = num1 + num2;
        return add;
    }

    public double subtraction(double num1, double num2) {
        double sub = num1 - num2;
        return sub;
    }

    public double multiplicate(double num1, double num2) {
        double mult = num1 * num2;
        return mult;
    }

    public double division(double num1, double num2) {
        double div = num1 / num2;
        return div;
    }
    public double exponention( double num1,double num2){
        double exp=Math.pow(num1,num2);
        return exp;
        }
    public double absolutValue(double num1){
        double val=Math.abs( num1 );
        return val;
        }
    public double rootNumber(double num1) {
        double root=Math.sqrt( num1);
        return root;
        }
    }
