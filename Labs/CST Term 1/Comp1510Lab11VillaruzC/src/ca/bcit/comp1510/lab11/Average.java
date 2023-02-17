package ca.bcit.comp1510.lab11;

/**
 * Average. Calculates and outputs the average of a given input through the
 * terminal.
 * 
 * @author cyrus
 * @version 1.0
 */
public class Average {

    /**
     * Drives the program.
     * 
     * @param args command-line arguments.
     */
    public static void main(String[] args) {
        double average = 0;
        int sum = 0;
        try {
            if (args.length > 0) {
                for (int i = 0; i < args.length; i++) {
                    sum += Integer.parseInt(args[i]);
                    average = (double) sum / args.length;
                }
            } else if (args.length == 0) {
                System.out.println("No Arguments!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Input an integer.");
            System.exit(1);
        }
        System.out.println("The average is: " + average);
    }
}
