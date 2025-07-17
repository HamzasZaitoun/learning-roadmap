package exceptions;

public class insufficientFundsException extends Exception{


    public insufficientFundsException()
    {
        super("insufficent funds in your account!!");
    }

    public insufficientFundsException(String message)
    {
        super(message);
    }
}
