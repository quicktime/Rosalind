import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 * Solution to Rosalind problem "Counting DNA Nucleotides".
 * 
 * @author Brendan Dolan
 * 27 Jan 2014
 */
public class CombingDNA {

	public static void main(String[] args) throws FileNotFoundException {
		
		//
		// Let the user choose a file, using a GUI dialog
		//
		String filename = "";		// holds name of file that they'll choose
		JFileChooser chooser = new JFileChooser();
		int choice = chooser.showOpenDialog(null);
		if (choice == JFileChooser.APPROVE_OPTION) {
			filename = chooser.getSelectedFile().getAbsolutePath();
		} else {
			System.out.println("Sorry, need a file to work on.");
			System.exit(0);
		}
		
		//
		// Get the data from a text file.
		//
		FileReader freader = new FileReader(filename);
		Scanner fscan = new Scanner(freader);
		String dataStr = fscan.nextLine();		// Read the first line into a String.
		String dataStr2 = fscan.nextLine();     // Read the second line into a String.
		fscan.close();

		//
		// Print the position where the second line is within the first.
		//
		int pos = dataStr.indexOf(dataStr2) + 1; // Assign pos to the first instance.
		System.out.print(pos + " "); // Print pos with a space.
		
		while (pos > 0) { // Loop control
			pos = dataStr.indexOf(dataStr2, pos + 1) + 1; // Assign pos to the next instances.
			if (pos != 0) { // If pos does not equal 0
				System.out.print(pos + " "); // Print pos
			}
		}
		
	}	// end main
	
}	// end class