package multiplethreads;

public class Multi extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i <= 10; i++){
            System.out.println("Child Thread" + i);
        }
    }

    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();

        for (int i = 10; i < 20; i++) {
            System.out.println("Main Thread" + i);
        }
    }
}
