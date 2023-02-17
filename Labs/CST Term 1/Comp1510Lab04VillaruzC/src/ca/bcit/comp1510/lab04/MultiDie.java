package ca.bcit.comp1510.lab04;

/**
 * Represents one die (singular of dice) with any number of faces.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author cyrus
 * @version 2017
 * 
 *      Q1. You do not need setters and getters for max, but you
 *      can choose to have a getter.
 * 
 *      Q2. You cannot have setters for max, since max is declared
 *      as a constant (via "final").
 * 
 *      Q3. If max is not set as final, then the user's die may change after
 *      each roll. For example, after a six-sided die is rolled, the next roll
 *      may turn that six-sided die to a seven-sided die.
 * 
 *      Q4. The object will only "know" how to use max instead of
 *      what max is and how it works.
 * 
 *      Q5. Yes. It is declared at the class level.
 */
public class MultiDie {
    /** Maximum face value. */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * Constructor sets the initial face value.
     * @param numSides an int.
     */
    public MultiDie(int numSides) {
        max = numSides;
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}

