/*Create a calculator program which lets the user choose what calculation to perform.
First the program asks what calculation is to be performed. Then the program asks for two integers,
performs the chosen calculation between the given numbers and prints the result on screen.
The choosing of the calculation is to be done using switch statement.
If, when choosing the calculation type, the user input is not a number between 1 and 5, program prints “Invalid choice”
and program execution ends. Hence the user will not be prompted to input two integers
if the original calculation choice is not a number between 1 and 5.
Hint:A type conversion must be done when printing the result of a division in order to include the decimal part of the result.
Program is written to a class called Calculation.


Example output:
Choose from the following calculations:
1: subtraction
2: addition
3: multiplication
4: division
5: remainder

Make your choice: 8

Invalid choice.*/
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose from the following calculations: \n1: subtraction\n" +
                "2: addition\n" +
                "3: multiplication\n" +
                "4: division\n" +
                "5: remainder\n");
        System.out.println("Make your choice:\n");
        int choice = scanner.nextInt();
        int Add = 0;
        int Sub = 0;
        int Mul = 0;
        int number1 = 0;
        int number2 = 0;
        float Div = 0;
        int Rem = 0;


        if (choice >= 1 && choice <= 5) {
            System.out.println("Type in the first number:\n ");
            number1 = scanner.nextInt();
            System.out.println("Type in the second number: \n");
            number2 = scanner.nextInt();
            Sub = number1 - number2;
            Add = number1 + number2;
            Mul = number1 * number2;
            Div = (float) number1 / number2;
            Rem = number1 % number2;
            switch (choice) {
                case 1:
                    System.out.println(number1 + " - " + number2 + " = " + Sub);
                    break;
                case 2:
                    System.out.println(number1 + " + " + number2 + " = " + Add);
                    break;
                case 3:
                    System.out.println(number1 + " * " + number2 + " = " + Mul);
                    break;
                case 4:
                    System.out.println(number1 + " / " + number2 + " = " + Div);
                    break;
                case 5:
                    System.out.println(number1 + " % " + number2 + " = " + Rem);
                    break;
                default:
                    System.out.println();
            }
        } else {
            System.out.println("Invalid choice.");

        }
        scanner.close();
    }
}
