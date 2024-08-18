package Java8Features.Streams;

import java.util.ArrayList;
import java.util.Collection;

class Person{
    String name;
    int age;
    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }
}
public class SortCustomObject {
    public static void main(String[] args) {
        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person("charlie" , 21));
        persons.add(new Person("bab" , 22));
        persons.add(new Person("bhanu" , 23));
        persons.add(new Person("ram" , 24));
        persons.stream().sorted((firstPerson , secondPerson)-> firstPerson.name.compareTo(secondPerson.name)).forEach(person -> System.out.println(person.name));


    }
}
