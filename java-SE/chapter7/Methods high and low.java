/*The class HighLow below asks for three integers and prints the highest and lowest of them on screen.
 task is to write the missing methods high and low, which receives the integers user inputs as p
 arameters and return the highest and lowest integers respectively.

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int number1, number 2, number 3, high, low;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the first integer: ");
        number 1 = reader.nextInt();

        System.out.print("Type in the second integer: ");
        number 2 = reader.nextInt();

        System.out.print("Type in the third integer: ");
        number 3 = reader.nextInt();

        high = high(number1, number2, number3);
        low = low(number1, number2, number3);

        System.out.print("Highest number was " + high);
        System.out.print(" and the lowest was" + low + "\n");
    }

    //  Declarations of the methods high() and low()

}

Note: Above code is not to be copied to the return field. Write only the declarations of the missing methods there.

Example output:
Type in the first integer: -3
Type in the second integer: 0
Type in the third integer: 3
Highest number was 3 and the lowest was -3
*/

public static int high (int number1,int number2,int number3){
        int max=number1;
        if(number2>max){
        max=number2;
        }
        if(number3>max){
        max=number3;
        }
        return max;
        }

public static int low (int number1,int number2,int number3){
        int min=number1;
        if(number2<min){
        min=number2;
        }
        if(number3<min){
        min=number3;
        }
        return min;
        }
}
