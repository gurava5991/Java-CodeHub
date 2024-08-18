package Java8Features.lambdaExpression;

interface Sum{
    int add(int a , int b);
}
interface Greater{
    int getMax(int a , int b);
}
public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Sum ref = (a , b) -> a + b ;
        Greater greater = (a , b) -> (a > b) ? a : b;
        System.out.println(ref.add(10,20));
        System.out.println(greater.getMax(10,30));
    }
}
/*
A lambda expression consists of a list of parameters, an arrow, and a body.
They provide a way to represent a function as an object
The parameters and body of a lambda expression are similar to those of a method.
The main difference is that a lambda expression does not have a name and does not
belong to a class. Instead, it is an anonymous function that can be passed around
as a value.

Types of Lambda Body
In Java, the lambda body is of two types:

1. Lambda body with a single expression
2. Lambda body consisting a block of code.
1. Lambda body with a single expression

Lambda expression consists of one expression as its body. This type of lambda
expression can be written in a more concise form because the curly braces and
the return keyword can be omitted.
syntax :
 (parameters) -> lambda body

 */
