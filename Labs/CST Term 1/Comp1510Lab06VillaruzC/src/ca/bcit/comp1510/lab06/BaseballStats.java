package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * @author blink
 * @version 1.0
 */

public class BaseballStats {
    
    /**
     * Reads baseball stats from a file and counts
     * total hits, outs, walks, and sacrifice flies
     * for each player.
     * @param args unused.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        Scanner scan = new Scanner(System.in);
        //TODO Read and process each line of the file
        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));
        
        // Checks file contents until it reaches the end of file.
        while (fileScan.hasNext()) {
            int hits = 0;
            int outs = 0;
            int walks = 0;
            int sacrifices = 0;
            
            lineScan = new Scanner(fileScan.nextLine());
            lineScan.useDelimiter(",");
            
            System.out.print("\nPlayer: " + lineScan.next());
            while (lineScan.hasNext()) {
                String content = lineScan.next();
                if (content.trim().equals("o")) {
                    outs++;
                } else if (content.trim().equals("h")) {
                    hits++;
                } else if (content.trim().equals("w")) {
                    walks++;
                } else if (content.trim().equals("s")) {
                    sacrifices++;
                }
            }
            // Outputs player statistics.
            double battingAverage = (double) hits / (hits + outs);
            System.out.println("\nOuts: " + outs
                    + "\nHits: " + hits + "\nWalks: " + walks
                    + "\nSacrifices: " + sacrifices
                    + "\nBatting Average: " + battingAverage);
            
            scan.close();
        }
    }
}
