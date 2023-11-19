package NewString;

import java.util.Scanner;

public class NewString {
    //working with the standard output - printing some text
    public static void main(String[] args) {
        System.out.println("Write with words your age: ");

        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        //Display the entered sring
        System.out.println("Your age is " + firstString);

        //creating the second string
        System.out.println("Write the day you were born (with words)?");
        String secondString = scanner.nextLine();

        //creating string three
        System.out.println("Write your hobby?");
        String threeString = scanner.nextLine();

        //calculate the length of the string
        int length = firstString.length();
        System.out.println("Length of the string" + length);

        //Convert the string to upper case
        String uppercaseString = firstString.toUpperCase();
        System.out.println("Your age is " + firstString);


        //Replace a character in the string
        char oldChar = 'o';
        char newChar = 'k';
        String replacedString = firstString.replace(oldChar, newChar);
        System.out.println("String after replacing " + oldChar + newChar + " - replaced characters");

        //Compare the strings for content using equals
        if (firstString == secondString) {
        } else {
            System.out.println("The strings are different");

            //i want interval between the strings, so i will create one
            String interval = ", ";

            //combining strings
            String combinedStringWithInterval = firstString + interval + secondString;
            System.out.println("The string are combined " + combinedStringWithInterval);
        }
    }
}
