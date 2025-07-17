package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exceptionDemo {



    public static void show() throws IOException
    {
        var account = new Account();

        try {
            account.withdraw(10);
        }catch (AccountException e)
        {
            System.out.println(e.getCause());
//            System.out.println(e.getMessage());
        }

    }
    public static void sayHello(String name)
    {
        System.out.println(name.toUpperCase());
    }


}
//try{
//        account.deposit(1000);
//        }catch (IOException e)
//        {
//        System.out.println("logging");
//            throw e;
//        }