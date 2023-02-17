package q1;

/**
 * <p>Cylinder.
 * A class that contains required methods to calculate
 * a cylinder's surface area and volume.</p>
 * 
 * @author cyrus
 * @version 1.0
 */
public class Cylinder {
    
    /** Instance variable that stores the radius of the cylinder.*/
    private double radius;
    
    /** Instance variable that stores the height of the cylinder.*/
    private double height;
    
    /** 
     * Cylinder constructor that takes in radius and height parameters.
     * 
     * @param r radius of cylinder.
     * @param h height of cylinder.
     */
    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }
    
    /**
     * Returns the radius of the cylinder.
     * @return radius of cylinder.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Allows the radius to be modified by the driver class.
     * @param r sets the radius.
     */
    public void setRadius(double r) {
        this.radius = r;
    }
    
    /**
     * Returns the height of the cylinder.
     * @return height of cylinder.
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Allows the height to be modified by the driver class.
     * @param h sets the height.
     */
    public void setHeight(double h) {
        this.height = h;
    }
    
    /**
     * Returns the volume of the cylinder.
     * @return volume of cylinder.
     */
    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height);
    }
    
    /**
     * Returns the surface area of the cylinder.
     * @return surface area of cylinder.
     */
    public double surfaceArea() {
        return (2 * Math.PI * radius * (radius + height));
    }
    
    /** 
     * Returns a two-line description of cylinder. 
     * 
     * @return radius and height of cylinder on separate lines.
     */
    public String toString() {
        return ("\nRadius: " + radius
                + "\nHeight: " + height);
    }
}
