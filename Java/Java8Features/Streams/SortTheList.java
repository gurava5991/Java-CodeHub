package Java8Features.Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class SortTheList {
    public static void main(String[] args) {
        Collection<Integer> nums = Arrays.asList(5 ,1 ,2 , 2 , 3);
        nums.stream().sorted().forEach(System.out::println);
    }
}
