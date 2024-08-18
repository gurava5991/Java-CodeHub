package Java8Features.lambdaExpression;

public class LambdaExpressionExampleOnThread {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is Running");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = () ->{
            System.out.println("Thread2 is running");
        };
        Thread t2 = new Thread(r2);
        t2.start();
        Thread t3 = new Thread(() ->{
            System.out.println("Thread3 is running");
        });
        t3.start();
    }
}
