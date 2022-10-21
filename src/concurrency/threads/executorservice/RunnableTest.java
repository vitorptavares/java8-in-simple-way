package concurrency.threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTest {

    public static void main(String[] args) {


        //Create a threadExecutor with a pool composed by just one thread
        ExecutorService es = Executors.newSingleThreadExecutor();

        //execute asynchronously void run()
        es.execute(()-> System.out.println("Runnable Example1"));
        //shutdomn the executor otherwise this application will never terminate
        //existing tasks will be allowed to complete but no new tasks accepted
        es.shutdown();
    }
}
