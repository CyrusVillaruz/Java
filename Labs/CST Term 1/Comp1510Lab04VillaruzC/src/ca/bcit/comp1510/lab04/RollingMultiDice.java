/**
 * 
 */

package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * RollingMultiDice.
 * A program that runs methods from the 
 * MultiDie.java file.
 * @author cyrus
 * @version 1.0
 */
public class RollingMultiDice {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number of faces for the first die: ");
        int die1Face = scan.nextInt();
        System.out.println("Input a number of faces for the second die: ");
        int die2Face = scan.nextInt();
        
        MultiDie die1;
        MultiDie die2;
        int sum;

        die1 = new MultiDie(die1Face);
        die2 = new MultiDie(die2Face);

        die1.roll();
        die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        die1.roll();
        die2.setFaceValue(die2Face);
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);

        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);
        
        scan.close();
    }
}
