package basicjava;

import java.util.*;

public class StateCapital {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Arrays to store states and capitals
        String[] states = new String[3];
        String[] capitals = new String[3];

        // Input states and capitals
        System.out.println("Enter 3 states and their capitals:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter state " + (i + 1) + ": ");
            states[i] = scanner.nextLine();
            System.out.print("Enter capital of " + states[i] + ": ");
            capitals[i] = scanner.nextLine();
        }

        // Input state to search for its capital
        System.out.print("\nEnter the state whose capital is to be searched: ");
        String stateToSearch = scanner.nextLine();

        // Find the index of the state in the states array
        int index = -1;
        for (int i = 0; i < states.length; i++) {
            if (states[i].equalsIgnoreCase(stateToSearch)) {
                index = i;
                break;
            }
        }

        // Display result
        if (index != -1) {
            System.out.println("The capital of " + states[index] + " is " + capitals[index]);
        } else {
            System.out.println("Capital not found for the given state.");
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
