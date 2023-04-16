/*The class Travel below asks for the distance of the trip and average speed the trip is driven at.
Then the program prints the time needed to finish the trip in hours. Your task is to write the methods askDistance, a
skSpeed and countTime missing from the class declaration.
 */
 */
Program to complete:
import java.util.Scanner;

public class Travel {
    public static void main(String args[]) {
        double speed, distance, time;

        distance = askDistance();
        speed = askSpeed();
        time = countTime(distance, speed);

        System.out.println("Time needed to complete the trip is " + time + " hours.");
    }

//  Write the missing methods here
//  Methods are written in the text box below.

}

Example output:
Type in the length of the trip (km): 10,6
Type in your average speed (km/h): 2
Time needed to complete the trip is 5.3 hours.
*/


public static double askDistance(){
        Scanner input=new Scanner(System.in);
        System.out.println("Type in the length of the trip (km): ");
        double distance=input.nextDouble();
        return distance;
        }

public static double askSpeed(){
        Scanner input=new Scanner(System.in);
        System.out.println("Type in your average speed (km/h):  ");
        double speed=input.nextDouble();
        return speed;
        }

public static double countTime(double distance,double speed){
        double time=distance/speed;
        return time;
        }
        }
