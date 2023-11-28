package HomeworkFour;

import java.util.Scanner;

public class Tonpdevide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter value for N
        System.out.println("Enter value for N: ");
        int n = scanner.nextInt();

        //Print numbers from 1 to N that are not divisable by 3 and 7
        System.out.println("Numbers from 1 to " + n + " not divsible by 3 and 7: ");

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

