import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MainReg {
    private static final Pattern pattern=Pattern.compile( "(http|https)://(.+?\\.(\\w+))/.*" );

    private static Map<String, Long> urlWithoutSort (int group) throws IOException {
        Map<String, Long> withoutSort = Files.lines( Paths.get( "/Users/denissamsonenko/Downloads/Benign_list_big_final.csv" ) )
                .map( pattern::matcher )
                .filter( Matcher::matches )
                .map( m -> m.group( group ) )
                .collect( Collectors.groupingBy( i -> i,
                        LinkedHashMap::new,
                        Collectors.counting() ) );
        return withoutSort;
    }
        private static void topUrl (Map<String,Long> withoutSort) {
            withoutSort.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .limit( 10 )
                    .forEach( x-> System.out.println( "Value: " + x.getKey() + " is meeting: " + x.getValue() ) );
        }

    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner( System.in );
        
        System.out.println("Если вы хотите увидеть ТОП Протоколов доступа введите 1:");
        System.out.println("Если вы хотите увидеть ТОП Доменов введите 2:");
        System.out.println("Если вы хотите увидеть ТОП Доменов верхнего уровня  введите 3:");

            for (int i = 0; i <3 ; i++) {
                int group=Integer.parseInt( scanner.nextLine() );
                topUrl( urlWithoutSort( group ));
        }
    }
}
