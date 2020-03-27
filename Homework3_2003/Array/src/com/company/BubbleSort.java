package com.company;

import java.util.Arrays;

public class BubbleSort {


    public void sortBubs(){
int number []={2,4,6,1,3,5};
        System.out.println("Первоначальный массив: " +Arrays.toString(number));
        for (int i = number.length-1; i>0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (number[j]>number[j+1]){
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp; }
            }
        }System.out.println("Отсортированный массив: "+ Arrays.toString(number));
    }
}
