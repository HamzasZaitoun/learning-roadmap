package collections;

import java.util.*;

public class SetDemo {

    public static void show()
    {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("A");
        set.add("A");
        System.out.println(set);


        ///
        Collection<String> collection=new ArrayList<>();
        Collections.addAll(collection,"A","A","B","A","C");
        Set<String> set2 = new HashSet<>(collection);


        ///
        Set<String> set3 = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> set4 = new HashSet<>(Arrays.asList("D","E","F"));

        set3.addAll(set4);
        set3.retainAll(set4);
        set3.removeAll(set4);


    }
}
