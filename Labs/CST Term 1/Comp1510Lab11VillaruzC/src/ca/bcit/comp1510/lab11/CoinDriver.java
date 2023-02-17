package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * CoinDriver.
 * Tests the Lockable interface implemented in the Coin class by preventing 
 * the user to flip a Coin if it is locked.
 * 
 * @author cyrus
 * @version 1.0
 */
public class CoinDriver {

    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        final int numOfCoinFlips = 25;
        final int coinKey = 1234;
        int heads = 0;
        int headRuns = 0;
        Coin coin = new Coin();
        coin.setKey(coinKey);
        coin.lock(coinKey);

        Scanner scan = new Scanner(System.in);
        System.out.println("Unlock the coin: ");
        int key = readInt(scan);
        coin.unlock(key);
        
        while (coin.locked()) {
            System.out.println("This coin is locked! "
                    + "Unlock the coin to flip it."
                    + "\nUnlock the coin: ");
            key = readInt(scan);
            coin.unlock(key);
        }

        if (!coin.locked()) {
            for (int c = 0; c < numOfCoinFlips; c++) {
                coin.flip();

                if (coin.isHeads()) {
                    System.out.println("HEADS");
                    heads++;
                } else {
                    if (heads > headRuns) {
                        headRuns = heads;
                    }
                    System.out.println("TAILS");
                    heads = 0;
                }
            }
            System.out.println("The longest run of heads is " + headRuns);
        }

        scan.close();
    }

    /**
     * Support method that prompts user for a valid integer input.
     * 
     * @param scan the scanner that checks user input.
     * @return a valid integer.
     */
    private static int readInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("That is not an integer!" 
                    + "\nEnter an integer: ");
        }
        return scan.nextInt();
    }

}
