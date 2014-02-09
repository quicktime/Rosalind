/**
 * 
 */
package edu.vtc.dtuinstra.rosalind;

/**
 * Interface for objects representing amino acid sequences. Quoting the <a
 * href="http://rosalind.info/problems/prot/">"Translating RNA Into Protein"
 * problem page</a> from <a
 * href="http://rosalind.info/problems/locations/">Project Rosalind</a>, "The 20
 * commonly occurring amino acids are abbreviated by using 20 letters from the
 * English alphabet (all letters except for B, J, O, U, X, and Z). Protein
 * strings are constructed from these 20 symbols."
 * 
 * Thus the only valid characters in an amino acid sequence are those in the
 * string "ACDEFGHIKLMNPQRSTVWY". If an implementing class has constructors that
 * take a string of amino acid codes as an argument, those constructors should
 * ensure that only the above listed characters are found in the argument
 * string. If any other characters are found, the constructor should throw an
 * IllegalArgumentException.
 * 
 * @author mrt
 */
public interface ProteinSequenceInterface {

	/**
	 * Count the number of characters in this ProteinSequence that match the
	 * given code.
	 * 
	 * @param code
	 *            the character to look for in this ProteinSequence
	 * @return the number of times the code appears
	 */
	public int countCode(char code);

	/**
	 * Count the number of amino acids in this ProteinSequence. Each amino acid
	 * is represented by one character, so the count of amino acids in the
	 * sequence is the same as the length of the sequence's string.
	 * 
	 * @return the number of amino acids (same as string length)
	 */
	public int aminoAcidCount();

	/**
	 * Count the number of letters in this ProteinSequence's string. Each
	 * character represents one amino acid, so the count of characters in the
	 * sequence's string is the same as the count of amino acids.
	 * 
	 * @return the length of the sequence's string (same as count of amino
	 *         acids)
	 */
	public int length();

	/**
	 * Return the weight of the protein coded for by this ProteinSequence, as
	 * described in the <a
	 * href="http://rosalind.info/problems/prtm/">"Calculating Protein Mass"
	 * problem</a> on Project Rosalind. The mass of each amino acid can be found
	 * in <a href="http://rosalind.info/glossary/monoisotopic-mass-table/">the
	 * "Monoisotopic mass table" glossary page</a>.
	 * 
	 * @return the total weight of the amino acids coded for in this
	 *         ProteinSequence
	 */
	public double weight();

	/**
	 * Return this sequence's amino acid string.
	 * 
	 * @return this sequence's amino acid string.
	 */
	@Override
	public String toString();

}