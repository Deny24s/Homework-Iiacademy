package com.company;

import java.math.BigInteger;

public class MultiTable {

    public void table(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i*j+"\t" );//поломать голову и вывести как в школе
            }
            System.out.println();
             }
    }
    public void table1N(int n){
        long m=1l;
        for (int k = 1; k <=n ; k++) {
            m=m*k; }
        System.out.println("Результат перемножения равен : "+m); }

        public void tableMM(int a) {
        int m=1;
        while (a > 0) {
                int l = a % 10;
                a /= 10;
                m=m*l;
            }
            System.out.println("Результат перемножения всех цифр числа= "+ m);
        }

}
