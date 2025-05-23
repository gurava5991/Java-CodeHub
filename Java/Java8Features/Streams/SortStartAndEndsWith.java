package Java8Features.Streams;
//This example filters and prints strings from an array that start with the letter 'a' and end with 'c'.
// The result is sorted lexicographically, demonstrating how to apply multiple filters and sorting using Streams.

import java.util.Arrays;

public class SortStartAndEndsWith {
    public static void main(String[] args) {
        String arr[] = {"abc", "cde", "ac", "aec", "xy3"};
        Arrays.stream(arr)
                .filter(x -> (x.startsWith("a") && x.endsWith("c")))
                .forEach(System.out::println);
    }
}
