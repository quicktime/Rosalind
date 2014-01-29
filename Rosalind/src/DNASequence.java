/**
 * This class represents a DNA sequence.
 */

/**
 * @author Brendan Dolan
 * 
 */
public class DNASequence implements DNASequenceInterface {

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

	/* (non-Javadoc)
	 * @see DNASequenceInterface#nucleotideCount()
	 */
	@Override
	public int nucleotideCount() {
		return seq.length();
	}

	/* (non-Javadoc)
	 * @see DNASequenceInterface#countA()
	 */
	@Override
	public int countA() {
		return countOfA;
	}

	/* (non-Javadoc)
	 * @see DNASequenceInterface#countC()
	 */
	@Override
	public int countC() {
		return countOfC;
	}

	/* (non-Javadoc)
	 * @see DNASequenceInterface#countG()
	 */
	@Override
	public int countG() {
		return countOfG;
	}

	/* (non-Javadoc)
	 * @see DNASequenceInterface#countT()
	 */
	@Override
	public int countT() {
		return countOfT;
	}

	/* (non-Javadoc)
	 * @see DNASequenceInterface#gc_content()
	 */
	@Override
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
	
	/* (non-Javadoc)
	 * @see DNASequenceInterface#reverseCompliment()
	 */
	@Override
	public String reverseCompliment() {
		return reverse(compliment(this.seq));
	}
	
	/* (non-Javadoc)
	 * @see DNASequenceInterface#hammingDistance(java.lang.String)
	 */
	@Override
	public int hammingDistance(String otherSequence) {
		String sequence = this.seq;
		int count = 0;
		if (sequence.length() != otherSequence.length()) {
			throw new IllegalArgumentException("Illegal String!");
		} else {
			for (int i = 0; i < otherSequence.length(); ++i) {
				char c = otherSequence.charAt(i);
				char c2 = sequence.charAt(i);
				
				if (c != c2) {
					count++;
				}
			}
		}
		return count;
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