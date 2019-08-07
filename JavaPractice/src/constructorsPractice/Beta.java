package constructorsPractice;

public class Beta extends Alpha{
	
	public Beta() { 	// parent default constructor will not be called in such case.
		super(10);
		System.out.println("Child Constructor.");
	}

	public static void main(String[] args) {
		
		Beta b = new Beta();
		
	}

}
