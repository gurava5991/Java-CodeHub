package generics;
class Utility{
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
public class GenricMethodExample {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1 , 5 , 6};
        String[] strs = new String[]{"A" , "B" , "C"};
        Utility.printArray(arr);
        Utility.printArray(strs);

    }
}
