package com.company;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SimpleArray {
    Scanner in = new Scanner(System.in);

public void massiv1 () {
    int number [] = new int[4];
    System.out.println("Введите значения массива");
    for (int i = 0; i <number.length ; i++) {
        number[i]=in.nextInt();
    }
    for (int i = 0; i <number.length ; i++) {  // вывод через for
        System.out.print(number[i] + " "); }
}

public void massiv2(){
    int number [] = new int[4];
    System.out.println("Введите значения массива");
    for (int i = 0; i <number.length ; i++) {
        number[i]=in.nextInt();
    }
    for (int output:number) {     //вывод foreach
        System.out.print(output+" "); }
}
public void massiv3(){
    int number [] = new int[5];
    System.out.println("Введите значения массива");
    for (int i = 0; i <number.length ; i++) {
        number[i]=in.nextInt();
    }
    int i=0;
while (i<number.length){         //вывод while

    System.out.print(number[i]);
    i++; }
}

public void massiv4(){
    int number [] = new int[5];
    System.out.println("Введите значения массива");
    for (int i = 0; i <number.length ; i++) {
        number[i]=in.nextInt();
    }
    int i=0;
    do {                             //вывод do while
        System.out.print(number[i]);
        i++;
    }while (i<number.length);
}
}
