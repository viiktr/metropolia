/*Create a program that draws a rectangle on screen by given input.
First the program asks for the height and width of the rectangle as integers.
After doing this the program prints a grid as shown in the example print.
If the given height or width is smaller than 1, the text “Invalid height or width value” is printed on screen and height and width are asked again.
Program is written to a class called Loops.

Example output:
Type in the height: 5
Type in the width: 2

XX
XX
XX
XX
XX
*/
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    int height = 0, width = 0;
    Scanner scanner = new Scanner(System.in);

    while (height < 1 || width < 1) {
        System.out.print("Type in the height: ");
        height = scanner.nextInt();
        System.out.print("Type in the width: ");
        width = scanner.nextInt();
        if (height < 1 || width < 1) {
        System.out.println("Invalid height or width value");
        }
    }

    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
        System.out.print("X");
        }
        System.out.println();
    }
    }
}
