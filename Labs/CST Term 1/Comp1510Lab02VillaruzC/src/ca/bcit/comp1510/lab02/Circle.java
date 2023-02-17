/**
 * 
 */
package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * This program calculates important circle values
 * @author cyrus
 * @version 1.0
 *
 */

/*
 * Pre-Lab Questions:
 * 1a) Variable x is defined as an integer
 * 1b) The integer x is assigned an initial value of 3
 * 1c) The value of x is overwritten to 3
 * 2a) 66
 * 2b) -13
 * 2c) 0
 * 2d) 3
 * 2e) 7
 * 2f) 4.03125
 * 2g) 0.24806201550387597
 * 2h) 4.433...
 * 2i) 0.9375
 * 2j) 0
 * 2k) 0.09999999999999964
 * 
 */

public class Circle {

    /**
     * Drives the program
     * @param args unused
     */
    public static void main(String[] args) {
        final double Pi = 3.14159;
        double radius;
        
        double doubleRadius;
        System.out.println(12.9 % 3.2);
        
        // Radius user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        radius = myScanner.nextDouble();
        System.out.println("Radius: " + radius);
        myScanner.close();
        
        doubleRadius = radius * 2;
        System.out.println("Radius (Doubled): " + doubleRadius);
        
        // Circumference of the circle
        double circumference = 2 * Pi * radius;
        System.out.println("Circumference: " + circumference);
        
        double doubleCircumference = 2 * Pi * doubleRadius;
        System.out.println("Circumference when radius is doubled: " + doubleCircumference);
        
        // Area of the circle
        double area = Pi * radius * radius;
        System.out.println("Area: " + area);
        
        double quadrupleArea = Pi * doubleRadius * doubleRadius;
        System.out.println("Area when radius is doubled: " + quadrupleArea);

    }

}
