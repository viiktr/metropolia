/*Create a Java-program that prints the salary of an employee before taxes, after taxes and the amount of tax.
Program first asks for three floating point numbers (work hours, salary per hour and tax percent) and based on these values,
calculates amount of taxes and salary before and after taxes.
Hint: Amount of taxes can be calculated with the formula: hours*salary per hour*tax percent/100
Program is written to a class called SalaryCalculation.

Example output:
Type in the amount of work hours: 100
Type in the salary per hour: 11
Type in the tax percent: 18
Salary before taxes: 1100.0
Amount of tax: 198.0
Salary after taxes: 902.0
*/

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the amount of work hours:  ");
        double Hours = reader.nextDouble();
        System.out.print("Type in the salary per hour: ");
        double Salary = reader.nextDouble();
        System.out.print("Type in the tax percent: ");
        double Tax = reader.nextDouble();

        double SBT = (double) Hours*Salary;
        double AT = (double) (Hours * Salary * Tax) /100 ;
        double SAT = SBT-AT;

        System.out.println("Salary before taxes: " + SBT);
        System.out.println("Amount of tax: " + AT);
        System.out.println("Salary after taxes: " + SAT);
    }
}
