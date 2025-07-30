package Generics;

public class Utils {

     public static<T extends Comparable<T>> T max(T first, T seocnd)
    {
        return (first.compareTo(seocnd)<0)?seocnd:first;
    }

    public static <K,V> void print(K key, V value)
    {
        System.out.println(key + " = " + value);
    }
    public static void printUser(User user)
    {
        System.out.println(user);
    }
    public static void printUsers(GenericList<? extends User> users)
    {

    }
    public static void addUsers(GenericList<? super User> users)
    {

    }
}
