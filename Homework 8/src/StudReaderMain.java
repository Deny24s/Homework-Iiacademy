import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class StudReaderMain {

    public static void main(String[] args) throws IOException {
        List<Student> list2=new ArrayList<>(  );
        try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream( "student.bin" ) )) {
        list2=(List <Student>)ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        list2.sort( Comparator.comparing( Student::getName ) );

        FileWriter fw=new FileWriter( "student1.txt" );
        for (Student journal:list2){
//            System.out.println(journal + "\n");
            fw.write( "Имя: "+journal.getName() + " айди: "+journal.getId()+ "\n" );
        }
        fw.flush();
        fw.close();
    }
}
