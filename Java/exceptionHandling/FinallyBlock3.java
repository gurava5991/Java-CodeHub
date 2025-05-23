package exceptionHandling;

public class FinallyBlock3 {
    public static void main(String[] args) {
        try{
            throw new NullPointerException("Null Pointer Exception");
        }
        catch (NullPointerException e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("after finally block");
    }
}
/*
In this example , we are executing the finally block with handling the exception in catch block.
 */

