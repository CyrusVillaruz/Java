/**
 * 
 */
package ca.bcit.comp1510.lab01;

/**
 * Prints a Hello World message.
 * 
 * @author BCIT
 * @version 2022
 */
public class Hello {

    /**
     * Prints the greeting.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
/**
 * Question 4-2a
 * - "Could not find or load main class ca.bcit.comp1510.lab01.Hello in module Comp1510Lab01VillaruzC"
 * 
 * Question 4-2b
 * - There is no error because the message is contained as a string. The original "hello world" message
 * is printed with one less l ("Helo World")
 * 
 * Question 4-2c
 * - I got the following error message(s):
 *  "Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 *  String literal is not properly closed by a double-quote
 *
 *  at Comp1510Lab01VillaruzC/ca.bcit.comp1510.lab01.Hello.main(Hello.java:21)"
 *  
 * Question 4-2d
 * - I got around four errors if I'm reading this right:
 * "Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
 *   Syntax error on token(s), misplaced construct(s)
 *   Syntax error on token "!", ; expected
 *   String literal is not properly closed by a double-quote
 *
 *    at Comp1510Lab01VillaruzC/ca.bcit.comp1510.lab01.Hello.main(Hello.java:21)"
 *
 * Question 4-2e
 * - I got a compile-time error:
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 *   Syntax error, insert ";" to complete BlockStatements
 *
 *   at Comp1510Lab01VillaruzC/ca.bcit.comp1510.lab01.Hello.main(Hello.java:21)
 * 
 */
}
