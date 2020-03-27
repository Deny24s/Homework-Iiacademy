package com.company;

import java.util.Arrays;

public class ShakeSort {

    public void sortShake(){
        int number[]={90,80,70,50,60,100};
        System.out.println(Arrays.toString(number));
        int left=1,right=number.length-1;
        do {
            for (int i = right; i >= left; i--) {
                if (number[i - 1] > number[i]) {
                    int temp = number[i];
                    number[i] = number[i - 1];
                    number[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (number[i - 1] > number[i]) {
                    int temp = number[i];
                    number[i] = number[i - 1];
                    number[i - 1] = temp;
                }
            }
            right--;
        }while (left<=right);
        System.out.println(Arrays.toString(number));
    }



}
