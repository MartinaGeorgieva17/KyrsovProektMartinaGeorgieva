package Homeworkthree;

import java.util.Scanner;

import java.util.Scanner;

public class Homeworkthree {
    //working with standard input
        public static void main(String[] args) {
//            creating class scanner - giving us the possibility to work with standard input
            Scanner scanner = new Scanner(System.in);
//creating text that will appear in the console - standard output
            System.out.println("Please enter a number between 1 and 12:");
//            creating int - it will give us the possibility to write numbers
            int monthNumber = scanner.nextInt();
//creating string to indicate month name with month number
            String monthName = getMonthName(monthNumber);
//creating variables if/else
            if (monthName != null) {
                System.out.println("The corresponding month is: " + monthName);
            } else {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }
        }
//creating string output - turning numbers into month names
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



