package basicjava;

import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an instance of the palindrome class
        palindrome palindromeNumber = new palindrome();

        // Check if the entered number is a palindrome using the isPalindrome method
        if (palindromeNumber.isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close(); // Close the scanner object to prevent resource leak
    }

    // Function to check if a number is a palindrome
    boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // Check if the original number is equal to its reverse
        return originalNum == reversedNum;
    }
}
