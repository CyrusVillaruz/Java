package q1;

/**
 * <p>MultiCylinder
 * Uses methods from the Cylinder class to instantiate
 * cylinder objects.</p>
 *
 * @author cyrus
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final double radius1 = 4.5;
        final double height1 = 2.75;
        final double radius2 = 2.5;
        final double height2 = 1.75;

        Cylinder cylinder1 = new Cylinder(radius1, height1);
        Cylinder cylinder2 = new Cylinder(radius2, height2);
        
        // Prints cylinder1 and cylinder2's initial radius and height.
        System.out.println("Cylinder 1: " + cylinder1.toString());
        System.out.println("Cylinder 2: " + cylinder2.toString());
        
        // Modifies cylinder1 and cylinder2's radius and height.
        cylinder1.setRadius(radius1 * 2);
        cylinder1.setHeight(height1 * 2);
        
        cylinder2.setRadius(radius2 * 2);
        cylinder2.setHeight(height2 * 2);
        
        // Prints cylinder1 and cylinder2's modified radius and height.
        System.out.println("Modified Cylinder 1: " + cylinder1.toString());
        System.out.println("Modified Cylinder 2: " + cylinder2.toString());
        
        // Prints cylinder1 and cylinder2's surface area and volume.
        System.out.println("Cylinder1 Surface Area: " 
                + cylinder1.surfaceArea() + "\nCylinder1 Volume: "
                + cylinder1.volume());
        System.out.println("Cylinder2 Surface Area: " 
                + cylinder2.surfaceArea() + "\nCylinder2 Volume: "
                + cylinder2.volume());
    }
}
