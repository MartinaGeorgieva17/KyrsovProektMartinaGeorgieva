package Homeworkthree;

import java.util.Scanner;

public class Homewrokthree {
//    working with standard input
    public static void main(String[] args) {
//        creating class scanner - giving us the possibility to work with standard input
        Scanner scanner = new Scanner(System.in);
//        creating text that will appear in the console///creating standard output for printing text
        System.out.println("Please, write a number: ");
//       Creating int - it will read the number
        int number = scanner.nextInt();
//        creating possibilities - if number is even or else
        if (isEven(number)) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is not even");
        }
    }
//    creating boolean - reading if the data is true or false after the number is split (2)
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}