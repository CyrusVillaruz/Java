package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * DrunkWalker.
 * Simulates a drunken walker walking in a 2D plain.
 * @author cyrus
 * @version 1.0
 */
public class DrunkWalker {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int numOfFalls = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of steps: ");
        int numOfSteps = scan.nextInt();
        System.out.println("Enter size of boundary: ");
        int boundary = scan.nextInt();
        System.out.println("Enter number of tests: ");
        int numOfTests = scan.nextInt();
        
        for (int d = 0; d < numOfTests; d++) {
            RandomWalker drunkWalker = new RandomWalker(
                    numOfSteps, boundary);
            drunkWalker.walk();
            if (drunkWalker.moreSteps()) {
                numOfFalls++;
            }
            
        }
        
        System.out.println("Number of tests:" + numOfTests);
        System.out.println("Number of falls: " + numOfFalls);
        
        scan.close();
    }
}
