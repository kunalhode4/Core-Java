package basicjava;

import java.util.Scanner;

public class ClothShowroomDiscount {
    public static double calculateDiscount(double totalCost) {
        double discount;
        if (totalCost < 2000) {
            discount = 0.05 * totalCost;
        } else if (totalCost <= 5000) {
            discount = 0.25 * totalCost;
        } else if (totalCost <= 10000) {
            discount = 0.35 * totalCost;
        } else {
            discount = 0.50 * totalCost;
        }
        return discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total cost of items purchased: ");
        double totalCost = scanner.nextDouble();

        double discount = calculateDiscount(totalCost);
        double amountToBePaid = totalCost - discount;

        System.out.println("Amount to be Paid after Discount: ₹" + amountToBePaid);

        scanner.close();
    }
}