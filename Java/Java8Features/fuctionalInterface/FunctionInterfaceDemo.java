package Java8Features.fuctionalInterface;

interface Runner{
    void run();
}
class BaseballPlayer implements Runner {

    @Override
    public void run() {
        System.out.println("Running");
    }
}
public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        BaseballPlayer player = new BaseballPlayer();
        player.run();

    }
}
/*
  A functional Interface ia an interface that has single abstract method .
  A functional interface can have any number of default methods or static methods
  interface Runner {
    void run();
}


 */
