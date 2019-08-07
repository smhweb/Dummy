package misc;

public class PrintReverseOfString {

	public static void main(String[] args) {

		String s = "Hi every body!";
		System.out.println(s);
		
		// 1 way
		String revS = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			revS = revS + s.charAt(i);
			System.out.println(revS);  // shows how each chsr is added one by one with looping
		}
		System.out.println("Reverse by using for loop :  "+revS);	// shows complete string
		
		// 2 way
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Reverse by using string buffer :  "+sb.reverse());
	}

}
