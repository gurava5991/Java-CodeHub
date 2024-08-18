package exceptionHandling;

public class MultipleCatchBlock2 {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
/*
In this example, we generate NullPointerException, but didn't provide the corresponding exception type.
In such case, the catch block containing the parent exception class Exception will invoked.
 */
