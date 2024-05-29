package basicjava;

import java.util.*;

public class NumericArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Input array elements from the user
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the second highest value in the array
        int secondHighest = findSecondHighest(numbers);

        // Print the second highest value
        System.out.println("Second highest value in the array: " + secondHighest);

        scanner.close(); // Close the scanner object to prevent resource leak
    }

    // Function to find the second highest value in an array
    public static int findSecondHighest(int[] arr) {
        // Check if the array has at least two elements
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Return -1 indicating failure
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Find the second highest value
        int n = arr.length;
        int max = arr[n - 1]; // Maximum value
        int secondMax = arr[n - 2]; // Second maximum value

        // Iterate through the array from right to left to find the second highest value
        for (int i = n - 3; i >= 0; i--) {
            if (arr[i] < max) {
                secondMax = arr[i];
                break;
            }
        }

        return secondMax;
    }
}
