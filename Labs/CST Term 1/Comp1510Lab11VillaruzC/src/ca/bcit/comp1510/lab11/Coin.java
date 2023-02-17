package ca.bcit.comp1510.lab11;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;

    /** Coin's key. */
    private int coinKey;

    /** Represents whether coin is locked or not. */
    private boolean locked;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        locked = false;
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        if (!locked) {
            face = (int) (Math.random() * 2);
        } else {
            System.out.println("This coin is locked!"
                    + " You must unlock this coin first.");
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * 
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * 
     * @return toString description
     */
    public String toString() {
        String faceName;
        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }

        return faceName;

    }

    @Override
    public void setKey(int key) {
        coinKey = key;
    }

    @Override
    public boolean lock(int key) {
        if (key == coinKey) {
            locked = true;
        }
        return locked;
    }

    @Override
    public boolean unlock(int key) {
        if (key == coinKey) {
            locked = false;
        }
        return locked;
    }

    @Override
    public boolean locked() {
        return locked;
    }
}
