package multiplethreads;

public class ThreadSleepExample {
    public static void main(String[] args) throws Exception{
        // Create and start the first thread
        Thread thread1 = new Thread(new MyRunnable("Thread-1", 1000));
        // Create and start the second thread
        Thread thread2 = new Thread(new MyRunnable("Thread-2", 1500));
        thread1.start();
        thread2.start();
        thread1.join();
        Thread.sleep(1000);
        thread2.join();
        System.out.println("main thread");
    }
}

class MyRunnable implements Runnable {
    private String threadName;
    private int sleepTime;

    MyRunnable(String threadName, int sleepTime) {
        this.threadName = threadName;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": Iteration " + i);
            try {
                // Pause execution for the specified sleep time
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted!");
            }
        }

    }
}

