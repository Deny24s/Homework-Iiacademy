package com.company;

import java.util.Arrays;

public class MergeSort {

    public void  mergeSort(int[] A) {    //from https://habr.com/ru/sandbox/127714/
        if (A.length < 2) {
            return;
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
        mergeSort(leftarray);
        mergeSort(rightarray);
        merge(A, leftarray, rightarray, mid, A.length - mid);

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
}