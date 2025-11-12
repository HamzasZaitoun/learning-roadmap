import java.io.*;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) throws IOException {

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
//         try (FileInputStream inputStream = new FileInputStream("employee3.png"))
//         {
//
//             byte[] b = new byte[inputStream.available()];
//             inputStream.read(b);
//
//             FileOutputStream outputStream= new FileOutputStream("new_image.jpg");
//             outputStream.write(b);
//             outputStream.flush();
//             outputStream.close();
//
//         } catch (Exception e) {
//             throw new RuntimeException(e);
//         }

//        File folder = new File("myFolder");
//        File file = new File("MyFolder\\users.txt");
//        if(folder.exists())
//        {
//            System.out.println("folder exists");
//            if(!file.exists())
//            {
//                if(file.createNewFile())
//                {
//                    System.out.println("file created succefully");
//                }
//            }
//
//        }else {
//            System.out.println("folder is not there");
//            if(folder.mkdir())
//            {
//                System.out.println("my folder created succefully!!");
//            }
//        }
//
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        if(file.exists()&&folder.exists()) {
//            file.delete();
//            folder.delete();
//        }
//
//
//        if(folder.exists()){
//            Arrays.asList(folder.list())
//                    .forEach(System.out::println);
//
//        }

//        String path = "myFolder\\file.txt";
//        FileOutputStream outputStream = new FileOutputStream(path);
//        outputStream.write((char)104);
//        outputStream.write((char)97);
//        outputStream.write((char)109);
//        outputStream.write((char)122);
//        outputStream.write((char)97);
//        outputStream.flush();
//        outputStream.close();

        String path = "myFolder\\file.txt";

//        FileWriter fileWriter = new FileWriter(path, true);
//        fileWriter.write("hi there, im \n");
//        fileWriter.write("hi there, im hamza Zaitoun");
//        fileWriter.flush();


//        BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(path));
//        bufferedWriter.write(98);
//        bufferedWriter.write('h');
//        bufferedWriter.write("HI");
//        bufferedWriter.write("fu");
//        bufferedWriter.flush();
//        bufferedWriter.close();
//
//        BufferedReader reader = new BufferedReader(new FileReader(path));



        PrintWriter writer = new PrintWriter(path);
        writer.println("java mastery ");
        writer.println("hi ");
        writer.println(98);
        writer.println(true);
        writer.println('h');
        writer.flush();
        writer.close();



    }
}