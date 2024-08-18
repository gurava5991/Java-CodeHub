package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;

public class LengthOfStr {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Alice" , "Bob" , "charlie" , "Dev" , "chatgpt");
        //creating the stream
        words.stream().filter(word -> word.length() > 4).forEach(System.out::println);
    }
}
/*
print the words  whose length is greater then 5 using streams
 */
