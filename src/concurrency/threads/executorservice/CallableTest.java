package concurrency.threads.executorservice;


import java.math.BigInteger;
import java.util.concurrent.*;

//Illustrates how Callable, Executor, ExecutorService a Future are related;
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        //create an ExecutorService with a fixed thread of pool consisting of one thread
        ExecutorService es = Executors.newSingleThreadExecutor();

        //submit the Callable task (asynchronously) to the executor service
        //and store the Future object
        Future<Integer> future = es.submit(() ->increaseTime()); // V call()

        //get will block the Future object. In this case for 2 seconds.
        //If increaseTime does not return nothing in 2 seconds, then future will proceed without the response
        System.out.println(future.get(2, TimeUnit.SECONDS));

        //shutdomn the executor otherwise this application will never terminate
        //existing tasks will be allowed to complete but no new tasks accepted
        es.shutdown();

    }

    static Integer increaseTime() {
        for (BigInteger bi = BigInteger.valueOf(500);
             bi.compareTo(BigInteger.ZERO) > 0;
             bi = bi.subtract(BigInteger.ONE)) {

            System.out.println(bi);
        }
        return 8;
    }
}
