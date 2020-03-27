package com.company;

import java.util.Arrays;

public class InsertSort {

    public void sortIns(){
        int number []={10,-1,3,5,8,9};
        System.out.println("Первоначальный массив:" + Arrays.toString(number));
        for (int i = 0; i <number.length ; i++) {
            int index=i;
            int temp=number[i];
            while (index>0 && number[index-1]>=temp){
                number[i]=number[index-1];
                index--;
            }
            number[index]=temp;
        }
        System.out.println("Отсортированный массив: "+ Arrays.toString(number));
    }
}
