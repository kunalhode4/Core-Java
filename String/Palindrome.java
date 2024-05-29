package String;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine(); // Use nextLine() to capture the full input string
        String str1 = "";
        
        // Reversing the string
        for (int i = str.length() - 1; i >= 0; i--) {
            char e = str.charAt(i);
            str1 = str1 + e;
        }
        
        // Checking if the original string is equal to the reversed string
        if (str.equals(str1))
            System.out.println("Palindrome");
        else 
            System.out.println("Not a Palindrome");
    }
}