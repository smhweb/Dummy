package finalFinallyFinalize;

public class FinalizeConcept {
	// finalize is a method
	public void finalize() {
		System.out.println("finalize method runs after gc(), even if it is not called");
	}
	
	public static void main(String[] args){
		
	FinalizeConcept f1 = new FinalizeConcept();
	FinalizeConcept f2 = new FinalizeConcept();
	
	f1 = null;
	f2 = null;
	
	System.gc();
	
	}
	
}
