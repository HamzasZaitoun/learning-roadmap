
import Generics.GenericList;
import Generics.List;
import collections.CollectionsDemo;
import collections.ListDemo;
import collections.MapDemo;
import collections.SetDemo;
import concurrency.ThreadDemo;
import exceptions.Account;
import exceptions.exceptionDemo;
import executors.CompletableFutureDemo;
import executors.ExecutorDemo;
import executors.MailService;
import lambdas.LambasDemo;
import streams.StreamsDemo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        var service = new MailService();
        service.sendAsync();
        System.out.println("hello world");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}