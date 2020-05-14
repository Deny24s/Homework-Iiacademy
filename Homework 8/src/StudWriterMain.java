import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudWriterMain {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>(  );
        Random rnd=new Random(  );

        for (int i=0; i<100_000; i++){
        list.add( new Student( String.valueOf(rnd.nextInt()), String.valueOf( rnd.nextInt() ) ) );
        }
        try (ObjectOutputStream oos=new ObjectOutputStream( new FileOutputStream("student.bin") )){
            oos.writeObject( list);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(list  );
    }
}
