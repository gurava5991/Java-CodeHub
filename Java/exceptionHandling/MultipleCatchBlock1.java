package exceptionHandling;

public class MultipleCatchBlock1 {
    public static void main(String[] args) {
        try{
            int[] arr = {1 , 2 , 3 , 4 , 5};
            arr[8] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
/*
In this example, try block contains two exceptions.
But at a time only one exception occurs and its corresponding catch block is executed.
 */
