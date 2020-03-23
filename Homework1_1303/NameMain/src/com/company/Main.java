package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введи имя:" );
        String name1="Vasia";
        String name2="Anastasia";

//       IF          ////////////////////////////////////////////////////////////////////////
//        int i=0;
//        while(i<3) {
//            name = in.nextLine();
//            i++;
//            if (name.equals(name1)) {
//                System.out.println("Привет \nЯ тебя так долго ждал");
//                continue;
//            }if (name.equals(name2)) {
//                System.out.println("Я тебя так долго ждал");
//                continue;
//            }if (name.equals(name)) {
//                System.out.println("Добрый день,а вы кто?");
//                continue;}

//       IF ELSE      //////////////////////////////////////////////////////////////////////
//        for (i=0;i<3;i++){
//            name = in.nextLine();
//            if (name.equals(name1)) {
//                System.out.println("Привет \nЯ тебя так долго ждал");
//            }else if (name.equals(name2)) {
//                System.out.println("Я тебя так долго ждал");
//            }else if (name.equals(name)) {
//                System.out.println("Добрый день,а вы кто?");
//            }
//        Switch/Case     ///////////////////////////////////////////////////////////////

        String name = in.nextLine();

            switch (name) {
                case "Vasia":
                    System.out.println("Привет \nЯ тебя так долго ждал");
                    break;
                case "Anastasia":
                    System.out.println("Я тебя так долго ждал");
                    break;
                default:
                    System.out.println("Добрый день,а вы кто?");
                    break;
            }
//////////////////////////////////////////////////////////////////////////////////////////
        }
            }


