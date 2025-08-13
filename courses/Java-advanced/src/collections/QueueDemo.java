package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void show()
    {
        Queue<String> queue=new ArrayDeque<>();
        queue.add("A");
        queue.add("c");
        queue.add("b");
        queue.offer("d");
        var front =queue.peek();
        var front1 =queue.element();
        var front3 =queue.remove();
        var front4 =queue.poll();



    }
}
