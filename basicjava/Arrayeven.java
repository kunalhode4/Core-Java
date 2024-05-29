package basicjava;

import java.util.*;

class Arrayeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array of 10 elements
        int a []= new int[10];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        // Calculate sum of even and odd numbers
        int evenSum = 0;
        int oddSum = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                evenSum += num; // Add to even sum 
            } else {
                oddSum += num; // Add to odd sum 
            }
        }
        
        // Display the sums
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        
        sc.close();
    }
}

