package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFutureDemo {
public static void show()
{
   var future =  CompletableFuture.supplyAsync(()->1);


}
}



////    Runtime.getRuntime().availableProcessors();
////    ForkJoinPool.commonPool()
//// Runnable task = () -> System.out.println("y");
////  var future =  CompletableFuture.runAsync(task);
//Supplier<Integer> task = () -> 1;
//var future =  CompletableFuture.supplyAsync(task);
//    try {
//var result =  future.get();
//        System.out.println(result);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    } catch (ExecutionException e) {
//        throw new RuntimeException(e);
//    }