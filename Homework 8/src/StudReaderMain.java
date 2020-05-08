import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class StudReaderMain {

    public static void main(String[] args) throws IOException {
        List<Student> list=null;
        try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream( "student.txt" ) )) {
        list= (ArrayList<Student>) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        Collections.sort( list, Comparator.comparing( Student::toString ) );

        FileWriter fw=new FileWriter( "student1.txt" );
        for (Student sortfin:list){
//            System.out.println(sortfin + "\n");
            fw.write( sortfin + "\n" );
        }
        fw.flush();
        fw.close();
    }
}
