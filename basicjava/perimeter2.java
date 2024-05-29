package basicjava;

import java.util.Scanner;

public class perimeter2 {

    // Method to calculate perimeter of a square
    public static double squarePerimeter(double side) {
        return 4 * side;
    }

    // Method to calculate perimeter of a rectangle
    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Method to calculate perimeter of a circle
    public static double CirclePerimeter(double Radius) {
        // Using an approximation for pi
        return 2 * (22.0 / 7.0) * Radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu for shape selection
        System.out.println("Select a shape:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");

        // Read user's choice
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the length of a side of the square: ");
                double side = scanner.nextDouble();
                double squarePerimeter = squarePerimeter(side);
                System.out.println("Perimeter of the square: " + squarePerimeter);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectanglePerimeter = rectanglePerimeter(length, width);
                System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                break;
            case 3:
                System.out.print("Enter the length of Radius: ");
                double Radius = scanner.nextDouble();
                double CirclePerimeter = CirclePerimeter(Radius);
                System.out.println("Perimeter of the Circle: " + CirclePerimeter);
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;
        }

        scanner.close(); // Close scanner to prevent resource leak
    }
}
