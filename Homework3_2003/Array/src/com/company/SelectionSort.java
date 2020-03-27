package com.company;

import java.util.Arrays;

public class SelectionSort {


    public void sortSel(){
        int number []={9,7,5,8,6,4};
        System.out.println("Первоначальный массив:" + Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            int minVal=number[i];
            int minIndex=i;
            for (int j = i+1; j <number.length ; j++) {
                if (number[j]<minVal){
                    minVal=number[j];
                    minIndex=j; }
            }
            if (i!=minIndex){
                int temp=number[i];
                number[i]=number[minIndex];
                number[minIndex]=temp; }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(number));
    }
}
