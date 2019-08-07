package constructorsPractice;

public class Alpha {
	
	public Alpha() {
		
		System.out.println("Parent constructor default.");
	}
	
	public Alpha(int i) {
		System.out.println("Parent constructor with parameter i: " +i);
	}
	
	public Alpha(int i, int j) {
		System.out.println("Parent constructor with parameter i and j: " +i + " " +j);
		
	}
	
}
