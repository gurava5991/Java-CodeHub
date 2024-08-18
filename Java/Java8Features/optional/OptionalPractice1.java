package Java8Features.optional;
import java.util.Optional;
public class OptionalPractice1 {
    public static void main(String[] args) {
        //creating optional object
        Optional<Integer> optionalInt = Optional.of(146);
        System.out.println(optionalInt.get());
        System.out.println(optionalInt.isPresent());
        Optional<String>  optionalName = Optional.ofNullable(null);
        System.out.println(optionalName.orElse("Guru"));

    }
}
