package typeconversiondemo;

public class ExplicitTypeConversions {
    public static void main(String[] args) {
        int num = 3;
        char ch = Character.forDigit(num, 10);
        int val = Character.getNumericValue(ch);
        System.out.println(val);

        System.out.println(ch);

    }
}
