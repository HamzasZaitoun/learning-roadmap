import java.util.ArrayList;
import java.util.List;

public class Utils <Type>{

    private  List<Type> names=new ArrayList<>();

    public static  <T>  void printArray(T[] array)
    {
        for (T item:array)
        {
            System.out.println(item);
        }
    }

    public static <T> T get(T type)
    {
        return type;
    }
    public  void add(Type item)
    {
        names.add(item);
    }
    public  List<Type> getNames()
    {
        return names;
    }
}
