package com.company;

public class Calculator {

    public static void main(String[] args) {

        CalculatorWithOperator calculatorWithOperator= new CalculatorWithOperator();
//        double f=calculatorWithOperator.addition(calculatorWithOperator.addition(4.1,calculatorWithOperator.multiplicate(15,7)),calculatorWithOperator.exponentiation(calculatorWithOperator.division(28,5),2));

        double a=calculatorWithOperator.division(28,5);

        double b=calculatorWithOperator.exponentiation(a,2);

        double c=calculatorWithOperator.multiplicate(15,7);

        double d=calculatorWithOperator.addition(4.1,c);

        double e=calculatorWithOperator.addition(d,b);

        System.out.println(e);

//        4.1 + 15 * 7 + (28 / 5) ^ 2
//        / ^ * 4.1+ +
    }


}
