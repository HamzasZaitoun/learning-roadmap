package executors;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send()
    {

        LongTask.simulate();
        System.out.println("mail sent!");
    }
    public CompletableFuture<Void> sendAsync()
    {
        return CompletableFuture.runAsync(this::send);
    }
}
