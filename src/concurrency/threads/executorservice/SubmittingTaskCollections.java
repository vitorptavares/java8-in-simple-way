package concurrency.threads.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SubmittingTaskCollections {

    private static ExecutorService es = Executors.newSingleThreadExecutor();
    private static List<Callable<String>> callables = new ArrayList<>();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callables.add(() ->  "A");
        callables.add(() ->  "B");
        callables.add(() ->  "C");
        callables.add(() ->  "D");

        //invokAny();
        invokAll();

    }

    public static void invokAny() throws ExecutionException, InterruptedException {
        //invokeAny will execute synchronously and returns when ONE of the tasks is completed,
        //all others are canceled.
        // NOTE single thread will always execute the first task submitted.

        String result = es.invokeAny(callables);
        es.shutdown();
        System.out.println(result);
        System.out.println("Always at the end");
    }

    public static void invokAll() throws InterruptedException, ExecutionException {
        //invokeAll will execute synchronously and will return only when all tasks are completed.
        //the order in the result wil be maintained
        List<Future<String>> results = es.invokeAll(callables);
        es.shutdown();
        for (Future<String> future :
                results) {
            System.out.println(future.get());
        }

        System.out.println("Always at the end");
    }
}
