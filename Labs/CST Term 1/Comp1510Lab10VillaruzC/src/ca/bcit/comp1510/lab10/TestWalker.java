package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * TestWalker.
 * Simulates a standard robot walking in a 2D plain.
 * @author cyrus
 * @version 1.0
 */
public class TestWalker {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        final int ten = 10;
        final int five = 5;
        final int twoHundred = 200;
        Scanner scan = new Scanner(System.in);
        
        RandomWalker randomWalker1 = new RandomWalker(ten, five);
        System.out.println("Random walker 1: " + randomWalker1.toString());
        
        System.out.println("Enter maximum number of steps: ");
        int maxNumOfSteps = scan.nextInt();
        System.out.println("Enter a boundary size: ");
        int boundary = scan.nextInt();
        
        RandomWalker randomWalker2 = new RandomWalker(maxNumOfSteps, boundary);
        System.out.println("User's walker: " + randomWalker2.toString());
      
        for (int i = 0; i < five; i++) {
            randomWalker1.takeStep();
            randomWalker2.takeStep();
            System.out.println("Random walker 1: " + randomWalker1.toString());
            System.out.println("User's walker: " + randomWalker2.toString());
        }
        
        RandomWalker randomWalker3 = new RandomWalker(twoHundred, ten);
        System.out.println("Random walker 3: " + randomWalker3);
        System.out.println("Random walker state: walk.\n");
        randomWalker3.walk();
        System.out.println("Random walker 3: " + randomWalker3);
        
        System.out.println("Max Distance: " 
                + randomWalker3.getMaximumDistance());

        scan.close();
    }

}
