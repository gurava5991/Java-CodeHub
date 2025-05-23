package typeconversiondemo;

public class ImplicitTypeConversionDemo {
    public static void main(String[] args) {
        //Type conversion from int to long
        int num = 20;
        long num2 = num;
        System.out.println(num2);
        long sum = num + num2;
        System.out.println(sum);
    }
}
