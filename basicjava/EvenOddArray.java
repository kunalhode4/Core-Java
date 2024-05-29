package basicjava;

import java.util.*;

public class EvenOddArray {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store 20 numbers
        int[] arr = new int[20];
        
        // Accept input from the user
        System.out.println("Enter Numbers:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        
        // Create arrays to store even and odd numbers
        int[] even = new int[20];
        int[] odd = new int[20];
        int evenCount = 0;
        int oddCount = 0;
        
        // Iterate through the input array and separate even and odd numbers
        for(int num : arr) {
            if(num % 2 == 0) {
                even[evenCount++] = num;
            } else {
                odd[oddCount++] = num;
            }
        }
        
        // Print even numbers
        System.out.println("\nEven numbers:");
        for(int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        
        // Print odd numbers
        System.out.println("\nOdd numbers:");
        for(int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
        
        // Close the Scanner to prevent resource leak
        sc.close();
    }

}
