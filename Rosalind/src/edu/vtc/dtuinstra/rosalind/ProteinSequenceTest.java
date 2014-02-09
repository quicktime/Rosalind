/**
 * 
 */
package edu.vtc.dtuinstra.rosalind;

/**
 * @author Brendan Dolan
 *
 */
public class ProteinSequenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sequence = "SKADYEK";
		ProteinSequenceInterface ps0 = new ProteinSequence(sequence);
		
		System.out.println(ps0.countCode('A'));
		System.out.println(ps0.aminoAcidCount());
		System.out.println(ps0.weight());

	}

}
