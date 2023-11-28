package HomeworkFour;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the value of N
        System.out.println("Enter the value of N:");
        int n = scanner.nextInt();

        //Calculate and print the sum of the first N Fibonacci terms
        long sum = calculateFibonacciSum(n);
        System.out.println("Sum of the first " + n + " Fibonacci terms: " + sum);
    }

    private static long calculateFibonacciSum(int n) {
        if (n <= 0) {
            return 0;
        }

        long firstTerm = 0;
        long secondTerm = 1;
        long sum = firstTerm + secondTerm;

        for (int i = 3; i <= n; i++) {
            long nextTerm = firstTerm + secondTerm;
            sum += nextTerm;

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return sum;
    }
}

