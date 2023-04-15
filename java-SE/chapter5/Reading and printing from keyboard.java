/*Make a program that asks two integers from the user, counts their sum and prints the result on screen.
Use methods from Scanner class to read the data.
Program is written to a class called Calculation.

Example output:
Type the first number: -5
Type the second number: 1
Sum of the numbers you typed is -4
 */

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        int number1 = 0, number2 = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        number1 = reader.nextInt();
        System.out.print("Type the second number: ");
        number2 = reader.nextInt();
        System.out.print("Sum of the numbers you typed is " + (number1 + number2));
    }
}