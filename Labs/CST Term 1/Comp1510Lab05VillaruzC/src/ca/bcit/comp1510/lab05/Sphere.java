/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Sphere.
 * This class stores the information needed to calculate
 * the surface area and volume of a sphere.
 * 
 * @author cyrus
 * @version 1.0
 */
public class Sphere {
    /** Constant int that stores the value 3.*/
    private static final int THREE = 3;
    
    /** Constant int that stores the value 4.*/
    private static final int FOUR = 4;
    
    /** Variable that stores the x-coordinate.*/
    private double coordx;
    
    /** Variable that stores the y-coordinate.*/
    private double coordy;
    
    /** Variable that stores the z-coordinate.*/
    private double coordz;
    
    /** Variable that stores the radius.*/
    private double radius;  
    
    /**
     * Initializes variables for the Sphere constructor.
     * @param x takes sphere's x coordinate.
     * @param y takes sphere's y coordinate.
     * @param z takes sphere's z coordinate.
     * @param r takes sphere's radius
     */
    public Sphere(double x, double y,
            double z, double r) {
        coordx = x;
        coordy = y;
        coordz = z;
        radius = r;
    }
    
    /** Double that returns the x-coordinate. 
     * @return coordx as a double.
     */ 
    public Double getCoordX() {
        return coordx;
    }
    
    /** Double that returns the y-coordinate. 
     * @return coordxy as a double.
     */ 
    public Double getCoordY() {
        return coordy;
    }
    
    /** Double that returns the z-coordinate. 
     * @return coordz as a double.
     */ 
    public Double getCoordZ() {
        return coordz;
    }
    
    /** Double that returns the radius. 
     * @return radius as a double.
     */ 
    public Double getRadius() {
        return radius;
    }
    
    /** Allows coordx to be modified from other classes.
     * @param xcoord modifies the x-coordinate.
     */
    public void setCoordX(double xcoord) {
        this.coordx = xcoord;
    }
    
    /** Allows coordy to be modified from other classes.
     * @param ycoord modifies the y-coordinate.
     */
    public void setCoordY(double ycoord) {
        this.coordy = ycoord;
    }
    
    /** Allows coordz to be modified from other classes.
     * @param zcoord modifies the z-coordinate.
     */
    public void setCoordZ(double zcoord) {
        this.coordz = zcoord;
    }
    
    /** Allows radius to be modified from other classes.
     * @param sphereRadius modifies the radius.
     */
    public void setRadius(double sphereRadius) {
        this.radius = sphereRadius;
    }
    
    /**
     * Method that calculates the surface area of a sphere.
     * @return surface area of sphere.
     */
    public Double surfaceArea() {        
        return FOUR * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * Method that calculates the volume of a sphere.
     * @return volume of sphere.
     */
    public Double volume() {    
        return (FOUR * Math.PI * (Math.pow(radius, THREE)) / THREE);
    }
    
    /**
     * Method that returns the concatenation of information in
     * sphere.
     * @return sphere information.
     */
    public String toString() {
        String result = "x-coordinate: " + coordx 
                + " y-coordinate: " + coordy 
                + " z-coordinate: " + coordz 
                + " Radius: " + radius
                + " Surface Area: " + surfaceArea()
                + " Volume: " + volume();
        return result;
        
    }
        

}
