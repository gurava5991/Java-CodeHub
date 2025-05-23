package collectionframework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }

        //using normal loop
        for(int i = 0 ; i < arr.length ;){
            System.out.println(arr[i]);
        }

    }
}
