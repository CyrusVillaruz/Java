/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Distance.
 * A program that calculates distance between two points.
 * @author cyrus
 * @version 1.0
 */
public class Distance {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // User inputs first set of x,y coordinates
        System.out.println("Please list the first set x and y coordinate"
                + "as shown here: \"x y\": ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        
        // User inputs second set of x,y coordinates
        System.out.println("Please list the second set x and y coordinate"
                + "as shown here: \"x y\": ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        // Calculates distance between the two coordinate sets.
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) 
                    + Math.pow((y2 - y1), 2));
        System.out.println("Distance between the two points: " + distance);
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Distance value rounded to two decimal places: "
                + decimalFormat.format(distance));
        
        scan.close();

    }

}
