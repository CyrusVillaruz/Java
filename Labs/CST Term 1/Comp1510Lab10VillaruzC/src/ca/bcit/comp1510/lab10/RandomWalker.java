package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * RandomWalker.
 * This class contains the methods and constructors used to simulate
 * a robot walking in a 2D plan, demonstrated in the TestWalker.java
 * and DrunkWalker classes.
 * @author cyrus
 * @version 1.0
 */
public class RandomWalker {
    /** Stores the x coordinate. */
    private int x;
    
    /** Stores the y coordinate. */
    private int y;
    
    /** Stores the maximum number of steps. */
    private int maxSteps;
    
    /** Stores the current number of steps. */
    private int currSteps;
    
    /** Stores the size of the square boundary. */
    private int boundary;
    
    /** Stores the maximum distance. */
    private int maximumDistance;
    
    /** Stores the distance of the walker from origin. */
    private int distanceToOrigin;
    
    /** Initialize a random object for random calculations. */
    private Random random = new Random();
    
    /**
     * Overloaded constructor that initializes max number of steps and
     * size of square boundary.
     * @param maxNumOfSteps the maximum number of steps of a RandomWalker.
     * @param theBoundary the size of a square boundary.
     */
    public RandomWalker(int maxNumOfSteps, int theBoundary) {
        this.maxSteps = maxNumOfSteps;
        this.boundary = theBoundary;
        this.x = 0;
        this.y = 0;
        this.currSteps = 0;
        this.maximumDistance = 0;
        this.distanceToOrigin = 0;
    }
    
    /**
     * Overloaded constructor that initializes max number of steps,
     * size of square boundary, and the walker's x and y coordinates.
     * @param maxNumOfSteps the maximum number of steps of a RandomWalker.
     * @param theBoundary the size of a square boundary.
     * @param xcoord the x coordinate of the RandomWalker.
     * @param ycoord the y coordinate of the RandomWalker.
     */
    public RandomWalker(int maxNumOfSteps, int theBoundary, 
            int xcoord, int ycoord) {
        this.maxSteps = maxNumOfSteps;
        this.boundary = theBoundary;
        this.x = xcoord;
        this.y = ycoord;
        this.currSteps = 0;
        this.maximumDistance = 0;
        this.distanceToOrigin = 0;
    }
    
    /**
     * Returns the x coordinate.
     * @return x coordinate.
     */
    public int getX() {
        return this.x;
    }
    
    /**
     * Returns the y coordinate.
     * @return y coordinate.
     */
    public int getY() {
        return this.y;
    }
    
    /**
     * Returns the maximum distance.
     * @return maximum distance.
     */
    public int getMaximumDistance() {
        return this.maximumDistance;
    }
    
    /**
     * Simulates the RandomWalker taking a step in any direction,
     * and sets the maximum distance to the distance the Walker is to
     * the origin or the maximum of its x and y coordinates.
     */
    public void takeStep() {
        final int numOfDirections = 4;
        final int up = 0;
        final int down = 1;
        final int left = 2;
        final int right = 3;
        
        int numOfSteps = random.nextInt(numOfDirections);
        
        switch (numOfSteps) {
            case right:
                x++;
                break;
            case left:
                x--;
                break;
            case up:
                y++;
                break;
            case down:
                y--;
                break;
            default:
                break;
        }
        
        if (distanceToOrigin > max(x, y)) {
            maximumDistance = distanceToOrigin;
        } else {
            maximumDistance = max(x, y);
        }
        
        currSteps++;
    }
    
    /**
     * Returns true if current number of steps is less 
     * than maximum number of steps.
     * @return true if currSteps is less than maxSteps.
     */
    public boolean moreSteps() {
        return (currSteps < maxSteps);
    }
    
    /**
     * Returns true if the Walker is within its square boundary.
     * @return true if Walker is within boundary.
     */
    public boolean inBounds() {
        return (Math.abs(x) <= boundary && Math.abs(y) <= boundary);
    }
    
    /**
     * Simulates walking while number of steps taken is less than the Walker's
     * maximum number of steps.
     */
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    /**
     * Support method that returns the maximum of a and b.
     * @param a the first integer to check.
     * @param b the second integer to check.
     * @return the maximum of a and b.
     */
    private int max(int a, int b) {
        return Math.max(Math.abs(a), Math.abs(b));
    }
    
    /**
     * Returns the Walker's instance variables into a string.
     * @return instance variables as a string.
     */
    public String toString() {
        return "\nx-coord: " + x 
                + "\ny-coord: " + y 
                + "\ncurrent steps: " +  currSteps;
    }
}
