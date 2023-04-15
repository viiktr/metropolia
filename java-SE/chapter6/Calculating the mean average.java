/* Create a program that asks for results of exams and calculates the mean average of the grades.
Grades are floating point numbers between 4 and 10. Program asks for grades until a negative number is typed.
If user gives a grade other than a number between 4 and 10, the text “Invalid grade!” will be
printed on screen and program asks for another grade. Finally the program prints the number of inputted grades and
their mean average on screen as shown in the example print.
If no grades were inputted, the notice “You did not input any grades.” is the only thing printed on screen.
Hint:A double type variable is to be used to store the value of the average.
Program is written to a class called Average.


Example output:
Program calculates the average of inputted grades.
Finish with a negative integer.

Input a grade (4-10): 11
Invalid grade!
Input a grade (4-10): -6

You did not input any grades.
*/
import java.util.Scanner;
import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program calculates the average of inputted grades.\nFinish with a negative integer.");
        double sum = 0.0;
        int count = 0;

        while (true) {
            System.out.print("Input a grade (4-10): ");
            double grade = input.nextDouble();

            if (grade < 0) {
                break;
            } else if (grade < 4 || grade > 10) {
                System.out.println("\nInvalid grade!");
                continue;

            }
            sum += grade;
            count++;
        }

        if (count <= 0) {
            System.out.println("\nYou did not input any grades.");
        } else {
            double average = sum / count;
            System.out.printf("\n%d grades inputted.\n", count);
            System.out.format(Locale.US,"Average of the grades: %.1f%n", average);
        }
    }
}