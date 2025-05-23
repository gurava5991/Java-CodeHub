package oops.introductiontoopps;

class Car{
    // Instance attributes (specific to each instance of the class)
    private String model;
    private String color;
    private int speed;

    // Static attribute (shared across all instances of the class)
    private static int totalCars = 0;

    // Constructor (to initialize instance attributes)
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        totalCars++; // Increment totalCars whenever a new Car object is created
    }

    // Instance method (specific to the behavior of each Car object)
    public void drive() {
        System.out.println(model + " is driving at " + speed + " km/h.");
    }

    // Static method (belongs to the class, not tied to any specific instance)
    public static void showTotalCars() {
        System.out.println("Total cars created: " + totalCars);
    }

    // Getter for the model (Instance method)
    public String getModel() {
        return model;
    }

    // Setter for the model (Instance method)
    public void setModel(String model) {
        this.model = model;
    }

}
public class CarTest {
    public static void main(String[] args) {
        // Creating two instances (objects) of the Car class
        Car car1 = new Car("Toyota Corolla", "Red", 120);
        Car car2 = new Car("Honda Civic", "Blue", 150);

        // Using instance methods to access instance attributes
        car1.drive();  // Output: Toyota Corolla is driving at 120 km/h.
        car2.drive();  // Output: Honda Civic is driving at 150 km/h.

        // Using a static method to access the static attribute
        Car.showTotalCars();

    }
}
/*
Key Points:
Instance methods can access:
Instance fields and methods (specific to that object).
Static fields and methods (shared by the class).

Static methods can only access:
Static fields and methods (since they are class-level and don’t belong to any specific object).
Static methods cannot directly access instance fields because static methods don’t have access to a specific instance of the class.
 */
