/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * CardGame.
 * A program that outputs a random card.
 * @author cyrus
 * @version 1.0
 */
public class CardGame {
    /**
    * Enumeration type representing card ranks.
    */
    enum Rank {
       /** Card rank Ace. */
       Ace,
       /** Card rank Two. */
       Two,
       /** Card rank Three. */
       Three,
       /** Card rank Four. */
       Four,
       /** Card rank Five. */
       Five,
       /** Card rank Six. */
       Six,
       /** Card rank Seven. */
       Seven,
       /** Card rank Eight. */
       Eight,
       /** Card rank Nine. */
       Nine,
       /** Card rank Ten. */
       Ten,
       /** Card rank Jack. */
       Jack,
       /** Card rank Queen. */
       Queen,
       /** Card rank King. */
       King
    }
    
    enum Suit {
        /** Card suit Spades. */
        Spades,
        /** Card suit Clubs. */
        Clubs,
        /** Card suit Hearts. */
        Hearts,
        /** Card suit Diamonds. */
        Diamonds
    }
    /**
     * Drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        Random randomCard = new Random();
        
        // Selects a random card rank from the "Rank" enumeration.
        int randomRankChoice = randomCard.nextInt(Rank.values().length);
        Rank randomCardRank = Rank.values()[randomRankChoice];
        
        // Selects a random card suit from the "Suit" enumeration.
        int randomSuitChoice = randomCard.nextInt(Suit.values().length);
        Suit randomCardSuit = Suit.values()[randomSuitChoice];
        
        // Prints the randomly generated card from the code above.
        System.out.println("Card Generated: " + randomCardRank 
                +  " of " + randomCardSuit);
        
    }

}
