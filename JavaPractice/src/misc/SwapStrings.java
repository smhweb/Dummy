package misc;

public class SwapStrings {

	public static void main(String[] args) {

		String a = "Selenium";
		String b = "WebDriver";
		
		System.out.println("=== Before Swapping ===");
		System.out.println("String a = "+a+" and String b = "+b);
		
//		//1
//		a = a+b;	//SeleniumWebDriver
//		
//		//2
//		b = a.substring(0, a.length()-b.length());
//		
//		//3
//		a = a.substring(b.length());
//		
//		System.out.println("=== After Swapping ===");
//		System.out.println("String a = "+a+" and String b = "+b);
		
		String c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("=== After Swapping ===");
		System.out.println("String a = "+a+" and String b = "+b);
		
	}

}
