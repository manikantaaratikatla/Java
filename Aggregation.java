package mani;
/*
	// Car class (Aggregation)
	class Car {
	    String brand;
	    Engine engine; // HAS-A relationship

	    Car(String brand, Engine engine) {
	        this.brand = brand;
	        this.engine = engine;
	    }

	    void showCarDetails() {
	        System.out.println("Car Brand: " + brand);
	        engine.showType();  // Using Engine class method
	    }
	}
  
	// Main class
	public class Aggregation {
	    public static void main(String[] args) {
	        Engine myEngine = new Engine("V8 Turbo"); // Creating Engine object
	        Car myCar = new Car("Ford Mustang", myEngine); // Passing Engine object to Car

	        myCar.showCarDetails();  // Displaying car and engine details
	    }
	}

*/

import java.util.List;
import java.util.ArrayList;

// Customer class
class Customer {
    String name;
    String serviceBooked;

    Customer(String name, String serviceBooked) {
        this.name = name;
        this.serviceBooked = serviceBooked;
    }

    void showCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Service Booked: " + serviceBooked);
    }
}

// Salon class (Aggregation)
class Salon {
    String salonName;
    List<Customer> customers; // HAS-A relationship

    Salon(String salonName, List<Customer> customers) {
        this.salonName = salonName;
        this.customers = customers;
    }

    void showSalonDetails() {
        System.out.println("Salon: " + salonName);
        System.out.println("Customers List:");
        for (Customer c : customers) {
            c.showCustomerDetails();
            System.out.println("----------------------");
        }
    }
}

// Main class
public class Aggregation {
    public static void main(String[] args) {
        // Creating Customer objects
        Customer c1 = new Customer("Alice", "Haircut");
        Customer c2 = new Customer("Bob", "Facial");
        Customer c3 = new Customer("Charlie", "Manicure");

        // Creating a list of customers
        List<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);

        // Creating Salon object
        Salon salon = new Salon("Luxury Salon", customerList);

        salon.showSalonDetails(); // Display Salon with Customers
    }
}
