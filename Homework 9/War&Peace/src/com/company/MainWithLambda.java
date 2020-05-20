package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainWithLambda {
    public static void main(String[] args) {
        ISearchEngine searchWithLambda = (text, word) -> {
            int count = 0;
            Pattern pattern = Pattern.compile( "\\s" + word + "\\s" );
//            если искать любое совпадение использовать (word)
            Matcher matcher = pattern.matcher( text );
            while (matcher.find()) {
                count++;
            }
            return count;
        };
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Определите слово для поиска (для выхода введите - quit/QUIT): " );
        while (1 == 1) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals( "quit" )) {
                System.out.println("Thank you Bro :-*");
                break;
            }

            System.out.println( "Слово: " + "\"" + input + "\"" + " в файле встретилось: " +
                    searchWithLambda.search( readAllBytesJava(), input ) + " раз(а)" );
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
            return  content.toLowerCase().replaceAll( "\\p{Punct}]", " "  );
        }
}