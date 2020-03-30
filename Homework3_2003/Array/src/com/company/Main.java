package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        SimpleArray simpleArray=new SimpleArray();
//        simpleArray.massiv1(); //вывод через for
//        simpleArray.massiv2(); //вывод foreach
//        simpleArray.massiv3(); //вывод while
//        simpleArray.massiv4(); //вывод do while
//        simpleArray.massiv5(); //вывод каждый второй элемент

        KindsOfSort kindsOfSort=new KindsOfSort();
//          int num []={0,1,2,3,4,5,6,7,8,9};
//          int num1 []={0,1,2,3,4,5,6,7,8,0};
//          int num2 []={0,1,2,3,5,5,5,7,8,0};
//          int num3 []={1,1,1,1,1,1,1,1,1,0};
//        System.out.println(Arrays.toString(num2));
//        System.out.println(Arrays.toString(kindsOfSort.quickSort(num1,0,num1.length-1)));
//        System.out.println(Arrays.toString(kindsOfSort.shakeSort(num1)));
//        System.out.println(Arrays.toString(kindsOfSort.mergeSort(num1)));
//        System.out.println(Arrays.toString(kindsOfSort.bubbleSort(num2)));
//        System.out.println(Arrays.toString(kindsOfSort.selectionSort(num1)));
//        System.out.println(Arrays.toString(kindsOfSort.insertSort(num2)));

        FinishArray finishArray=new FinishArray();
        kindsOfSort.removeDuplicates(finishArray.sortArr());






    }
}
