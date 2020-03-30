package com.company;

public class Calculator {

    public static void main(String[] args) {

        CalculatorWithOperator calculatorWithOperator= new CalculatorWithOperator();
        double f=calculatorWithOperator.addition(calculatorWithOperator.addition(4.1,calculatorWithOperator.multiplicate(15,7)),calculatorWithOperator.exponentiation(calculatorWithOperator.division(28,5),2));
        System.out.println(f);
//        4.1 + 15 * 7 + (28 / 5) ^ 2
//        / ^ * 4.1+ +

        double c=calculatorWithOperator.division( f,0);
        System.out.println(c); // Infinity
        double d=calculatorWithOperator.division( f,0.0d );
        System.out.println(d); //Infinity

        CalculatorWithMath calculatorWithMath=new CalculatorWithMath();
        double e=calculatorWithMath.addition(calculatorWithMath.addition( 4.1, calculatorWithMath.multiplicate( 15,7 )),calculatorWithMath.exponention(calculatorWithMath.division( 28,5 ) ,2 ));
        System.out.println(e);



    }


}
