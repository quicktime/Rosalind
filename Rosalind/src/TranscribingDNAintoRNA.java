import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;


public class TranscribingDNAintoRNA {

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
		String dataStr = fscan.next(); // Read the first line into a String.
		fscan.close();
		String str = "";
		for (int i = 0; i < dataStr.length(); ++i) {
			char c = dataStr.charAt(i);
			switch (c) {
			case 'A':
				str += c;
				break;
			case 'C':
				str += c;
				break;
			case 'G':
				str += c;
				break;
			case 'T':
				str += 'U';
				break;
			default:
				throw new IllegalArgumentException("Bad DNA code '" + c
						+ "' at position " + i);
			}
		}
		System.out.println(str);
	}
}
