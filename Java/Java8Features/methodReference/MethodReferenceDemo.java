package Java8Features.methodReference;

interface Sayable{
    void say();
}
public class MethodReferenceDemo {
    public static void status(){
        System.out.println("Hello , This is static method");
    }
    public static void main(String[] args) {
        Sayable sayable = MethodReferenceDemo::status;
        sayable.say();
    }
}
/*
Method reference is used to refer method of functional interface.
It is compact and easy form of lambda expression. Each time when
you are using lambda expression to just referring a method,
you can replace your lambda expression with method reference. In this tutorial,
we are explaining method reference concept in detail.
Types of Method Reference
1.Reference to a static method
syntax : ContainingClass::staticMethodName
2.Reference  to an instance method
syntax : containingObject::instanceMethodName
3.Reference to a consttuctor

 */
