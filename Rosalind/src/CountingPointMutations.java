import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;


public class CountingPointMutations {

	public static void main(String[] args) throws FileNotFoundException {
		//
		// Let the user choose a file, using a GUI dialog
		//
		String filename = ""; // holds name of file that they'll choose
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
		String dataStr = fscan.nextLine(); // Read the first line into a String.
		String dataStr2 = fscan.nextLine(); // Read the second line into a String.
		fscan.close();
		
		DNASequenceInterface ds0 = new DNASequence(dataStr);
		
		System.out.println(ds0.hammingDistance(dataStr2));

	}

}
