package q3;

/**
 * Message.
 * This class contains a long[] and a count of how many characters are
 * in a message object. If a Message is less than 11 valid MIXChar characters,
 * then the class will replace the empty space with 0's and include the 0's in
 * the encoding process.
 * @author cyrus
 * @version 1.0
 */
public class Message {
    
    /** Constant int that represents the max number of MIXChar
     *  characters in a long array. */
    private static final int MIXPACK = 11;
    
    /** Constant that represents base of MIXChar list. */
    private static final int MIXBASE = 56;
    
    /** Stores long values as an array of longs. */
    private long[] longArray;
    
    /** Stores the number of characters in message object. */
    private int count;
    
    /**
     * Constructor that stores array of MIXChar characters in long array.
     * @param m the MIXChar character array to check.
     */
    public Message(MIXChar[] m) {
        count = m.length;
        instantiateLongArray(m);
    }
    
    /**
     * Constructor that converts string message to MIXChar characters to later
     * store in long array. Also sets the count to the string length.
     * @param s the string message to convert.
     */
    public Message(String s) {
        count = s.length();
        MIXChar[] mixArray = MIXChar.toMIXChar(s);
        instantiateLongArray(mixArray);
    }

    /**
     * Support method used to instantiate the long array and return an array
     * of longs, as well as setting the limit of longs to be 11 longs per array.
     * @param mixArray the array to check.
     * @return array of long values.
     */
    private long[] instantiateLongArray(MIXChar[] mixArray) {
        int inputLength = mixArray.length;
        
        // Sets the size of the long array.
        if (mixArray.length % MIXPACK == 0) {
            longArray = new long[(mixArray.length / MIXPACK)];
        } else {
            longArray = new long[(mixArray.length / MIXPACK) + 1];
        }
        
        for (int i = 0; i < longArray.length; i++) {
            
            // Add valid MIXChar characters into array until
            // max array size is reached (11 characters).
            for (int j = 0; j < MIXPACK && inputLength > 0; j++) {
                longArray[i] = (longArray[i] * MIXBASE) 
                        + ((long) mixArray[j + (i * MIXPACK)].ordinal());
                inputLength--;
            }
        }
        return longArray;
    }
    
    /**
     * Returns a string corresponding to the characters in the message.
     * @return message as string.
     */
    public String toString() {
        String messageAsString = "";

        for (int i = 0; i < longArray.length; i++) {
            long decodedMIXChar = longArray[i];
            String tempStr = "";
            
            // Decode MIXChar characters back into string.
            for (int j = 0; j < MIXPACK; j++) {
                int ordinal = (int)
                        Long.remainderUnsigned(decodedMIXChar, MIXBASE);
                decodedMIXChar = Long.divideUnsigned(decodedMIXChar, MIXBASE);
                tempStr = MIXChar.mixCharRef(ordinal) + tempStr;
                
                // Break out of loop to avoid blank spaces while
                // decoding the MIXChar characters as a string.
                if (i * MIXPACK + j == count - 1) {
                    break;
                }
            }
            
            messageAsString += tempStr;
        }

        return messageAsString;
    }
    
    /**
     * Returns a string which is the instance long[] formatted 
     * as unsigned integers and separated by spaces.
     * @return unsigned integers in long array as a string.
     */
    public String toLongs() {
        String longAsString = "";
        for (int l = 0; l < longArray.length; l++) {
            longAsString += Long.toUnsignedString(longArray[l]) + " ";
        }
        
        return longAsString;
    }
}
