/* The class SalaryCountingWithMethods below asks for three floating point numbers
(work hours, salary per hour and tax percent) and then counts the salary before and
after taxes as well as the tax part of the salary based on the information given to the program.
Your task is to write ONLY the missing methods.
Program to complete:

import java.util.Scanner;
public class SalaryCountingWithMethods {
    public static void main (String [] args) {
        double hours, salaryPerHour, taxPercent, taxlessSalary, taxPart;

        hours =  askHours();
        salaryPerHour = askSalaryPerHour();
        taxPercent = askTaxPercent();

        taxlessSalary = countTaxlessSalary(hours, salaryPerHour);

        taxPart = taxlessSalary * taxPercent /100;

        System.out.println("\nSalary before taxes: " + taxlessSalary);
        System.out.println("Tax part of the salary: " + taxPart);
        System.out.println("Salary after taxes: " + (taxlessSalary-taxPart));
    }

    //  Write the missing methods here
    //  Methods are written in the text box below.
}

Example output:
Type in the number of work hours: 100
Type in salary per hour: 11
Type in tax percent: 8

Salary before taxes: 1100.0
Tax part of the salary: 88.0
Salary after taxes: 1012.0
*/
public static double askHours(){
        Scanner input=new Scanner(System.in);
        System.out.println("Type in the number of work hours: ");
        double hours=input.nextDouble();
        return hours;
        }

public static double askSalaryPerHour(){
        Scanner input=new Scanner(System.in);
        System.out.println("Type in salary per hour: ");
        double salaryPerHour=input.nextDouble();
        return salaryPerHour;
        }

public static double askTaxPercent(){
        Scanner input=new Scanner(System.in);
        System.out.println("Type in tax percent: ");
        double taxPercent=input.nextDouble();
        return taxPercent;
        }

public static double countTaxlessSalary(double hours,double salaryPerHour){
        double taxlessSalary=hours*salaryPerHour;
        return taxlessSalary;
        }
}
