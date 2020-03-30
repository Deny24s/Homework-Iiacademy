package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FinishArray{

    Scanner in = new Scanner(System.in);

    public int [] sortArr () {
        System.out.println( "Введите длину массива: " );
        int i = in.nextInt();
        int array[] = new int[i];
        System.out.println( "Введите значения массива: " );
        for (int j = 0; j < array.length; j++) {
            array[j] = in.nextInt();
        }
        System.out.println("Введенный массив: " + Arrays.toString(array));

        for (int k = 0; k < array.length; k++) {
            int index = k;
            int temp = array[k];
            while (index > 0 && array[index - 1] >= temp) {
                array[index] = array[index - 1];
                index--;
            }
            array[index] = temp;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString( array ));
        return array;
    }
}
