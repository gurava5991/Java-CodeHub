package exceptionHandling;

public class Finallyblock1 {
    public static void main(String[] args) {
        try{
            System.out.println(25/5);
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
In this example we are executing the finally block without exception occured in try block.
 */
