package q2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * <p>WordCounter.
 * This class uses methods from the Word class to scan for every word in 
 * a given text file and outputs the number of words scanned in the file, 
 * as well as the top 10 most used words.</p>
 *
 * @author cyrus
 * @version 1.0
 */
public class WordCounter {
    /** ArrayList that stores the list of words. */
    private ArrayList<Word> wordList;
    
    /** WordCounter constructor that initializes ArrayList. */
    public WordCounter() {
        wordList = new ArrayList<Word>();
    }
    
    /**
     * Scans for words in the given text file and adds them to the
     * ArrayList. As long as the word is not empty, 
     * if the word is in the list, then its frequency is added.
     * Otherwise, the word is added to the list.
     * 
     * @param fileName the file to scan words from.
     * @return the amount of words in the list.
     */
    public int parseBook(String fileName) {
        try {
            Scanner fileScan = new Scanner(new File("src/" + fileName));
            while (fileScan.hasNext()) {
                String scannedWord = fileScan.next().
                        replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (!scannedWord.equals("")) {
                    Word word = new Word(scannedWord);
                    boolean wordFlag = true;
                    for (Word w : wordList) {
                        if (w.getWord().equals(word.getWord())) {
                            w.increaseFrequency();
                            wordFlag = false;
                            /* The break is not needed to run properly.
                            It's used to get out of the for-each loop after
                            it finds another instance of a word on the list and
                            increase its frequency, speeding up the process 
                            until the program has finished scanning through
                            the text file.*/
                            break;
                        }
                    }
                    if (wordFlag) {
                        wordList.add(word);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return wordList.size();
    }
    
    /**
     * Prints the most used words used in the given text file.
     * 
     * @param n the number of most used words to print out.
     */
    public void printTopWords(int n) {
        wordList.sort(null);
        for (int i = 0; i < n; i++) {
            System.out.println(wordList.get(i));
        }
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int ten = 10;
        
        /*
         * If you want to test another text file, either uncomment
         * the three lines of code below, uncomment the last line of code,
         * and pass "fileName" to the wordCounter's parseBook parameters,
         * or replace "bible.txt" in the parameters with the desired text file.
         * 
         * Make sure the text file is also in the "src" folder.
         */
        
        // Input a file name with its file type.
        // For example, bible.txt.
        //Scanner inputScanner = new Scanner(System.in);
        //System.out.print("Enter the file name: ");
        //String fileName = inputScanner.nextLine();
        
        WordCounter wordCounter = new WordCounter();
        int numOfWords = wordCounter.parseBook("bible.txt");
        System.out.println("Number of Unique Words: " + numOfWords);

        System.out.println("Top 10 words: ");
        wordCounter.printTopWords(ten);

        //inputScanner.close();
    }
}
