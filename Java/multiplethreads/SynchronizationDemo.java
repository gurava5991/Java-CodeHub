package multiplethreads;

public class SynchronizationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw("Thread-1", 6000), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw("Thread-2", 6000), "Thread-2");

        t1.start();
        t2.start();
    }
}
