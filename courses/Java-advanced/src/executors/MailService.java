package executors;

import java.util.concurrent.CompletableFuture;


public class MailService {
    public void send()
    {
        // any time we have to touch the file system or the network, we should not run the operation on the main thread!
        LongTask.simulate();
        System.out.println("mail sent!");
    }
    public CompletableFuture<Void> sendAsync()
    {
        return CompletableFuture.runAsync(this::send);
    }
}