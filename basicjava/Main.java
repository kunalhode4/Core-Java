package basicjava;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String address;

    // Constructor to initialize employee information
    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee information
        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Employee Address:");
        String address = scanner.nextLine();

        // Create an Employee object using the constructor
        Employee employee = new Employee(id, name, address);

        // Display employee information
        System.out.println("\nEmployee Information:");
        employee.displayInfo();

        scanner.close();
    }
}
