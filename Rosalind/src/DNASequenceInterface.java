public interface DNASequenceInterface {

	/**
	 * 
	 * @return
	 */
	public abstract int nucleotideCount();

	/**
	 * 
	 * @return
	 */
	public abstract int countA();

	/**
	 * 
	 * @return
	 */
	public abstract int countC();

	/**
	 * 
	 * @return
	 */
	public abstract int countG();

	/**
	 * 
	 * @return
	 */
	public abstract int countT();

	/**
	 * 
	 * @return
	 */
	public abstract double gc_content();

	/**
	 * 
	 * @return
	 */
	public abstract String reverseCompliment();

	/**
	 * 
	 * @param otherSequence
	 * @return
	 */
	public abstract int hammingDistance(String otherSequence);

	/**
	 * 
	 * @return
	 */
	public abstract String RNACodon();

}