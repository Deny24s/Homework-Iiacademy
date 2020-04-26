package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Введите числа от 1 до 10, но попыток будет 3: " );
        int counter = 0;

        do {
            try {
                int number=Integer.parseInt( scanner.nextLine() );
                if (number<=0||number>10 ) {
                    throw new InputMismatchException(  );
                }
            }catch (InputMismatchException e){
                counter++;
                System.out.println("Вы ввели число не из диапазона, " + "осталось попыток: " + (3-counter)  );
            }catch (NumberFormatException e) {
                counter++;
                System.out.println( "Вы ввели строку, а надо число, " + "осталось попыток: " + (3-counter));
            }
        }while(counter<3);
        System.out.println("Вы потратили все попытки GAME OVER!(");
    }
}