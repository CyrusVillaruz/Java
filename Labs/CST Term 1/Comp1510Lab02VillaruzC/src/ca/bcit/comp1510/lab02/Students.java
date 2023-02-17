/**
 * 
 */
package ca.bcit.comp1510.lab02;

/**
 * A table with students' total points from lab and any bonuses
 * @author cyrus
 * @version 1.0
 *
 */
public class Students {

    /**
     * Drives the program
     * @param args unused
     */
    public static void main(String[] args) {
        
        // Table header 
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t    Student Points\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
        
        // Table label
        System.out.println("Name\t\t" + "Lab\t" + "Bonus\t" + "Total\t");
        System.out.println("----\t\t" + "---\t" + "-----\t" + "-----\t");
        
        // Names of students, their points, and point total
        System.out.println("Joe\t\t" + "43\t" + "7\t" + (43 + 7));
        System.out.println("William\t\t" + "50\t" + "8\t" + (50 + 8));
        System.out.println("Mary Sue\t" + "39\t" + "10\t" + (39 + 10));
        System.out.println("Peng\t\t" + "87\t" + "6\t" + (87 + 6));
        System.out.println("Kwon\t\t" + "99\t" + "0\t" + (99 + 0));
    }

}
