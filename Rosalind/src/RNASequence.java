/**
 * This class represents an RNA sequence
 */

/**
 * @author Brendan Dolan
 * 
 */
public class RNASequence implements RNASequenceInterface {

	private String seq;
	private int countOfA;
	private int countOfC;
	private int countOfG;
	private int countOfU;

	public RNASequence(String str) {
		countOfA = 0;
		countOfC = 0;
		countOfG = 0;
		countOfU = 0;
		
		//check for validity
		for (int i = 0; i < str.length(); ++i) {
			char c = str.charAt(i);
			switch (c) {
			case 'A' : ++countOfA; break;
			case 'C' : ++countOfC; break;
			case 'G' : ++countOfG; break;
			case 'U' : ++countOfU; break;
				default : throw new IllegalArgumentException(
						"Bad DNA code '" + c + "' at position " + i);
			}
		}
		this.seq = str;
	}
	
	/* (non-Javadoc)
	 * @see RNASequenceInterface#nucleotideCount()
	 */
	@Override
	public int nucleotideCount() {
		return seq.length();
	}
	
	/* (non-Javadoc)
	 * @see RNASequenceInterface#countA()
	 */
	@Override
	public int countA() {
		return countOfA;
	}
	
	/* (non-Javadoc)
	 * @see RNASequenceInterface#countC()
	 */
	@Override
	public int countC() {
		return countOfC;
	}
	
	/* (non-Javadoc)
	 * @see RNASequenceInterface#countG()
	 */
	@Override
	public int countG() {
		return countOfG;
	}
	
	/* (non-Javadoc)
	 * @see RNASequenceInterface#countU()
	 */
	@Override
	public int countU() {
		return countOfU;
	}
	
	/* (non-Javadoc)
	 * @see RNASequenceInterface#RNACodon()
	 */
	@Override
	public String RNACodon() {
		String str = "UUUUUC";
		String str3 = "";
		int i = 0;
		String str2 = str.substring(0, 3);
		if (str2 == "UUU") {
			str3 += 'F';
		} else {
			str3 += 'G';
		}
		return str3;
	}
}
