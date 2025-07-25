# java-advanced Course

# 1 - Java Exceptions 

* Types of excpetions  
  - Checked : 
    * checked by compiler, should be anticipated and handled properly.

  
  - Unchecked (RUNTIME) :
     * Runtime exceptions (nullpointer, artithmeticExceptions, IllegalArugumentException, IndexOutOfBound, IllegalState)
  

  - Error: external errers to app (StackOverflow)


* Exceptions Hierarchy  
  -  Throwable 
  -  Exception      - Error
  -  RunTimeException
     
      - Throwable is the superclass of everything that can be thrown in Java.

*  Exception Handling:

🔹 1. Try-Catch Block
   Used to handle checked exceptions (like IOException) and unchecked exceptions (like NullPointerException).
    Syntax:

    try {
    // code that might throw an exception
    } catch (ExceptionType name) {
    // code to handle the exception
    }
🔹 2. Throwing Checked Exceptions
A method that might throw a checked exception must declare it using throws.

    
    public static void show() throws IOException {
    var account = new Account();
    
        try {
            account.withdraw(10); // might throw AccountException
        } catch (AccountException e) {
            System.out.println(e.getCause());
        }
    }
🔹 3. Finally Block
Always executed whether an exception is thrown or not.

Used to release external resources (e.g., files, DB connections).

    try {
    // risky code
    } catch (Exception e) {
    // handle it
    } finally {
    // cleanup logic
    }
🔹 4. Try-With-Resources (✨ Important addition) Introduced in Java 7.

Used to automatically close resources like files, sockets, scanners that implement AutoCloseable.

No need to explicitly call .close() in a finally block.

Example:

    try (FileReader reader = new FileReader("data.txt")) {
    int data = reader.read();
    while (data != -1) {
    System.out.print((char) data);
    data = reader.read();
    }
    } catch (IOException e) {
    e.printStackTrace();
    }
💡 The FileReader is automatically closed when the try block finishes—even if an exception is thrown.

🔹5. Throwing exceptions
    
    public void deposit(float value) throws IOException
    {
    if(value<=0)
    throw new IOException("should be more than zer");
    }

* re-trhowing Exceptions
    
        public static void show() throws IOException 
        {
        try{
        account.deposit(1000);
        }catch (IOException e)
        {
        System.out.println("logging");
        throw e;
        }
        }


* Chaining Exception: 

  - wrapping an exception inside another exception 

        public AccountException(Exception cause)
        {
        super(cause);
        }


          public void withdraw(float value) throws AccountException
          {
          throw new AccountException(new insufficientFundsException());
        
          }