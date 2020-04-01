package com.company;

public class Main3 {

    public static void main(String[] args) {
        CalculatorWithCounter calc1 =new CalculatorWithCounter();
        CalcWithCounterConstructor calc = new CalcWithCounterConstructor(calc1);
        CalculatorWithMath calc2 =new CalculatorWithMath();
        CalcWithCounterConstructor2 calc5= new CalcWithCounterConstructor2( calc2 );
        CalcWithCounterConstructor calc4= new CalcWithCounterConstructor( new CalculatorWithMath());
        
        CalculatorWithCounter1 calc3 = new CalculatorWithCounter1();
        double p=calc3.addition( calc3.addition( 4.1,calc3.multiplicate(15,7)),calc3.exponentiation( calc3.division(28,5  ),2));
        System.out.println(p);
        System.out.println(calc3.getOperationCount(p));


    }
}
