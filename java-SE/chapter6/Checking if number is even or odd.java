/*Create a program that asks for a positive integer (zero will not do) and check if the number is even or odd.
If number is even, “Number X is even” is printed on screen and “Number X is odd” is printed if the number is odd.
X marks the number user types in. If the given number is zero or a negative number,
program prints “Input is invalid” on screen and program execution ends.
Hint: Number is even if its division remainder is 0 when divided by 2.
Program is written to a class called OddOrEven.

Example output:
Type in an integer: 8
Number 8 is even.*/

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in an integer: ");
        int number = reader.nextInt();

        if (number <= 0) {
            System.out.println("Input is invalid.");
        } else if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}