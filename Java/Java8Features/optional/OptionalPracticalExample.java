package Java8Features.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();

    public EmployeeService() {
        employees.put(1, new Employee("John"));
        employees.put(2, new Employee("Jane"));
    }

    public Optional<Employee> getEmployeeById(int id) {
        Employee employee = employees.get(id);
        return Optional.ofNullable(employee); // creates an optional of employee
    }
}

public class OptionalPracticalExample {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Optional<Employee> optionalEmployee = employeeService.getEmployeeById(1); // returns an optional of employee

        Employee employee = optionalEmployee.orElseGet(() -> new Employee("Unknown")); // returns the employee John
        System.out.println(employee.getName());

        optionalEmployee = employeeService.getEmployeeById(4); // returns an optional of employee
        employee = optionalEmployee.orElseGet(() -> new Employee("Unknown")); // created and returns a new employee as Unknown
        System.out.println(employee.getName());





    }
}
