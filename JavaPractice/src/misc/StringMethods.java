package misc;

public class StringMethods {

	public static void main(String[] args) {

		String sing = "Difference between slaves camps and immigrants detention camps";
		String tring = "How much Gap between rich and poor";
		
		System.out.println(sing.length());
				
		System.out.println(tring.charAt(10));
		System.out.println("==========================");
		// first s
		System.out.println(sing.indexOf("s"));
		// 2nd s
		System.out.println(sing.indexOf('s', sing.indexOf('s')+1));
		System.out.println("==========================");
		// all s at locations
		int i = sing.indexOf('s');
		while(i >= 0) {
		     System.out.println(i);
		     i = sing.indexOf('s', i+1);
		}
		System.out.println("==========================");
		System.out.println(tring.indexOf("Gap"));
		System.out.println("==========================");
		System.out.println(tring.indexOf("big"));
		System.out.println("==========================");
		String bing = "Difference between slaves camps and immigrants detention camps";
		System.out.println(sing.equals(bing));
		System.out.println("==========================");
		String cling = "HOW MUCH GAP BETWEEN RICH AND POOR";
		System.out.println(tring.equalsIgnoreCase(cling));
		System.out.println("==========================");
		System.out.println(cling.substring(4, 12));
		
		String h = "   Hi every body!     ";
		System.out.println(h.trim());
		System.out.println(h.replace(" ", ""));
		System.out.println("==========================");
		String date = "01-01-2001";  // replace to 01/01/2001
		System.out.println(date.replace("-", "/"));
		System.out.println("==========================");
		String best = "Code_Selenium_and_Java_together";
		String bestValue [] = best.split("_");
		for(int j=0; j<bestValue.length; j++) {
			System.out.print(bestValue[j]+" ");
		}
	}
}