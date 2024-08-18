package exceptionHandling;

public class TryCatchExample1 {
    public static void main(String[] args) {
        try{
            int a = 50 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}
