package com.company;

public class CalculatorMain {

    public static void main(String[] args) {

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        double f = calculatorWithOperator.addition( calculatorWithOperator.addition( 4.1, calculatorWithOperator.multiplicate( 15, 7 ) ), calculatorWithOperator.exponentiation( calculatorWithOperator.division( 28, 5 ), 2 ) );
        System.out.println( f );
//        4.1 + 15 * 7 + (28 / 5) ^ 2
//        / ^ * 4.1+ +

        double c = calculatorWithOperator.division( f, 0 );
        System.out.println( c ); // Infinity
        double d = calculatorWithOperator.division( f, 0.0d );
        System.out.println( d ); //Infinity

        CalculatorWithMath calculatorWithMath = new CalculatorWithMath();
        double e = calculatorWithMath.addition( calculatorWithMath.addition( 4.1, calculatorWithMath.multiplicate( 15, 7 ) ), calculatorWithMath.exponention( calculatorWithMath.division( 28, 5 ), 2 ) );
        System.out.println( e );

        CalculatorWithCounter calculatorWithCounter = new CalculatorWithCounter();
        System.out.println( calculatorWithCounter.getOperationCount() );

        calculatorWithCounter.addition( 2, 3 );
        System.out.println( calculatorWithCounter.getOperationCount() );

        ICalculator calc1 = new CalculatorWithOperator();
        ICalculator calc2 = new CalculatorWithCounter();
        ICalculator calc4 = new CalculatorWithMath();

        CalculatorWithCounter1 calc3 = new CalculatorWithCounter1();
        double p=calc3.addition( calc3.addition( 4.1,calc3.multiplicate(15,7)),calc3.exponentiation( calc3.division(28,5  ),2));
        System.out.println(p);
        System.out.println(calc3.getOperationCount(p));

    }
}
