package Java8Features.methodReference;

public class MethodReferenceInThread {
    static void runStatus(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(MethodReferenceInThread::runStatus);
        t1.start();
    }
}
