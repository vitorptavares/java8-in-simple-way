package concurrency.threads;

public class SleepAndJoinThreadExample implements Runnable{

String [] timeStr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nive"};

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(timeStr[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new SleepAndJoinThreadExample());
        t.start();
        //join metodo will hold the thread execution of the current thread where join method is being declared,
        //in this case it´s the main thread.
        //Once the previous thread finish executing, this thread will be release
        t.join();
        System.out.println("Bomm...");
    }

}
