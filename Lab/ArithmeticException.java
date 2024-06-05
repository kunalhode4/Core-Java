package Lab;

public class ArithmeticException {
    
    public static void main(String[] args) {
        // Initialize the numerator and denominator
        int numerator = 10;
        int denominator = 0;
        
        // Try block to catch exceptions that may occur during the division
        try {
            // Attempt to divide the numerator by the denominator
            // This line will throw an ArithmeticException because division by zero is not allowed
            int result = numerator / denominator;
            // This line will not be executed if an exception is thrown
            System.out.println("Result: " + result);
        } catch (Exception res) {
            // Catch block to handle the ArithmeticException
            // This block will execute if an ArithmeticException is thrown
            // Print a message indicating that an ArithmeticException was caught, along with the exception message
            System.out.println("ArithmeticException caught: " + res.getMessage());
        }
    }
}
