package oops.inheritence;

class Animal{
    void eat(){
        System.out.println("This Animal eats Food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The Dog Barks");
    }
}
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();//Inherited method

    }
}
