package com.company;

public class Main {

    public static void main(String[] args)  {
        EasySearch easySearch=new EasySearch();
        ReadBytes readBytes=new ReadBytes();
        String text=readBytes.readAllBytesJava();

        System.out.println(easySearch.search( text,easySearch.getPeace() ));
        System.out.println(easySearch.search( text,easySearch.getUnion() ));
        System.out.println(easySearch.search( text,easySearch.getWar() ));
    }
}
