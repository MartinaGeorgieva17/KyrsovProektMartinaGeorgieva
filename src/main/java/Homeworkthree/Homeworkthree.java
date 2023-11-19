package Homeworkthree;

import java.util.Scanner;

import java.util.Scanner;

public class Homeworkthree {
    //working with standard input - printing some text
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a number between 1 and 12:");
            int monthNumber = scanner.nextInt();

            String monthName = getMonthName(monthNumber);

            if (monthName != null) {
                System.out.println("The corresponding month is: " + monthName);
            } else {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }
        }

        private static String getMonthName(int monthNumber) {
            switch (monthNumber) {
                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
                default:
                    return null; // Return null for invalid month numbers
            }
        }
    }



