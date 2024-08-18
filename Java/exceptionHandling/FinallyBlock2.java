package exceptionHandling;

public class FinallyBlock2 {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println("finally block is always executed");
        }
    }
}
/*
In this example , we are executing the finally block without handling the exception in catch block
 */
