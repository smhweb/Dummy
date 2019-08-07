package finalFinallyFinalize;

public class FinallyConcept {

	int j = 3;	// finally is a block in try catch.

	public void printResult() {

		try {
			System.out.println("Inside try block.");
			int k = j / 0;
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		finally {
			System.out.println("Finally always runs.");
		}
	}
}
