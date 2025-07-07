public class Factorial {
    public static int factorial(int n) {
        // Base case: If n is 0 or 1, the factorial is 1. This stops the recursion.
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: The factorial of n is n multiplied by the factorial of (n-1).
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calculate the factorial of 5 using the factorial method.
        int result = factorial(5);
        // Print the calculated factorial to the console.
        System.out.println("Factorial: " + result); // Expected Output: Factorial: 120
    }
}