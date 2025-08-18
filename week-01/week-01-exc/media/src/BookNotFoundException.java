public class BookNotFoundException extends Exception{

    public BookNotFoundException(String message)
    {
        super(message);
    }

    // for exception chaining 
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
