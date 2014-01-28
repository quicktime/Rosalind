/**
 * This class represents a DNA sequence.
 */

/**
 * @author Brendan Dolan
 * 
 */
public class DNASequence {

	private String seq;
	private int countOfA;
	private int countOfC;
	private int countOfG;
	private int countOfT;

	public DNASequence(String str) {
		countOfA = 0;
		countOfC = 0;
		countOfG = 0;
		countOfT = 0;
		
		//check for validity
		for (int i = 0; i < str.length(); ++i) {
			char c = str.charAt(i);
			switch (c) {
			case 'A' : ++countOfA; break;
			case 'C' : ++countOfC; break;
			case 'G' : ++countOfG; break;
			case 'T' : ++countOfT; break;
				default : throw new IllegalArgumentException(
						"Bad DNA code '" + c + "' at position " + i);
			}
			this.seq = str;
		}
	}

	public int nucleotideCount() {
		return seq.length();
	}

	public int countA() {
		return countOfA;
	}

	public int countC() {
		return countOfC;
	}

	public int countG() {
		return countOfG;
	}

	public int countT() {
		return countOfT;
	}

	public double gc_content() {
		int numerator = countG() + countC();
		int denominator = nucleotideCount();
		return (100.0 * numerator / denominator);
	}
	
	private String reverse(String str) {
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; --i) {
			char c = str.charAt(i);
			str2 += c;
		}
		return str2;
	}
	
	private String compliment(String str) {
		String str2 = "";
		for (int i = 0; i < str.length(); ++i) {
			char c = str.charAt(i);
			switch (c) {
			case 'A':
				str2 += 'T';
				break;
			case 'C':
				str2 += 'G';
				break;
			case 'G':
				str2 += 'C';
				break;
			case 'T':
				str2 += 'A';
				break;
			default:
				throw new IllegalArgumentException("Bad DNA code '" + c
						+ "' at position " + i);
			}
		}
		return str2;
	}
	
	public String reverseCompliment() {
		return reverse(compliment(this.seq));
	}
	
//	private int countCode(char c) {
//		int count = 0;
//		for (int i = 0; i < seq.length(); ++i) {
//			if (seq.charAt(i) == c) {
//				count++;
//			}
//		}
//		return count;
//	}
	
}