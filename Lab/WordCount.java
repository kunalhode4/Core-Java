package Lab;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        // Read the input word from the user
        String word = scanner.nextLine();
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        // Read the input sentence from the user
        String sentence = scanner.nextLine();
        // Count the occurrences of the word in the sentence and print the result
        System.out.println("Number of occurrences: " + countOccurrences(word, sentence));
        // Close the scanner to free up resources
        scanner.close();
    }

    // Method to count the occurrences of a word in a given sentence
    public static int countOccurrences(String word, String sentence) {
        // Initialize the count of occurrences to 0
        int count = 0;
        // Split the sentence into an array of words using space as the delimiter
        String[] words = sentence.split(" ");
        // Iterate over each word in the array
        for (String w : words) {
            // Compare each word with the input word, ignoring case
            if (w.equalsIgnoreCase(word)) {
                // Increment the count if a match is found
                count++;
            }
        }
        // Return the total count of occurrences
        return count;
    }
}
