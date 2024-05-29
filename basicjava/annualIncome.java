package basicjava;
import java.util.Scanner;

public class annualIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the name of the employee
        System.out.println("Enter the name of the employee:");
        String name = scanner.nextLine();

        // Accept the annual income of the employee
        System.out.println("Enter the annual income of the employee:");
        double annualIncome = scanner.nextDouble();

        // Calculate income tax based on the tariff
        double tax = calculateTax(annualIncome);

        // Display the name of the employee and the income tax
        System.out.println("Name: " + name);
        System.out.println("Income Tax: ₹" + tax);

        scanner.close();
    }

    // Function to calculate income tax based on the given tariff
    public static double calculateTax(double income) {
        if (income <= 250000) {
            return 0; // No tax for income up to ₹2,50,000
        } else if (income <= 500000) {
            return 0.1 * (income - 250000); // 10% of the income exceeding ₹2,50,000
        } else if (income <= 1000000) {
            return 30000 + 0.2 * (income - 500000); // ₹30,000 + 20% of the amount exceeding ₹5,00,000
        } else {
            return 50000 + 0.3 * (income - 1000000); // ₹50,000 + 30% of the amount exceeding ₹10,00,000
        }
    }
}