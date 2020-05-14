package com.company;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainWithRegex {
    public static void main(String[] args) {
/*
    Т к в техническом задании) не было написано о подробной реализации, то сделал 2 варианта:
    1-ый - ищет совпадения с учетом регистра, т е к примеру "Я" большое и "я" маленькое отдельно
    2-ой (класс MainWithLambda) ищет без учета регистра - "я" независимо от регистра по всему тексту
    пусть "клиент" выберет какая из реализаций ему больше нравится))
 */
        ISearchEngine regexEasySearch=new ISearchEngine() {
            @Override
            public int search(String text, String word) {
                int count=0;
                Pattern pattern=Pattern.compile( "\\s" + word + "\\s");
                Matcher matcher=pattern.matcher( text );
                while (matcher.find()){
                    count++;
                }
                return count;
            }
        };

        Scanner scanner=new Scanner(System.in  );
        System.out.println( "Определите слово для поиска (для выхода введите - quit/QUIT): " );
        while (1==1) {
            String input = scanner.nextLine();
            if(input.toLowerCase().equals( "quit" )) break;
            System.out.println( "Слово: " + input + " в файле встретилось: " + regexEasySearch.search( readAllBytesJava(), input ) + " раз(а)");
        }
    }


    private static String readAllBytesJava() {
        String filePath="/Users/denissamsonenko/IdeaProjects/Homework/Homework 9/War&Peace/Война и мир.txt";
        String content=" ";
        try{
            content=new String( Files.readAllBytes( Paths.get(filePath) ));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return  content.replaceAll( "\\p{Punct}", " "  );
    }
}