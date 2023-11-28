package HomeworkFour;

    import java.util.Scanner;
public class ToNP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.println("Enter the value of N:");
        int n = scanner.nextInt();

        // Call the method to print numbers from 1 to N
        printNumbersUpToN(n);
    }

    // Method to print numbers from 1 to N
    private static void printNumbersUpToN(int n) {
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}


