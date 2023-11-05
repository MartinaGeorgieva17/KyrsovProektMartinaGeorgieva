//location of the current class
package org.example;

//when we use something built in we shall import it
import java.util.Scanner;

//definition of a class
public class Main {
    //main method
    public static void main(String[] args) {

        //working with the standard output - printing some text
        System.out.println("Please enter your name");

        //Class scanner - giving us the possibility to work with standard input (from the Console)
        Scanner scanner = new Scanner(System.in);
        //Creating a variable (userName) which will hold a text value
        String userName = scanner.nextLine();

        //creating standard output for printing text
        System.out.println("Please enter your hobby?");

        //Creating a variable(userHobby) which will hold a text
        String userHobby = scanner.nextLine();

        //working with the standard output - printing some text
        System.out.printf("Please enter your age: ");
        //Creating a variable (userName) which will hold a text value
        int userAge = scanner.nextInt();

        System.out.println("Hello, " + userName + " in our website! Now you can read more about your hobby.");
    }
}
