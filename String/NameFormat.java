package String;

import java.util.*   ;

public class NameFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a name containing three words from the user
        System.out.print("Enter a name containing three words: ");
        String name = scanner.nextLine();

        // Format the name as specified
        String formattedName = formatName(name);
        System.out.println("Formatted Name: " + formattedName);

        scanner.close();
    }

    // Method to format the name with surname first, followed by first and middle names
    public static String formatName(String name) {
        // Split the name into words
        String[] words = name.split(" ");

        // Initialize a StringBuilder to store the formatted name
        StringBuilder formattedName = new StringBuilder();

        // Append the last word (surname) to the formatted name
        formattedName.append(words[words.length - 1]);
        formattedName.append(" ");

        // Append the first and middle names to the formatted name
        for (int i = 0; i < words.length - 1; i++) {
            formattedName.append(words[i]);
            formattedName.append(" ");
        }

        // Convert StringBuilder to String and return
        return formattedName.toString().trim(); // Trim to remove extra whitespace
    }
}