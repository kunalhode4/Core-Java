package basicjava;

import java.util.*;

public class NumberCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store the entered numbers
        int[] numbers = new int[10];
        
        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter Number " + (i + 1) +  ":");
            numbers[i] = sc.nextInt();
        }
        
        // Initialize variables to store the sum of two-digit and three-digit numbers
        int twoDigitSum = 0;
        int threeDigitSum = 0;
        
        // Iterate through the array of numbers and calculate the sum of two-digit and three-digit numbers
        for(int number : numbers) {
            if(number >= 10 && number <= 99) {
                twoDigitSum += number;
            } else if (number >= 100 && number <= 999) {
                threeDigitSum += number;
            }
        }
        
        // Print the sum of two-digit and three-digit numbers
        System.out.println("Sum of two-digit numbers: " + twoDigitSum);
        System.out.println("Sum of three-digit numbers: " + threeDigitSum);
        
        // Close the Scanner to prevent resource leak
        sc.close();
    }

}
