/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Cube.
 * This class stores the information needed to calculate the
 * surface area, volume, face diagonal, and space diagonal
 * of the cube.
 * 
 * @author cyrus
 * @version 1.0
 */
public class Cube {
    /** Constant int that stores the value 3.*/
    private static final int THREE = 3;
    
    /** Constant int that stores the value 6.*/
    private static final int SIX = 6;
    
    /** Double variable that stores the x-coordinate.*/
    private double xcoord;
    
    /** Double variable that stores the y-coordinate.*/
    private double ycoord;
    
    /** Double variable that stores the z-coordinate.*/
    private double zcoord;
    
    /** Double variable that stores the edge length.*/
    private double edgeLength;
    
    /**
     * Initializes variables for the Cube constructor.
     * @param x takes cube's x-coordinate.
     * @param y takes cube's y-coordinate.
     * @param z takes cube's z-coordinate
     * @param edge takes cube's edge length.
     */
    public Cube(double x, double y,
            double z, double edge) {
        xcoord = x;
        ycoord = y;
        zcoord = z;
        edgeLength = edge;  
    }

    /**
     * Returns the x-coordinate.
     * @return the xcoord
     */
    public double getXcoord() {
        return xcoord;
    }

    /**
     * Allows the xcoord to be modified from other classes.
     * @param xcoord the xcoord to set
     */
    public void setXcoord(double xcoord) {
        this.xcoord = xcoord;
    }

    /**
     * Returns the y-coordinate.
     * @return the ycoord
     */
    public double getYcoord() {
        return ycoord;
    }

    /**
     * Allows the ycoord to be modified from other classes.
     * @param ycoord the ycoord to set
     */
    public void setYcoord(double ycoord) {
        this.ycoord = ycoord;
    }

    /**
     * Returns the z-coordinate.
     * @return the zcoord
     */
    public double getZcoord() {
        return zcoord;
    }

    /**
     * Allows the z-coordinate to be modified from other classes.
     * @param zcoord the zcoord to set
     */
    public void setZcoord(double zcoord) {
        this.zcoord = zcoord;
    }

    /**
     * Returns the edge length.
     * @return the edgeLength
     */
    public double getEdgeLength() {
        return edgeLength;
    }

    /**
     * Allows the edge length to be modified from other classes.
     * @param edgeLength the edgeLength to set
     */
    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    /**
     * Method that calculates the surface area of the cube.
     * @return the surface area
     */
    public double surfaceArea() {
        return SIX * Math.pow(edgeLength, 2);
    }
    
    /**
     * Returns the volume of the cube.
     * @return cube volume.
     */
    public double volume() {
        return Math.pow(edgeLength, THREE);
    }
    
    /**
     * Returns the face diagonal of the cube.
     * @return face diagonal of cube.
     */
    public double faceDiagonal() {
        return edgeLength * Math.sqrt(2);
    }
    
    /**
     * Returns the space diagonal of the cube.
     * @return space length of cube.
     */
    public double spaceDiagonal() {
        return edgeLength * Math.sqrt(THREE);
    }
    
    /**
     * Method that returns the information of the cube.
     * @return cube information as a string.
     */
    public String toString() {
        String result = "x-coordinate: " + xcoord
                + "y-coordinate: " + ycoord
                + "z-coordinate: " + zcoord
                + "Edge Length: " + edgeLength;
        return result;
    }
}
