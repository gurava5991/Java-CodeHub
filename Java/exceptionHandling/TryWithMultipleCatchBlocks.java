package exceptionHandling;

public class TryWithMultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] nums = new int[5];
            nums[6] = 1;
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
}
