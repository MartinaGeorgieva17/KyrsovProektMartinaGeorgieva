package HomeworkFour;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the site of the array
    System.out.println("Enter the size of the array:");
    int size = scanner.nextInt();

    //Create an array to store the numbers
    int[] numbers = new int[size];

    //Prompt the user to enter the number for the array
    System.out.println("Enter " + size + " number");

    for (int i=0; i < size; i++) {
    numbers[i] = scanner.nextInt();
    }
    //Calculate the sum of the even and odd numbers
    int sumEven = 0;
    int sumOdd = 0;

    for (int number : numbers) {
    if (number % 2 == 0) {
        sumEven += number;
    }else{
        sumOdd += number;
        }
    }

    //Display the result
System.out.println("Sum of even numbers: " + sumEven);
System.out.println("Sum of odd numbers " + sumOdd);
    }
}
