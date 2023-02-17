/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Mathematics.
 * This class stores useful constants in math, such as
 * pi and e, and useful methods used to perform calculations.
 * 
 * @author cyrus
 * @version 1.0
 */
public class Mathematics {
    /** Constant double that stores the value of PI.*/
    public static final double PI = Math.PI;

    /**
    * Returns the area of the circle with the specified radius.
    *
    * @param radius of the circle.
    * @return area as a double
    */
    public double getCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    
    /**
    * Returns the sum of the positive integers between 0 and the specified
    * number inclusive. If the specified number is negative, returns zero.
    *
    * @param number upper bound
    * @return sum as an integer
    */
    public int sumOfInts(int number) {
        int sum = 0;
        int i = 1;
        
        if (number == 0) {
            return 0;
        }
        while (i > 0 && i <= number) {
            sum = sum + i;
            i++;
        }

        return sum;
    }

    /**
    * Returns true if the specified value is positive, else false.
    *
    * @param number to test
    * @return true if number is positive, else false.
    */
    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }

    /**
    * Returns true if the specified value is even, else false.
    *
    * @param number to test
    * @return true if number is even, else false.
    */
    public boolean isEven(int number)  {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
    * Returns sum of the even numbers between 0 and the specified value,
    * inclusive. The value can be positive, negative, or zero.
    *
    * @param number upper bound
    * @return sum of the even numbers between 0 and number
    */
    public int sumOfEvens(int number) {
        int sum = 0;
        int i;
        
        if (number > 0) {
            i = 2;
            while (i <= number) {
                sum = sum + i;
                i = i + 2;  
            }
        } else if (number < 0) {
            i = 0 - 2;
            while (i >= number) {
                sum = sum + i;
                i = i - 2;
            }
        }
     
        return sum;
    }

}
