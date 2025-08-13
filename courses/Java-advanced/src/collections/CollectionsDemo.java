package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {


    public static void show()
    {
        Collection<String> collection  = new ArrayList<>();
         collection.add("a");
         collection.add("b");
         collection.add("c");
         collection.clear();
        Collections.addAll(collection,"A","B","C");
        System.out.println(collection);
    }
}
