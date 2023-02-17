package q3;

import java.util.Scanner;

/**
 * TestMIXChar.
 * This class prints out an encoded input of MIXCharacters as a Message, and
 * decodes the Message into a Java string, throwing an error if any characters
 * in the input are not MIXChar characters.
 * @author cyrus
 * @version 1.0
 */
public class TestMIXChar {
    
    /**
     * This is the main method (entry point) that gets called by the JVM.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a message using MIXChar characters: ");
        String userInput = scan.nextLine();
        
        Message userMessage = new Message(userInput);
        
        MIXChar[] mixArray = MIXChar.toMIXChar(userInput);
        Message mixMessage = new Message(mixArray);
        
        System.out.println("Encoded (String): " + userMessage.toLongs());
        System.out.println("Decoded (String): " + userMessage.toString());
        
        System.out.println("Encoded (MIXChar Array): " + mixMessage.toLongs());
        System.out.println("Decoded (MIXChar Array): " + mixMessage.toString());
        
        scan.close();
    }
    
}
