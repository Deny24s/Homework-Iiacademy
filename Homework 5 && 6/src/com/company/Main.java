package com.company;

public class Main {

    public static void main(String[] args)  {
        EasySearch easySearch=new EasySearch();

        System.out.println(easySearch.search( easySearch.readAllBytesJava(),easySearch.getPeace() ));
        System.out.println(easySearch.search( easySearch.readAllBytesJava(),easySearch.getUnion() ));
        System.out.println(easySearch.search( easySearch.readAllBytesJava(),easySearch.getWar() ));

    }
}
