/*Create a Java-program that asks for two double type floating point numbers and then performs multiplication
and division with the given numbers. First number acts as the divided number in division and the second one is the divisor.
The program prints the results of both calculations in the end.
Program is written to a class called DecimalCalculations.

Example output:
Type in the first number: 5,0
Type in the second number: 2,5
Result of the multiplication: 12.5
Result of the division: 2.0
*/

import java.util.Scanner;

public class DecimalCalculations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the first number:");
        double fn = reader.nextDouble();
        System.out.print("Type in the second number: ");
        double sn = reader.nextDouble();

        System.out.println("Result of the multiplication: " + (fn * sn));
        System.out.println("Result of the division: " + (fn / sn));
    }
}
