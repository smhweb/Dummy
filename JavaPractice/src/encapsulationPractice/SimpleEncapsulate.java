package encapsulationPractice;

public class SimpleEncapsulate {		// PIE = polymorphism, interface, encapsulation
	
	private String fName;
	private int age;
	private String sex;
	
	public static void main(String[] args) {
		
		SimpleEncapsulate sEncap = new SimpleEncapsulate();
		
		sEncap.setfName("Imran");
		sEncap.setAge(20);
		sEncap.setSex("male");
		
		System.out.println("First name is: "+sEncap.getfName());
		System.out.println("Age is: "+sEncap.getAge());
		System.out.println("Sex is: "+sEncap.getSex());
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
