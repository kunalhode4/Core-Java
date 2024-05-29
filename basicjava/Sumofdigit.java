package basicjava;

public class Sumofdigit {

    public static void main(String[] args) {
        int number = 38154; // Example number
        int result = findSingleDigitSum(number);
        System.out.println("The sum of digits until it becomes a single-digit number: " + result);
    }

    // Function to find the sum of digits until the result is a single-digit number
    public static int findSingleDigitSum(int num) {
        // Continue the process until the number is a single-digit number
        while (num > 9) {
            int sum = 0;
            // Extract digits and add them to the sum
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum; // Update num with the sum of digits
        }
        return num; // Return the single-digit sum
    }
}
