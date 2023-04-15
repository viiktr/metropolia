/*Copy the source code below to the text box. Locate the errors in code and fix them.
Hint: Example print shows what values need to be used for variable initialization.
Program is written to a class called InvalidVariables

public class InvalidVariables {
    public static void main (String [] args) {
        int number = 2.5;
        boolean truth = TRUE;
        char character = "A";
        String string = 'This is a character string';

        System.out.println("Integer: " + number);
        System.out.println("Truth: " + truth);
        System.out.println("Character: " + character);
        System.out.println("Character string: " + string);
    }
}

Example output:
Integer: 2
Truth: true
Character: A
Character string: This is a character string */

import static java.lang.Boolean.TRUE;

public class InvalidVariables {
    public static void main (String [] args) {
        int number = 2;
        boolean Truth = TRUE;
        String character = "A";
        String string = ("This is a character string");

        System.out.println("Integer: " + number);
        System.out.println("Truth: " + Truth);
        System.out.println("Character: " + character);
        System.out.println("Character string: " + string);
    }
}