package Lab;

import java.util.*;

public class PiglatinWord {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        // Read the input word from the user
        String word = scanner.nextLine();
        // Convert the input word to Pig Latin and print the result
        System.out.println("Piglatin: " + toPigLatin(word));
        // Close the scanner to free up resources
        scanner.close();
    }

    // Method to convert a given word to Pig Latin
    public static String toPigLatin(String word) {
        // Define a string containing all vowels (both lowercase and uppercase)
        String vowels = "aeiouAEIOU";
        // Check if the first character of the word is a vowel
        if (vowels.indexOf(word.charAt(0)) != -1) {
            // If the word starts with a vowel, append "way" to the word and return it
            return word + "way";
        } else {
            // If the word starts with a consonant, find the first occurrence of a vowel
            int index = 0;
            for (int i = 0; i < word.length(); i++) {
                // Check if the current character is a vowel
                if (vowels.indexOf(word.charAt(i)) != -1) {
                    // Store the index of the first vowel and break the loop
                    index = i;
                    break;
                }
            }
            // Form the Pig Latin word by moving the consonant cluster to the end
            // and appending "ay", then return the result
            return word.substring(index) + word.substring(0, index) + "ay";
        }
    }
}
