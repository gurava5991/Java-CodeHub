package Java8Features.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresOfList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1 , 3 , 4 , 5);
        nums.stream().map(num -> num * num).forEach(System.out::println);
        //can we collect the stream into list
        Collection<Integer> squares = nums.stream().map(num -> num * num).collect(Collectors.toList());
        for(Integer square : squares)
            System.out.println(square);
    }
}
