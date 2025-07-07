public class sum_Calculation {
 
    public static int sum(int n) {
        // Base case: If n is 1, the sum is 1. This stops the recursion.
        if (n == 1) {
            return 1;
        } else {
            // Recursive case: The sum of n numbers is n plus the sum of (n-1) numbers.
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calculate the sum of numbers from 1 to 5 using the sum method.
        int result = sum(5);
        // Print the calculated sum to the console.
        System.out.println("Sum: " + result); // Expected Output: Sum: 15
    }
}