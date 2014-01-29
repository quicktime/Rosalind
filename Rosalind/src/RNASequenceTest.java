
public class RNASequenceTest {

	public static void main(String[] args) {
		String sequence = "UUCUUU";
		RNASequenceInterface ds0 = new RNASequence(sequence);
		
		System.out.println(ds0.RNACodon());
		
		String str = "UUC";
		if (str == "UUC") {
			System.out.print("hi");
		}

	}

}
