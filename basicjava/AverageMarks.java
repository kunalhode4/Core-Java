package basicjava;

import java.util.*;

public class AverageMarks {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Arrays to store marks for each subject
        int[] englishMarks = new int[40];
        int[] mathMarks = new int[40];
        int[] scienceMarks = new int[40];

        // Input marks for each student
        for (int i = 0; i < 40; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("English: ");
            englishMarks[i] = scanner.nextInt();
            System.out.print("Maths: ");
            mathMarks[i] = scanner.nextInt();
            System.out.print("Science: ");
            scienceMarks[i] = scanner.nextInt();
        }

        // Calculate and print average marks secured by each student
        System.out.println("\nAverage marks of each student:");
        for (int i = 0; i < 40; i++) {
            double averageMarks = (englishMarks[i] + mathMarks[i] + scienceMarks[i]) / (double) 3;
            System.out.println("Student " + (i + 1) + ": " + averageMarks);
        }

        // Calculate and print class average in each subject
        double englishTotal = 0, mathTotal = 0, scienceTotal = 0;
        for (int i = 0; i < 40; i++) {
            englishTotal += englishMarks[i];
            mathTotal += mathMarks[i];
            scienceTotal += scienceMarks[i];
        }

        double englishClassAverage = englishTotal / 40;
        double mathClassAverage = mathTotal / 40;
        double scienceClassAverage = scienceTotal / 40;

        System.out.println("\nClass average in each subject:");
        System.out.println("English: " + englishClassAverage);
        System.out.println("Maths: " + mathClassAverage);
        System.out.println("Science: " + scienceClassAverage);

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
