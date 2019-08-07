
public class RecurseNum {		// multiply n by k.
	
	private static int nTimeK(int n, int k) {
		
		System.out.println("n:  "+n);
		
		// Base case n=1.
		if( n <= 1) {
			return k;
		}else			// Recursive case n-1 time
			return k + nTimeK(n-1, k);	
	}	

	public static void main(String[] args) {
		
		int result = nTimeK(4, 4);
		System.out.println("Result:   "+result);
	}
}
