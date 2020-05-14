package Mapa;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        EasySearch easySearch = new EasySearch();
        String[] text = easySearch.readAllBytesJava().split( " " );

        Map<String, Integer> data = new HashMap<>();
        for (String word : text) {
//            data.put( word, data.getOrDefault(word,0 ) +1 );
            if (data.containsKey( word )) {
                data.put( word, data.get( word ) + 1 );
            } else {
                data.put( word, 1 );
            }
        }
//        for (Map.Entry<String, Integer> entry : data.entrySet()) {
//                System.out.println( entry.getKey() + "=" + entry.getValue() );
//        }

        List<Map.Entry<String,Integer>> sort=new ArrayList<>(data.entrySet());
        Collections.sort( sort, new SortValue() );
 
        System.out.println("10 Слов: ");
        /*
        если взять индекс 0, то выдает пробелы за слова
         */
        for (int i=1; i<=10; i++){
            System.out.println(sort.get( i ));
        }

    }
}
