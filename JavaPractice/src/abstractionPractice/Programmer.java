package abstractionPractice;

public class Programmer extends AbstractClass{
	
	public static void write(){
		System.out.println("Coding");
	}
	
	
	public static void main(String[] args) {

		AbstractClass ac = new Programmer();
		ac.write();
		
		
		
		StringBuilder s1 = new StringBuilder("Java");
		 String s2 = "Love";
		 s1.append(s2);
		 s1.substring(4);
		 int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);
		
		
		
	}

	@Override
	void openAccount() {
		// TODO Auto-generated method stub
		

		
	}

}
