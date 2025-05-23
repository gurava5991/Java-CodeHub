package relationshipandobjectbehaviour;


class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }


}
public class AggregationExample {
    public static void main(String[] args) {
        Address address = new Address("Delhi" , "New Delhi" , "Rajendra Place" , "110001");
        Employee employee = new Employee("Arun" , address);
        employee.display();

    }
}
