package String;

import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, word, longestWord;
        
        System.out.println("Enter a string");
        str = sc.nextLine();
        word = "";
        longestWord = "";
        
        str = str + " "; // Add a space to the end to read the last word
        
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a space
            if (ch == ' ') {
                // Compare the current word with the longest word found so far
                if (word.length() > longestWord.length())
                    longestWord = word;
                
                // Reset the current word for the next iteration
                word = "";
            } else {
                // Append the character to the current word
                word = word + ch;
            }
        }
        
        // Output the longest word and its length
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of the longest word: " + longestWord.length());
        
        sc.close();
    }
}