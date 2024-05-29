package basicjava;

import java.util.Scanner;

public class Factorial {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Initialize factorial to 1
	        int factorial = 1;

	        // Calculate factorial using a for loop
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }

	        // Display the factorial
	        System.out.println("Factorial of " + number + " is: " + factorial);

	        // Close the scanner
	        scanner.close();
	    }
	}

