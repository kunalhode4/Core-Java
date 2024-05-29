package basicjava;

import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a positive whole number: ");
        int number = scanner.nextInt();

        // Check if the number is a Kaprekar number and print the result
        if (isKaprekarNumber(number)) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is not a Kaprekar number.");
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }

    // Checks if a given number is a Kaprekar number.

    public static boolean isKaprekarNumber(int num) {
        // Calculate the square of the number
        long square = (long) num * num;

        // Convert the square to a string
        String squareStr = String.valueOf(square);

        // Calculate the length of the original number
        int length = String.valueOf(num).length();

        // Iterate through the digits of the square to find possible splits
        for (int i = 1; i < squareStr.length(); i++) {
            String leftStr = squareStr.substring(0, i);
            String rightStr = squareStr.substring(i);

            // Check if the right part has a valid length
            if (rightStr.length() > length || rightStr.length() == 0) {
                continue;
            }

            // Convert left and right parts to long integers
            long left = Long.parseLong(leftStr);
            long right = Long.parseLong(rightStr);

            // Check if the sum of the left and right parts equals the original number
            if (left + right == num) {
                return true;
            }
        }

        return false;
    }
}
