/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Dice.
 * A program that outputs a value from 6 different dice.
 * @author cyrus
 * @version 1.0
 */

public class Dice {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int d4 = 4;
        final int d6 = 6;
        final int d8 = 8;
        final int d10 = 10;
        final int d12 = 12;
        final int d20 = 20;
        
        int roll1;
        int roll2;
        int roll3;
        int roll4;
        int roll5;
        int roll6;
        
        Random diceRoll = new Random();
        
        roll1 = diceRoll.nextInt(d4) + 1;
        System.out.println("Die 4 roll: " + roll1);

        roll2 = diceRoll.nextInt(d6) + 1;
        System.out.println("Die 6 roll: " + roll2);
        
        roll3 = diceRoll.nextInt(d8) + 1;
        System.out.println("Die 8 roll: " + roll3);
        
        roll4 = diceRoll.nextInt(d10) + 1;
        System.out.println("Die 10 roll: " + roll4);
        
        roll5 = diceRoll.nextInt(d12) + 1;
        System.out.println("Die 12 roll: " + roll5);
        
        roll6 = diceRoll.nextInt(d20) + 1;
        System.out.println("Die 20 roll: " + roll6);
        
        // Total dice roll
        System.out.println("Total dice roll: "); 
        System.out.println(roll1 + roll2 + roll3 + roll4 + roll5 + roll6);

    }

}
