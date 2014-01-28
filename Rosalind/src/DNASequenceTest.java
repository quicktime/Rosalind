public class DNASequenceTest {

	public static void main(String[] args) {
		String dna_string0 = "AGGCTAGCTAGCTTGCTGACTGACCATCGCGTGTGCTCTCGCTGTAGCTGATCGCTGCTGATCGCTACGTAGCGATTTCGT";
		String dna_string1 = "CCTGCGGAAGATCGGCACTAGAATAGCCAGAACCGTTTCTCTGAGGCTTCCGGCCTTCCCTCCCACTAATAATTCTGAGG";
		String dna_string2 = "CCATCGGTAGCGCATCCTTAGTCCAATTAAGTCCCTATCCAGGCGCTCCGCCGAAGGTCTATATCCATTTGTCAGCAGACACGC";
		String dna_string3 = "CCACCCTCGTGGTATGGCTAGGCATTCAGGAACCGGAGAACGCTTCAGACCAGCCCGGACTGGGAACCTGCGGGCAGTAGGTGGAAT";
		
		DNASequence ds0 = new DNASequence(dna_string0);
		DNASequence ds1 = new DNASequence(dna_string1);
		DNASequence ds2 = new DNASequence(dna_string2);
		DNASequence ds3 = new DNASequence(dna_string3);
		

		System.out.println(ds1.gc_content() + "%");
		System.out.println("");
		

		System.out.println(ds2.gc_content() + "%");
		System.out.println("");
		

		System.out.println(ds3.gc_content() + "%");
		System.out.println("");
		
		System.out.println(ds0.reverseCompliment());
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