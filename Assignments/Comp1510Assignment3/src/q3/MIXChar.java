package q3;

/**
 * MIXChar.
 * This class represents a single MIXChar character.
 * @author cyrus
 * @version 1.0
 */
public class MIXChar {

    /** Constant char that represents Delta. */
    private static final char DELTA = '\u0394';
    
    /** Constant char that represents Sigma. */
    private static final char SIGMA = '\u03A3';
    
    /** Constant char that represents Pi. */
    private static final char PI = '\u03A0';

    /** Constant array that represents an array of MIXChar chars. */
    private static final char[] MIXCHARLIST = 
        {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', DELTA, 'J', 'K',
        'L', 'M', 'N', 'O', 'P', 'Q', 'R', SIGMA, PI, 'S', 'T', 'U', 
        'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6',
        '7', '8', '9', '.', ',', '(', ')', '+', '-', '*', '/', '=',
        '$', '<', '>', '@', ';', ':', '\''}; 
    
    /** Stores a MIXChar char as a Java char. */
    private char mixChar;
    
    /**
     * Constructor that represents a MIXChar character that 
     * converts a character c to a corresponding MIXChar.
     * @param c the character to convert.
     * @throws IllegalArgumentException if conversion is not possible.
     */
    public MIXChar(char c) throws IllegalArgumentException {
        if (isMIXChar(c)) {
            mixChar = c;
        } else {
            throw new IllegalArgumentException(
                    "Conversion not possible.");
        }
    }  
    
    /**
     * Checks if a given character c is a MIXChar.
     * @param c the character to check.
     * @return true if the character is a MIXChar, otherwise false.
     */
    public static boolean isMIXChar(char c) {
        for (int i = 0; i < MIXCHARLIST.length; i++) {
            if (c == MIXCHARLIST[i]) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Returns a string with characters corresponding to those in
     * the input array.
     * @param mixCharArray the array to check.
     * @return MIXChar array as a string.
     */
    public static String toString(MIXChar[] mixCharArray) {
        String mixCharString = "";
        for (int c = 0; c < mixCharArray.length; c++) {
            mixCharString += mixCharArray[c].toChar();
        }
        return mixCharString;
    }
    
    /**
     * Returns array of MIXChar characters corresponding to the characters
     * in the String s. 
     * @param s the string to check for characters.
     * @return an array of MIXChar characters.
     */
    public static MIXChar[] toMIXChar(String s)
        throws IllegalArgumentException {
        MIXChar[] mixCharArray = new MIXChar[s.length()];
        for (int i = 0; i < s.length(); i++) {
            MIXChar c = new MIXChar(s.charAt(i));
            if (isMIXChar(s.charAt(i))) {
                mixCharArray[i] = c;
            } else {
                throw new IllegalArgumentException(
                        "Character does not match any "
                        + "of the MIXChar characters");
            }
        }  
        return mixCharArray;
    }
    
    /**
     * Returns ordinal value of this MIXChar.
     * @return ordinal value of MIXChar
     */
    public int ordinal() {
        for (int i = 0; i < MIXCHARLIST.length; i++) {
            if (mixChar == MIXCHARLIST[i]) {
                return i;
            }
        }
        return mixChar;
    }
    
    /**
     * Additional method used to reference an ordinal value of
     * a MIXChar array in the Message class and return the MIXChar
     * character at the specific ordinal.
     * @param ordinal the ordinal value to check
     * @return the MIXChar at the ordinal value.
     */
    public static char mixCharRef(int ordinal) {
        return MIXCHARLIST[ordinal];
    }
    
    /**
     * Converts this MIXChar to the corresponding Java char.
     * @return MIXChar as Java char.
     */
    public char toChar() {
        return mixChar;
    }
    
    /**
     * Returns string containing this MIXChar as a Java char.
     * @return string containing MIXChar as a Java char.
     */
    public String toString() {
        return mixChar + "";
    }
}
