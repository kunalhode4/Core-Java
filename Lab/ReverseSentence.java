package Lab;

import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        // Read the input sentence from the user
        String sentence = scanner.nextLine();
        // Reverse the input sentence and print the result
        System.out.println("Reversed sentence: " + reverseSentence(sentence));
        // Close the scanner to free up resources
        scanner.close();
    }

    // Method to reverse the order of words in a given sentence
    public static String reverseSentence(String sentence) {
        // Split the sentence into an array of words using whitespace as the delimiter
        String[] words = sentence.split("\\s+");
        // Create a StringBuilder object to build the reversed sentence
        StringBuilder reversed = new StringBuilder();
        // Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Append each word to the StringBuilder
            reversed.append(words[i]);
            // Add a space between words, but not after the last word
            if (i > 0) {
                reversed.append(" ");
            }
        }
        // Convert the StringBuilder to a string and return it
        return reversed.toString();
    }
}
