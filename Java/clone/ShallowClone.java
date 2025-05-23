package clone;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    public void display() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}

public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person person1 = new Person("John", address);

        Person person2 = (Person) person1.clone(); // Cloning person1

        System.out.println("Before Modification:");
        person1.display();
        person2.display();

        person2.address.city = "Los Angeles"; // Modifying cloned object's address

        System.out.println("\nAfter Modification:");
        person1.display();
        person2.display();
    }
}

