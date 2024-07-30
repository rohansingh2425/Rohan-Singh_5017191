import java.util.Scanner;

public class FinancialForecasting {

    
    public static double calculateFutureValue(double principal, double rate, int periods) {
        
        if (periods == 0) {
            return principal;
        }
        
        return calculateFutureValue(principal * (1 + rate), rate, periods - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the initial principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual growth rate (in decimal): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years):");
        int periods = scanner.nextInt();

       
        double futureValue = calculateFutureValue(principal, rate, periods);

        
        System.out.printf("The future value after %d years is: %.2f%n", periods, futureValue);

        scanner.close();
    }
}

/*
 Complexity of this recursive algorithm:

The time complexity of the recursive algorithm used to calculate the future value in the given Java program is O(n), where n is the number of periods (years) over which the growth is applied.
method makes a recursive call for each period. Specifically, if there are n periods, there will be n recursive calls, as each call reduces the number of periods by one until it reaches zero.
Each call involves a constant-time operation (multiplication and recursion), so the time complexity is linear in terms of the number of periods.

STEPS TO OPTIMIZE RECURSIVE SOLUTIONS:

- Iterative Approach: Prefer using an iterative approach for simplicity and to avoid recursion depth issues.

- Memoization: Useful for more complex problems with overlapping subproblems.

- Tail Recursion: Improves readability but doesn’t offer performance benefits in Java.
  
By converting to an iterative approach or optimizing the recursive method, you can avoid excessive computation and improve the performance and robustness of your program

 */