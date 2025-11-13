/** object = An entity that holds data (attributes) and can perform actions (methods) it's a
 reference data type**/


public class Main {
    public static void main(String[] args) {
        // Creating two car objects
        Car car1 = new Car("Toyota", "Camry", 24000);
        Car car2 = new Car("Honda", "Civic", 22000);

        // Calling the displayDetails method
        car1.displayDetails();
        car2.displayDetails();
    }
}