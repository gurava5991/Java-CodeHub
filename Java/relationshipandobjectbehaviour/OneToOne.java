package relationshipandobjectbehaviour;

class Passport{
    String passportNumber ;
    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    void display() {
        System.out.println("Passport Number: " + passportNumber);
    }
}
class Person {
    String name;
    Passport passport; // One-to-One association

    Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    void display() {
        System.out.println("Person Name: " + name);
        passport.display();
    }
}
public class OneToOne {
    public static void main(String[] args) {
        Passport p = new Passport("A123456");
        Person person = new Person("John Doe", p);
        person.display();
    }
}
