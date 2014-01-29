public class DNASequenceTest {

	public static void main(String[] args) {
//		String dna_string0 = "AGGCTAGCTAGCTTGCTGACTGACCATCGCGTGTGCTCTCGCTGTAGCTGATCGCTGCTGATCGCTACGTAGCGATTTCGT";
//		String dna_string1 = "CCTGCGGAAGATCGGCACTAGAATAGCCAGAACCGTTTCTCTGAGGCTTCCGGCCTTCCCTCCCACTAATAATTCTGAGG";
//		String dna_string2 = "CCATCGGTAGCGCATCCTTAGTCCAATTAAGTCCCTATCCAGGCGCTCCGCCGAAGGTCTATATCCATTTGTCAGCAGACACGC";
//		String dna_string3 = "CCACCCTCGTGGTATGGCTAGGCATTCAGGAACCGGAGAACGCTTCAGACCAGCCCGGACTGGGAACCTGCGGGCAGTAGGTGGAAT";
//		
//		String sequence = "CAAG";
//		String otherSequence = "GTTG";
//		
//		DNASequenceInterface ds0 = new DNASequence(dna_string0);
//		DNASequenceInterface ds1 = new DNASequence(dna_string1);
//		DNASequenceInterface ds2 = new DNASequence(dna_string2);
//		DNASequenceInterface ds3 = new DNASequence(dna_string3);
//		
//		DNASequenceInterface ds4 = new DNASequence(sequence);
//		
//
//		System.out.println(ds1.gc_content() + "%");
//		System.out.println("");
//		
//
//		System.out.println(ds2.gc_content() + "%");
//		System.out.println("");
//		
//
//		System.out.println(ds3.gc_content() + "%");
//		System.out.println("");
//		
//		System.out.println(ds0.reverseCompliment());
//		
//		System.out.println(ds4.hammingDistance(otherSequence));
		
		String sequence = "UUC";
		DNASequenceInterface ds0 = new DNASequence(sequence);
		
		System.out.println(ds0.RNACodon());
	}
	
//	public static void prints() {
//		System.out.print(ds1.countA() + " ");
//		System.out.print(ds1.countC() + " ");
//		System.out.print(ds1.countG() + " ");
//		System.out.println(ds1.countT());
//		System.out.println(ds1.gc_content() + "%");
//		System.out.println("");
//	}

}