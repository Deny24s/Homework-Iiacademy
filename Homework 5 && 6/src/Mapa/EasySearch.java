package Mapa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearch  {

    public String readAllBytesJava() {
        String filePath="/Users/denissamsonenko/IdeaProjects/Homework/Homework 5 && 6/Война и мир.txt";
        String content="";
        try{
            content=new String( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }


}

