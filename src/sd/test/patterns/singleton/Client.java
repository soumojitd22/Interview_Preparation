package sd.test.patterns.singleton;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(SingletonObject.getInstance().hashCode());
        System.out.println(SingletonObject.getInstance().hashCode());
        System.out.println(SingletonObject.getInstance().hashCode());
        System.out.println(SingletonObject.getInstance().hashCode());

        CompletableFuture.allOf(CompletableFuture.runAsync(() -> System.out.println(SingletonObject.getInstance().hashCode())),
                CompletableFuture.runAsync(() -> System.out.println(SingletonObject.getInstance().hashCode())),
                CompletableFuture.runAsync(() -> System.out.println(SingletonObject.getInstance().hashCode())),
                CompletableFuture.runAsync(() -> System.out.println(SingletonObject.getInstance().hashCode())))
                .get();



    }
}
