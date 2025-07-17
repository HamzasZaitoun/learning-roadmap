
import exceptions.Account;
import exceptions.exceptionDemo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        var account = new Account();
        try{
            account.withdraw(10);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}