/**
 * A program that reads in an angle of any size (positive or negative),
normalizes it, and prints it out.
For example, the input of 380 should print 20,
and the input of -30 should return 330.
All variables should be of type int. 
 *
 * Angles - Lab 2-4
 *
 * @author Andrew Albanese
 * @version 2016-01-28
 */
import java.util.Scanner;

public class Angles
{
    public static void main (String[] args)
    {
        // Display prompt for degrees of angle
        System.out.println("Please enter the number of degrees of angle: ");

        // Read angle in degrees
        Scanner in = new Scanner(System.in);
        int angle = in.nextInt();

        // Compute normalized value of angle

        final int DEGREES_IN_A_CIRCLE = 360;

        int normalized = angle%DEGREES_IN_A_CIRCLE;

        // Print out the normalized value of the angle 
        System.out.println(normalized);
    }
}