package constructorsPractice;

public class ThisUse {
	
	int i;
	String name;
	
	public ThisUse(String name, int i) {
		this.name = name;
		this.i = i;
		
		System.out.println(name);
		System.out.println(i);
		
		}

	public static void main(String[] args) {
		
		ThisUse tu = new ThisUse("Fatima", 25);

	}

}
