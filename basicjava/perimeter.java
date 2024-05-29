package basicjava;

import java.util.Scanner;

public class perimeter {

    public static double squarePerimeter(double side) {
        return 4 * side;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double trianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

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
                System.out.print("Enter the length of side 1 of the triangle: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter the length of side 2 of the triangle: ");
                double side2 = scanner.nextDouble();
                System.out.print("Enter the length of side 3 of the triangle: ");
                double side3 = scanner.nextDouble();
                double trianglePerimeter = trianglePerimeter(side1, side2, side3);
                System.out.println("Perimeter of the triangle: " + trianglePerimeter);
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}

