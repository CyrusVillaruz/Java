package ca.bcit.comp1510.lab09;

/**
 * CoinRunner.
 * This program flips a coin 100 times, created from the Coin class
 * and prints out the number of times Heads appears
 * in a row.
 * 
 * @author cyrus
 * @version 1.0
 */
public class CoinRunner {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        final int numOfCoinFlips = 100;
        int heads = 0;
        int headRuns = 0;
        
        Coin coin = new Coin();
        
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
}
