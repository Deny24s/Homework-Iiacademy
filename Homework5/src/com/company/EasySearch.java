package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearch implements ISearchEngine {
    private String war= "война";
    private String peace="мир ";
    private String union=" и ";


    public String readAllBytesJava() {
        String filePath="/Users/denissamsonenko/IdeaProjects/Homework/Homework5/Война и мир.txt";
        String content="";
        try{
            content=new String( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }


    public String getWar() {
        return war;
    }

    public String getPeace() {
        return peace;
    }

    public String getUnion() {
        return union;
    }

    @Override
    public int search(String text, String word) {
        text=text.toLowerCase();
        int count=0;
        int index=text.indexOf( word );
        while (index!=-1) {
            index = text.indexOf( word,index+1 );
            count++;
        }
        return count;
    }
}

