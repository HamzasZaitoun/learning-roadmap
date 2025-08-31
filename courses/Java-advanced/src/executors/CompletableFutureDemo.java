package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {
   public static int toFahrenheit(int celsius)
   {
      return (int) (celsius*1.8)+32;
   }
   public static CompletableFuture<String> getUserEmailAsync()
   {
       return CompletableFuture.supplyAsync(()->"email");
   }
   public static CompletableFuture<String> getPlaylistAsync(String email)
   {
       return  CompletableFuture.supplyAsync(()->"playlist");
   }



public static void show()
{
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




//   var future =  CompletableFuture.supplyAsync(()->1);
//   future.thenAcceptAsync(result-> {
//      System.out.println(Thread.currentThread().getName());
//      System.out.println(result);
//   });




   // handling exceptions.
//   var future = CompletableFuture.supplyAsync(()->{
//      System.out.println("hello");
//      throw new IllegalStateException();
//   });
//    try {
//       System.out.println(future.exceptionally(ex->1).get());
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    } catch (ExecutionException e) {
//        throw new RuntimeException(e);
//    }


// transforming results!
//var future = CompletableFuture.supplyAsync(()->20);
//    future.thenApply(CompletableFutureDemo::toFahrenheit)
//           .thenAccept(f-> System.out.println(f));
//


    // composing completable futures.
//    getUserEmailAsync()
//    .thenCompose(CompletableFutureDemo::getPlaylistAsync)
//            .thenAccept(playlist-> System.out.println(playlist));

//    // combining completable features
//    var first = CompletableFuture.supplyAsync(()->"10USD")
//            .thenApply(str->
//            {var price = str.replace("USD","");
//           return Integer.parseInt(price);
//            });
//    var second = CompletableFuture.supplyAsync(()->0.9);
//    first.thenCombine(second,(price,exchangeRate)->price*exchangeRate)
//            .thenAccept(result-> System.out.println(result));



//    // waiting to many tasks
//    var first = CompletableFuture.supplyAsync(()->1);
//    var second = CompletableFuture.supplyAsync(()->2);
//    var third = CompletableFuture.supplyAsync(()->3);
//    var all = CompletableFuture.allOf(first,second,third);
//    all.thenRun(()-> {
//        Integer firstResult = null;
//        try {
//            firstResult = first.get();
//            System.out.println(firstResult);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("all tasks completed succefully");
//    });


//    // waiting for the first task.
//   var first = CompletableFuture.supplyAsync(()->{LongTask.simulate();return 20;});
//   var second= CompletableFuture.supplyAsync(()->20);
//   var fastest = CompletableFuture.anyOf(first,second)
//           .thenAccept(temp-> System.out.println(temp));


    // handling timeouts

    var future= CompletableFuture.supplyAsync(()->
    {
        LongTask.simulate();
        return 1;
    });
//    try {
//        var result = future.orTimeout(1, TimeUnit.SECONDS)
//                .get();
//        System.out.println(result);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    } catch (ExecutionException e) {
//        throw new RuntimeException(e);
//    }

//    try {
//        var result = future.completeOnTimeout(1,1, TimeUnit.SECONDS)
//                .get();
//        System.out.println(result);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    } catch (ExecutionException e) {
//        throw new RuntimeException(e);
//    }


    var service = new FlightService();
    service.getQuote("site1")
            .thenAccept(System.out::println);
    try {
        Thread.sleep(10_000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }


}
}



