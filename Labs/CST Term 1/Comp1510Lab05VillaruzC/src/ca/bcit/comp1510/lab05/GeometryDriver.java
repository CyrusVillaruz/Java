/**
 * 
 */

package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;
// import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Q7: You can use the NumberFormat .setMaximumFractionDigits(int newValue) to 
 * format the output, where the number in the parenthesis is the maximum
 * number of decimal places after the integer. Remove the comment in the
 * NumberFormat import declaration to test.
 * 
 * GeometryDriver.
 * This class creates shapes from the Sphere, Cube, and Cone
 * classes.
 * @author cyrus
 * @version 1.0
 */
public class GeometryDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        // Sets up decimal format to output sphere
        // surface area and volume to three decimal places.
        DecimalFormat fmt = new DecimalFormat("#.###");
        
        // Q7: Sets up decimal format using NumberFormat.
        // .getInstance() is used to get a standard / normal
        // number format. Replace fmt with numFormat to test.
        // NumberFormat numFormat = NumberFormat.getInstance();
        // numFormat.setMaximumFractionDigits(3);
        
        // Prompts user input for sphere information.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a radius for a sphere: ");
        double sphereRadius = scan.nextDouble();
        
        System.out.println("Please enter the x, y, and z "
                + "coordinates of a sphere: ");
        double sphereX = scan.nextDouble();
        double sphereY = scan.nextDouble();
        double sphereZ = scan.nextDouble();
        
        // Instantiating sphere object
        Sphere sphere;
        sphere = new Sphere(sphereRadius, sphereX, sphereY, sphereZ);
        
        // Outputs the surface area and volume of the sphere
        // to three decimal places.
        System.out.println("Sphere Surface Area: " 
                + fmt.format(sphere.surfaceArea()));
        System.out.println("Sphere Volume: " + fmt.format(sphere.volume()));
        
        // Prompts user for cube information
        System.out.println("Please enter an edge length for the cube: ");
        double cubeEdge = scan.nextDouble();
        
        System.out.println("Please enter the x, y, and z"
                + "coordinates of a cube: ");
        double cubeX = scan.nextDouble();
        double cubeY = scan.nextDouble();
        double cubeZ = scan.nextDouble();
        
        // Instantiating cube object
        Cube cube;
        cube = new Cube(cubeEdge, cubeX, cubeY, cubeZ);
        
        // Outputs the surface area, volume, face diagonal,
        // and space diagonal of the cube to three decimal places.
        System.out.println("Cube Surface Area: " 
                + fmt.format(cube.surfaceArea())
                + "\nCube Volume: " + fmt.format(cube.volume()));
        System.out.println("Cube Face Diagonal: " 
                + fmt.format(cube.faceDiagonal())
                + "\nCube Space Diagonal: "
                + fmt.format(cube.spaceDiagonal()));
        
        // Prompts user for cone information
        System.out.println("Please enter a radius and height for the cone: ");
        double coneRadius = scan.nextDouble();
        double coneHeight = scan.nextDouble();
        
        // Instantiating sphere object
        Cone cone;
        cone = new Cone(coneRadius, coneHeight);
        
        // Outputs the surface area, volume, face diagonal,
        // and space diagonal of the cube to three decimal places.
        System.out.println("Cone Surface Area: " 
                + fmt.format(cone.surfaceArea())
                + "\nVolume: "
                + fmt.format(cone.volume()));
        System.out.println("Cone Slant Height: " 
                + fmt.format(cone.slantHeight()));

 
        scan.close();

    }

}
