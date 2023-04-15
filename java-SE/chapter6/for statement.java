/*Create a program that asks for an integer n (n>0) and prints integers from n to 0 below each other.
This means that a line change must be printed after each number. for statement is to be used for printing the numbers.
If user types in a negative number or zero, the text “Input is not a positive integer.” is printed on screen and program execution ends.
Program is written to a class called ForLoop.

Example output:
Type in an integer: -2
Input is not a positive integer.*/

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in an integer: ");
        int number = reader.nextInt();

        if (number <= 0) {
            System.out.println("Input is not a positive integer.");
        } else {
            while(number >= 0) {
                System.out.print(number + "\n");
				number--;

            }
        }
    }
}