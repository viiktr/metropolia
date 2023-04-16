/*The class Overloading below asks for two names and prints three different greetings.
Your task is to write the class methods missing from the class declaration.
Methods print the greetings as shown in the example print.
Hint:The names and parameter types of the needed methods can be checked from the main method
because all methods are called there. This exercise also does not require you to copy the
source code below to the return field. The method declarations will suffice.

Program to complete:
import java.util.Scanner;
public class Overloading {
    public static void main(String[] args) {
        String firstName, secondName;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the first name: ");
        firstName = reader.nextLine();

        System.out.print("Type in the second name: ");
        secondName = reader.nextLine();

        System.out.println("\n**********");
        greet();
        System.out.println("**********");

        greet(firstName);
        System.out.println("**********");

        greet(firstName, secondName);
        System.out.println("**********");
    }

    //  the needed greeting methods
}

Example output:
Type in the first name: Matt
Type in the second name: Jackson

**********
Hi!
**********
Hi, Matt
**********
Hi, Matt and Jackson
**********
*/

	private static void greet () {
		System.out.println("Hi! ");

	}
		private static void greet (String firstName) {
		System.out.println("Hi, " + firstName);

	}
		private static void greet (String firstName, String secondName) {
		System.out.println("Hi, " + firstName + " and " + secondName);

	}
}
