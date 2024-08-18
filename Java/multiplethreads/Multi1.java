package multiplethreads;

public class Multi1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(
                () ->{
                    for(int i = 1 ; i <= 10 ; i++)
                        System.out.println("t1 " + i);
                }
        );

        Thread t2 = new Thread(()->{
            for(int i = 11 ; i <= 20 ; i++){
                System.out.println("t2 " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
