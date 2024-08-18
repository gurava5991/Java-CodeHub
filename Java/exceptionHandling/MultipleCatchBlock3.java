package exceptionHandling;

public class MultipleCatchBlock3 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e){
            System.out.println(e.toString());
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
/*
Let's see an example, to handle the exception without maintaining the order of exceptions (i.e. from most specific to most general).
 */
