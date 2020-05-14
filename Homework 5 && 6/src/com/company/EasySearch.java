package com.company;

public class EasySearch implements ISearchEngine {
    private String war= " война ";
    private String peace=" мир ";
    private String union=" и ";

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
    public int search(String text , String word) {
        int count=0;
        int index=text.indexOf( word );
        while (index!=-1) {
            index = text.indexOf( word,index+1 );
            count++;
        }
        return count;
    }
}

