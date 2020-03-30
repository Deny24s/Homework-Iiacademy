package com.company;

import java.util.Arrays;

public class KindsOfSort {

    public int[] quickSort(int nums[], int start, int end) { // Квиксорт
        if (start >= end) return nums;
        int i = start;
        int j = end;
        int op = i - (i - j) / 2;
        while (i < j) {
            while ((i < op) && (nums[i] <= nums[op])) i++;
            while ((j > op) && (nums[j] >= nums[op])) j--;
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                if (i == op) op = j;
                else if (j == op) op = i;
            }
        }
        quickSort( nums, start, op );
        quickSort( nums, op + 1, end );
        return nums;
    }


    public int[] shakeSort(int[] number) {     //Шейкерная сортировка
        int left = 1, right = number.length - 1;
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
        } while (left <= right);
        return number;
    }

    public int[] mergeSort(int[] A) {    //from https://habr.com/ru/sandbox/127714/  Сортировка слиянием
        if (A.length < 2) {
            return A;
        }
        int mid = A.length / 2;
        int[] leftarray = new int[mid];
        int[] rightarray = new int[A.length - mid];

        for (int i = 0; i < mid; i++) {
            leftarray[i] = A[i];
        }
        for (int i = mid; i < A.length; i++) {
            rightarray[i - mid] = A[i];
        }
        mergeSort( leftarray );
        mergeSort( rightarray );
        merge( A, leftarray, rightarray, mid, A.length - mid );

        return A;
    }

    private void merge(int[] A, int[] leftarray, int[] rightarray, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftarray[i] <= rightarray[j]) {
                A[k++] = leftarray[i++];
            } else {
                A[k++] = rightarray[j++];
            }
        }
        while (i < left) {
            A[k++] = leftarray[i++];
        }
        while (j < right) {
            A[k++] = rightarray[j++];
        }
    }

    public int[] bubbleSort(int[] number) {          //Пузырьковая сортировка
        for (int i = number.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
        return number;
    }


    public int[] selectionSort(int[] number) {               //сортировка выбором
        for (int i = 0; i < number.length; i++) {
            int minVal = number[i];
            int minIndex = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] < minVal) {
                    minVal = number[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = number[i];
                number[i] = number[minIndex];
                number[minIndex] = temp;
            }
        }
        return number;
    }

    public int[] insertSort(int[] number) {                 //Сортировка вставками
        for (int i = 0; i < number.length; i++) {
            int index = i;
            int temp = number[i];
            while (index > 0 && number[index - 1] >= temp) {
                number[index] = number[index - 1];
                index--;
            }
            number[index] = temp;
        }
        return number;
    }

    public void removeDuplicates(int[] array) {
        int unique = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                unique++; //Если текущий с предыдущим не равны - значит
                // увеличиваем счетчик уникальных значений
            }
        }
        int[] result = new int[unique]; //Новый массив нужного размера
        int k = 0; //Текущая позиция в новом массиве
        if (result.length > 0) {
            result[k++] = array[0]; //Пишем в новый массив первое уникальное значение
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                result[k++] = array[i]; //Пишем в новый массив остальные уникальные значения
            }
        }
        System.out.println("Массив с удаленными дубликатами: " + Arrays.toString( result ));
    }
}