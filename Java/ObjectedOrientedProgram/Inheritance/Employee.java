package ObjectedOrientedProgram.Inheritance;

import java.util.*;

public class Employee {
    int id;
    String name;
    Address address;
    public Employee(int id , String name , Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101 , "Gurava" , new Address("Ongole","AP" , "India") ));
        employeeList.add(new Employee(102 , "bhanu" , new Address("Hyderabad","TS" , "India") ));
        for(Employee emp : employeeList){
            System.out.println(emp.id + " " + emp.name);
            System.out.println(emp.address.city + " " + emp.address.state + " " + emp.address.country);
        }
    }
}
