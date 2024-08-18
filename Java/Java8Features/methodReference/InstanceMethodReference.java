package Java8Features.methodReference;
interface Adder{
    int add(int a , int b);
}
public class InstanceMethodReference {
    public  int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        Adder ad1 = instanceMethodReference::add;
        System.out.println(ad1.add(10,20));

    }
}
