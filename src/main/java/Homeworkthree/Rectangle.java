package Homeworkthree;

public class Rectangle {
    //main method
    public static void main(String[] args) {
        //Creating values
        int length = 2;
        int height = 3;

        //calculate perimeters
        int area = length * height;
        int perimeter = 2 * (length + height);

        //Showing the results
        System.out.println("Rectangle with length " + length + " and height " + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter " + perimeter);

    }
}

