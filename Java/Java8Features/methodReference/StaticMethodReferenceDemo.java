package Java8Features.methodReference;

import java.util.ArrayList;
import java.util.List;

public class StaticMethodReferenceDemo {
    // Static method to compare with name
    public static int compareByName(Person a, Person b)	{
        return a.getName().compareTo(b.getName());
    }
    public static int compareByAge(Person a, Person b)	{
        return a.getAge() - b.getAge();
    }
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();

        personsList.add(new Person(21, "charlie"));
        personsList.add(new Person(22, "bab"));
        personsList.add(new Person(23, "bhanu"));
        personsList.add(new Person(24, "ram"));

        personsList.sort(StaticMethodReferenceDemo::compareByName);

        System.out.println("Sort by Name :");
        personsList.stream().map(x -> x.getName()).forEach(System.out::println);

        personsList.sort(StaticMethodReferenceDemo::compareByAge);

        // Display message only
        System.out.println("Sort by Age :");

        personsList.stream().map(x -> x.getAge()).forEach(System.out::println);



    }
}
