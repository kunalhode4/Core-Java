package basicjava;

import java.util.*;

public class BuzzNumberChecker {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        //  the user to enter a number
        System.out.println("Enter a number: ");
        
        // Read the entered number
        int number = scanner.nextInt();
        
        // Check if the entered number is a Buzz Number and print the result
        if(isBuzzNumber(number)) {
            System.out.println(number + " is a Buzz Number");
        } else {
            System.out.println(number + " is not a Buzz Number.");
        }
        
        // Close the Scanner to prevent resource leak
        scanner.close();
    }
    
   
      //Checks whether a given number is a Buzz Number or not.
    
    public static boolean isBuzzNumber(int num) {
        // Check if the number is either divisible by 7 or ends with the digit 7
        return num % 10 == 7 || num % 7 == 0;
    }

}
