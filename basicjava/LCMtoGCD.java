package basicjava;

import java.util.*;

public class LCMtoGCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate the LCM of the two numbers
        int lcm = findLCM(num1, num2);

        // Display the calculated LCM
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    // Function to find the Greatest Common Divisor (GCD) using the continued division method
    public static int findGCD(int a, int b) {
        // Continue dividing the larger number by the smaller number until the remainder is zero
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // The GCD is the value of 'a' after the loop terminates
        return a;
    }

    // Function to find the Lowest Common Multiple (LCM) using GCD
    public static int findLCM(int num1, int num2) {
        // LCM * GCD = num1 * num2
        // Therefore, LCM = (num1 * num2) / GCD
        return (num1 * num2) / findGCD(num1, num2);
    }
}
