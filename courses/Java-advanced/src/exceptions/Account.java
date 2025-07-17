package exceptions;

import java.io.IOException;

public class Account {

    private float balance;

    public void deposit(float value) throws IOException
    {
        if(value<=0)
            throw new IOException("should be more than zer");
    }
    public void withdraw(float value) throws AccountException
    {
       throw new AccountException(new insufficientFundsException());

    }
}
