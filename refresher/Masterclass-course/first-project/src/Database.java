public interface Database {

/// variables in interfaces
public static final String name ="Hamza"; // public static final is automatically added in interfaces variables, even if they're not written!
    



     void connect();
     void dissconnect();
     void select(String query);
     void deleteByID(int id);



    /// default methods!! came up with Java 8, do not use.
     default void print()
     {
         System.out.println("Hi");
     }
}
