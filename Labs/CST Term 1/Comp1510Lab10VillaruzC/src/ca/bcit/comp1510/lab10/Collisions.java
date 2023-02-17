package ca.bcit.comp1510.lab10;

/**
 * Collisions.
 * Simulates collisions between two particles in a 2D plain.
 * @author cyrus
 * @version 1.0
 */
public class Collisions {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        final int twoMillion = 2000000;
        final int hundredThousand = 100000;
        final int three = 3;      
        
        int boundary = twoMillion;
        int maxSteps = hundredThousand;
        int numOfCollisions = 0;
        
        RandomWalker randomWalker1 = new RandomWalker(
                maxSteps, boundary, -three, 0);
        RandomWalker randomWalker2 = new RandomWalker(
                maxSteps, boundary, three, 0);
        
        for (int c = 0; c < maxSteps; c++) {
            randomWalker1.takeStep();
            randomWalker2.takeStep();
            
            if (samePosition(randomWalker1, randomWalker2)) {
                numOfCollisions++;
            }
        }
        
        System.out.println("Number of collisions: " + numOfCollisions);
        System.out.println("RandomWalker 1's farthest distance is " 
                + randomWalker1.getMaximumDistance());
        System.out.println("RandomWalker 2's farthest distance is " 
                + randomWalker2.getMaximumDistance());

    }
    
    /**
     * Returns true if the two RandomWalker objects' coordinates are the same
     * (if they collided).
     * @param one the first RandomWalker object to check.
     * @param two the second RandomWalker object to check.
     * @return true if two RandomWalker objects collided
     */
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        return one.getX() == two.getX() && one.getY() == two.getY();
    }
    
    /*
     * Exercise 5 Q6:
     * 
     * After doing about 20-30 test runs, the farthest distance seems to
     * be around 500 to 550 units. Changing the number of steps, as well as the
     * position of the particles, will change the value of the farthest distance
     * of the particles.
     */

}
