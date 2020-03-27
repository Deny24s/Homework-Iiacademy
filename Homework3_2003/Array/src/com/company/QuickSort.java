package com.company;

public class QuickSort {

    public int[] sortQuick(int nums[],int start,int end) {
        if (start>=end) return nums;
        int i=start;
        int j=end;
        int op=i-(i-j)/2;
        while (i<j){
            while ((i<op)&&(nums[i]<=nums[op])) i++;
            while ((j>op)&&(nums[j]>=nums[op]))j--;
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            if(i==op)op=j;
            else if(j==op)op=i;}
        }
        sortQuick(nums,start,op);
        sortQuick(nums,op+1,end);
        return nums;
    }
}