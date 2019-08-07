package constructorsPractice;

public class MultiConstructore {
	
	public MultiConstructore() {
		System.out.println("No parameters constructor called.");
	}
	
	public MultiConstructore(int i) {
		System.out.println("One parameters constructor called.");
		System.out.println(i);
	}
	
	public MultiConstructore(int i, int j) {
		System.out.println("Two parameters constructor called.");
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		
		MultiConstructore mc = new MultiConstructore();
		MultiConstructore mc1 = new MultiConstructore(10);
		MultiConstructore mc2 = new MultiConstructore(10, 20);
		
	}

}
