/**
 * 
 */
package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Calculates amount of cans of paint required to paint a room
 * @author cyrus
 * @version 1.0
 *
 */
public class Paint {

    /**
     * Drives the program
     * @param args unused
     */
    public static void main(String[] args) {
        
        // Amount, in square feet, a 4 litre can of paint can cover
        final int COVERAGE = 400;
        
        double width;
        double length;
        double height;
        double coats;
        
        // Prompts measurement values from user
        System.out.println("Calculation units are expressed as feet.");
        
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Please enter the width of the room.");
        width = myScanner.nextDouble();
        System.out.println("Width: " + width + " feet");
        
        System.out.println("Please enter the length of the room.");
        length = myScanner.nextDouble();
        System.out.println("Length: " + length + " feet");
        
        System.out.println("Please enter the height of the room.");
        height = myScanner.nextDouble();
        System.out.println("Height: " + height + " feet");
        
        System.out.println("Please enter the number of coats.");
        coats = myScanner.nextDouble();
        System.out.println("Number of coats: " + coats);
        
        // Calculates number of cans needed to cover the room
        double surfaceArea = 2 * ((length + width) + (width + height) + (length + height));
        System.out.println("Surface Area: "+ surfaceArea + " square feet");
        
        double coverageNeeded = surfaceArea * coats;
        double cansOfPaintNeeded = Math.ceil(coverageNeeded / COVERAGE);
        System.out.println("Number of cans of paint needed: " + cansOfPaintNeeded + " cans");
        
        myScanner.close();
    }

}
