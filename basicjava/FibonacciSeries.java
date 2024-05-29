package basicjava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Display the Fibonacci series
        System.out.println("Fibonacci series up to " + terms + " terms:");
        printFibonacciSeries(terms);

        // Close the scanner
        scanner.close();
    }

    // Method to print Fibonacci series
    public static void printFibonacciSeries(int terms) {
        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term in the series
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}   
