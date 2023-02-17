package q2;

/**
 * <p>Word.
 * This class contains the methods needed to output
 * the most frequently appearing words in a given text file.</p>
 *
 * @author cyrus
 * @version 1.0
 */
public class Word implements Comparable<Word> {
    /** String that is constant after it is added to ArrayList. */
    private final String word;
    
    /** Integer that stores the amount of times a word appears in
     * the given text file. 
     */
    private int frequency;
    
    /**
     * Initializes a Word object with a given word, and sets its
     * frequency to one.
     * 
     * @param word the given word to store in Word object.
     */
    public Word(String word) {
        this.word = word;
        this.frequency = 1;
    }
    
    /**
     * Returns the word itself.
     * 
     * @return the given word
     */
    public String getWord() {
        return word;
    }
    
    /**
     * Returns the frequency of a given word.
     * 
     * @return frequency of word.
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * Increases the frequency of a word by one.
     */
    public void increaseFrequency() {
        frequency++;
    }
    
    /**
     * Checks if a given word has a higher frequency than another word;
     * if the word's frequency is higher, then it will come first.
     * 
     * @param w the word to compare.
     * @return frequency of word.
     */
    public int compareTo(Word w) {
        if (this.frequency > w.frequency) {
            return -1;
        } else if (this.frequency < w.frequency) {
            return 1;
        }
        return 0;
    }
    
    /**
     * Outputs the amount of times a given word appears
     * in the text file.
     * 
     * @return amount of times a given word appears in text file.
     */
    public String toString() {
        return "Word: " + this.word 
                + "\nThis word appears " + this.frequency 
                + " times.\n";
    }
}
