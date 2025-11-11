import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {

//        String filePath="test.txt";
//        try {
//            FileInputStream fileStream= new FileInputStream(filePath);
////            byte[] dbytes = new byte[filesStream.available()];
////            int read  = fileStream.read(dbytes);
//            System.out.println((char)fileStream.read());
//            System.out.println(fileStream.read());
//            System.out.println(fileStream.read());
//            System.out.println(fileStream.read());
//            System.out.println((char)fileStream.read());
//            System.out.println((char)fileStream.read());
//        } catch (FileNotFoundException e) {
//            System.out.println("file not found (system message):- "+e.getMessage());
//            e.printStackTrace();
//        }  catch (IOException e) {
//            System.out.println("error occured while reading file :- "+e.getMessage());
//            e.printStackTrace();
//        }
         try (FileInputStream inputStream = new FileInputStream("employee3.png"))
         {

             byte[] b = new byte[inputStream.available()];
             inputStream.read(b);

             FileOutputStream outputStream= new FileOutputStream("new_image.jpg");
             outputStream.write(b);
             outputStream.flush();
             outputStream.close();

         } catch (Exception e) {
             throw new RuntimeException(e);
         }

    }
}
