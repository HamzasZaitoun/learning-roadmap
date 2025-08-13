package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show()
    {
        var c1 = new Customer("a","e1");
        var c2 = new Customer("b","e1");
        var c3 = new Customer("unkown","unkown");
        Map<String,Customer> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.get("e1");
        map.getOrDefault("eq",c3);
        var exists= map.containsKey("e1");
        map.replace("e1",new Customer("e++","email"));
        System.out.println(     map.get("e1"));
    }
}
