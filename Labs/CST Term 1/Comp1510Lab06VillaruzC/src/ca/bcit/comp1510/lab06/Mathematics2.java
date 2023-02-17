/**
 * 
 */

package ca.bcit.comp1510.lab06;

import java.util.Random;

/**
 * Mathematics2.
 * A class that satisfies the JUnit tests for Mathematics2Test.java
 * @author cyrus
 * @version 1.0
 */
public class Mathematics2 {
    
    /**
     * A ratio that correctly converts from feet to kilometers when used.
     */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    /**
    * Returns the area of the square with the specified edge length.
    *
    * @param edgeLength of the square.
    * @return area as a double
    */
    public double getSquareArea(double edgeLength) {
        return edgeLength * edgeLength;
    }
    
    /**
    * Returns the sum of the specified values.
    *
    * @param first operand
    * @param second operand
    * @return sum of the operands
    */
    public double add(double first, double second) {
        return first + second;
    }
    
    /**
    * Returns the product of the specified values.
    *
    * @param first operand
    * @param second operand
    * @return product of the operands
    */
    public double multiply(double first, double second) {
        return first * second;
    }
    
    /**
    * Returns the difference of the specified values.
    *
    * @param first operand
    * @param second operand
    * @return difference of the operands
    */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
    * Returns the quotient of the specified values. If the divisor is zero,
    * returns zero instead of NaN or infinity.
    *
    * @param first operand
    * @param second operand
    * @return quotient of the operands
    */
    public double divide(int first, int second) {
        // Allows for division of zero.  
        if (second == 0) {
            return 0;
        } else {
            return first / second;
        }    
    }

    /**
    * Returns the absolute value of the specified integer.
    *
    * @param number to test
    * @return absolute value of number
    */
    public int absoluteValue(int number) {
        return Math.abs(number);
    }

    /**
    * Returns a random number between 10 and 20 inclusive,
    * but NOT 15.
    * @return random number in range [10, 20] excluding 15.
    */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        int randomNumber;
        final int five = 5;
        final int ten = 10;
        
        Random random = new Random();
        randomNumber = random.nextInt((ten + ten + 1));
        
        while (randomNumber < ten || randomNumber == (ten + five)
                || randomNumber > (ten + ten)) {
            randomNumber = random.nextInt((ten + ten + 1));
        }
        return randomNumber;
    }

    /**
    * Converts the specified number of feet to kilometres.
    * @param feet to convert
    * @return kilometres in the specified number of feet
    */
    public double convertFeetToKilometres(double feet) {
        return feet * FOOT_TO_KILOMETRE_RATIO;
    }

    /**
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. For example, sumOfProducts(10, 3) will return
    * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
    * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
    * return -2 + -4 + -6 + -8 + -10 = -30.
    * @param bound the upper bound
    * @param divisor the divisor
    * @return sum
    */
    public int sumOfProducts(int bound, int divisor) {
        int sum = 0;
        int i = 0;
        
        if (i <= bound) {
            for (i = 0; i <= bound; i++) {
                if (i % divisor == 0) {
                    sum += i;
                }
            }
        } else {
            for (i = 0; i >= bound; i--) {
                if (i % divisor == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
