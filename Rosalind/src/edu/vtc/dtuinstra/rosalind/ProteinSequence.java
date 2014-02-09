/**
 * 
 */
package edu.vtc.dtuinstra.rosalind;

/**
 * @author Brendan Dolan
 *
 */
public class ProteinSequence implements ProteinSequenceInterface {
	
	private String seq;
	
	public ProteinSequence(String str) {
		for (int i = 0; i < str.length(); ++i) {
			char c = str.charAt(i);
			switch (c) {
			case 'A' : break;
			case 'C' : break;
			case 'D' : break;
			case 'E' : break;
			case 'F' : break;
			case 'G' : break;
			case 'H' : break;
			case 'I' : break;
			case 'K' : break;
			case 'L' : break;
			case 'M' : break;
			case 'N' : break;
			case 'P' : break;
			case 'Q' : break;
			case 'R' : break;
			case 'S' : break;
			case 'T' : break;
			case 'V' : break;
			case 'W' : break;
			case 'Y' : break;
				default : throw new IllegalArgumentException(
						"Bad Amino Acid '" + c + "' at position " + i);
			}
		}
		this.seq = str;
	}

	/* (non-Javadoc)
	 * @see edu.vtc.dtuinstra.rosalind.ProteinSequenceInterface#countCode(char)
	 */
	@Override
	public int countCode(char code) {
		int count = 0;
		for (int i = 0; i < this.seq.length(); ++i) {
			char c = this.seq.charAt(i);
			if (c == code) {
				count++;
			}
		}
		return count;
	}

	/* (non-Javadoc)
	 * @see edu.vtc.dtuinstra.rosalind.ProteinSequenceInterface#aminoAcidCount()
	 */
	@Override
	public int aminoAcidCount() {
		return this.seq.length();
	}

	/* (non-Javadoc)
	 * @see edu.vtc.dtuinstra.rosalind.ProteinSequenceInterface#length()
	 */
	@Override
	public int length() {
		return this.seq.length();
	}

	/* (non-Javadoc)
	 * @see edu.vtc.dtuinstra.rosalind.ProteinSequenceInterface#weight()
	 */
	@Override
	public double weight() {
		double weight = 0;
		for (int i = 0; i < this.seq.length(); ++i) {
			char c = this.seq.charAt(i);
			switch (c) {
			case 'A' : weight += 71.03711; break;
			case 'C' : weight += 103.00919; break;
			case 'D' : weight += 115.02694; break;
			case 'E' : weight += 129.04259; break;
			case 'F' : weight += 147.06841; break;
			case 'G' : weight += 57.02146; break;
			case 'H' : weight += 137.05891; break;
			case 'I' : weight += 113.08406; break;
			case 'K' : weight += 128.09496; break;
			case 'L' : weight += 113.08406; break;
			case 'M' : weight += 131.04049; break;
			case 'N' : weight += 114.04293; break;
			case 'P' : weight += 97.05276; break;
			case 'Q' : weight += 128.05858; break;
			case 'R' : weight += 156.10111; break;
			case 'S' : weight += 87.03203; break;
			case 'T' : weight += 101.04768; break;
			case 'V' : weight += 99.06841; break;
			case 'W' : weight += 186.07931; break;
			case 'Y' : weight += 163.06333 ; break;
			}
		}
		return weight;
	}
}
