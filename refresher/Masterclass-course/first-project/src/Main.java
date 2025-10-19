import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {



//        Login login = new Login();

//        Player player = new Player("Hamza","10%",100);
//        player.printDetails();


//        try {
//            FileInputStream file = new FileInputStream("email.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter username: ");
//        String username=scanner.next();
//        System.out.println("password: ");
//        String password = scanner.next();
////        logiValidation(username,password);


//        User user = new User("Hamza","Hamza@gail.com","079252525",new String[]{"Amman, Jordan","Salalah, Oman"} );
//        System.out.println(user);

        int[] arr1 = new int[4];
//        int arr2[] = new int[10];
        arr1[0]=12;

        System.out.println(Arrays.toString(arr1));


    }
    public static void logiValidation(String name, String password) throws userLoginCustomException
    {
        if(!name.equals("admin")||!password.equals("123"))
        {
//            System.out.println("username or password are not valid!");
            throw new userLoginCustomException("user name or password are not correct",ErrorCodes.USERNAME_PASSWORD_ERROR_CODE);
//            return;
        }
        System.out.println("welcome back");
    }
}