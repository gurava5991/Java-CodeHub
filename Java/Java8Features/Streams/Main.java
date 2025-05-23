package Java8Features.Streams;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "Shantanu", -1,
                "Akshay", 2,
                "Aman", -3,
                "Anil", -4
        );

        System.out.println(mostNegativeCube(map)); // Expected: "Shantanu" (-1³ = -1, least negative)
    }

    public static String mostNegativeCube(Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .filter(e -> e.getValue() < 0 && e.getValue() % 2 == 0) // Only even negative numbers
                .min(Comparator.comparingInt(e -> e.getValue() * e.getValue() * e.getValue())) // Cube for comparison
                .map(Map.Entry::getKey) // Extract the name
                .orElse(null);
    }
}
