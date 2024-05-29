package String;

import java.util.Scanner;

public class NameInitials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a name containing three words from the user
        System.out.print("Enter a name containing three words: ");
        String name = scanner.nextLine();

        // Display the initials of the name
        String initials = getInitials(name);
        System.out.println("Initials: " + initials);

        scanner.close();
    }

    // Method to get initials from a name containing three words
    public static String getInitials(String name) {
        // Split the name into words
        String[] words = name.split(" ");

        // Initialize a StringBuilder to store the initials
        StringBuilder initials = new StringBuilder();

        // Iterate through each word and append the first letter to the initials
        for (String word : words) {
            // Check if the word is not empty
            if (!word.isEmpty()) {
                // Append the first character of the word to the initials
                initials.append(word.charAt(0));
            }
        }

        // Convert StringBuilder to String and return
        return initials.toString();
    }
}
