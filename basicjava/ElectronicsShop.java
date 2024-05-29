package basicjava;

import java.util.Scanner;

public class ElectronicsShop {
    public static double calculateDiscount(double amount, char purchaseType) {
        double discountRate;
        if (purchaseType == 'L') {
            if (amount <= 2500) {
                discountRate = 0.0;
            } else if (amount <= 57000) {
                discountRate = 5.0;
            } else if (amount <= 100000) {
                discountRate = 7.5;
            } else {
                discountRate = 10.0;
            }
        } else if (purchaseType == 'D') {
            if (amount <= 2500) {
                discountRate = 5.0;
            } else if (amount <= 57000) {
                discountRate = 7.5;
            } else if (amount <= 100000) {
                discountRate = 10.0;
            } else {
                discountRate = 15.0;
            }
        } else {
            System.out.println("Invalid purchase type.");
            return -1;
        }

        double discount = (discountRate / 100) * amount;
        return amount - discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer's address: ");
        String address = scanner.nextLine();

        System.out.print("Enter the amount of purchase: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter type of purchase (L for Laptop, D for Desktop): ");
        char purchaseType = scanner.next().toUpperCase().charAt(0);

        double netAmount = calculateDiscount(amount, purchaseType);
        if (netAmount != -1) {
            System.out.println("\nCustomer Name: " + name);
            System.out.println("Customer Address: " + address);
            System.out.println("Net Amount to be Paid: $" + netAmount);
        }

        scanner.close();
    }
}