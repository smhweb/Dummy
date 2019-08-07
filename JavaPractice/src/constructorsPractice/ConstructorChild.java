package constructorsPractice;

public class ConstructorChild extends ConstructorFather{	// no args constructors
	
	public ConstructorChild() {
		
		System.out.println("child constructor prints later");
	}

	public static void main(String[] args) {
		
		ConstructorChild cc = new ConstructorChild();
	}

}
