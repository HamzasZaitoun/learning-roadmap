package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show()
    {
        List<String> list   = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add(1,"a");
        list.set(0,"A+");
        list.remove(3);
        System.out.println(list.indexOf("A"));
        System.out.println(list.lastIndexOf("A"));
        System.out.println(list.subList(0,2));
    }
}
