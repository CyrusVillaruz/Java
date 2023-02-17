/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Cone.
 * This class stores the information needed to calculate the
 * surface area, volume, and slant height of a right cone.  
 * @author cyrus
 * @version 1.0
 */
public class Cone {
    /** Constant in that stores the value 3.*/
    private static final int THREE = 3;
    
    /** Double variable that stores the height.*/
    private double height;
    
    /** Double variable that stores the radius.*/
    private double radius;
    
    /**
     * Initializes variables for the Cone constructor.
     * @param coneHeight takes the cone's height.
     * @param coneRadius takes the cone's radius.
     */
    public Cone(double coneHeight, double coneRadius) {
        height = coneHeight;
        radius = coneRadius;
    }

    /**
     * Returns the height of the cone.
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Allows the height to be modified from other classes.
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the radius of the cone.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Allows the radius to be modified from other classes.
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Returns the surface area of the cone.
     * @return surface area of cone.
     */
    public double surfaceArea() {
        return Math.PI * Math.pow(radius, 2) 
                + Math.PI * radius * Math.sqrt(Math.pow(radius, 2) 
                + Math.pow(height, 2));
    }
    
    /**
     * Returns the volume of the cone.
     * @return volume of cone.
     */
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height / THREE;
    }
    
    /**
     * Returns the slant height of the cone.
     * @return slant height of cone.
     */
    public double slantHeight() {
        return Math.sqrt(Math.pow(radius, 2) 
                + Math.pow(height, 2));
    }
    
    /**
     * Returns the information of the cone.
     * @return cone information as a string.
     */
    public String toString() {
        String result = "Radius: " + radius
                + "Height: " + height;
        return result;
    }
    
}
