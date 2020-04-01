package com.company;

public class CalculatorWithOperator implements ICalculator{


public double addition(double num1,double num2){
    double add=num1+num2;
    return add;
}
public double subtraction(double num1,double num2){
    double sub=num1-num2;
    return sub;
}
public double multiplicate(double num1,double num2){
    double mult=num1*num2;
    return mult;
}
public double division(double num1,double num2){
    double div=num1/num2;
    return div;
}
public double exponentiation( double num1,double num2){
    double exp=1;
    for (int i = 0; i< num2; i++) {
        exp=exp*num1;
    }return exp;
}
public double absolutValue(double num1){
    if (num1< 0) {
        return -num1;
    } else {
        return num1;
    }
}
public double rootNumber(double num1) {// квадратный корень
    double root = num1 / 2;
    double a = (root * root);
    while (a > num1) {
        a = (root * root) - num1;
        root--;
    }
    return root;
}
}
