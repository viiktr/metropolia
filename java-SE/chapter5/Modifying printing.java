/*Write a program that asks for the first name of the user and then prints the text shown in the example print.
The print should be modified to be identical with the example print.
Tabulator has been used to create the empty spaces in the beginning of each line.
Program is written to a class called ModifiedPrinting.

Example output:
Type in your first name: Lisa


Hi, "Lisa"
	The name of this exercise is 'Modifying printing'.
	Tabulator, line change and quotations have already been used in this exercise.
	Forward slash (\) is also usable in printing.


		*** End of exercise ***
*/

import java.util.Scanner;

public class ModifiedPrinting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your first name: ");
        String name = reader.nextLine();
		System.out.println("\n");
        System.out.println("Hi, \"" + name + "\"");

        System.out.println("\tThe name of this exercise is 'Modifying printing'.");
        System.out.println("\tTabulator, line change and quotations have already been used in this exercise.");
        System.out.println("\tForward slash (\\) is also usable in printing.");
        System.out.println("\n");
        System.out.println("\t\t*** End of exercise ***");
    }
}
