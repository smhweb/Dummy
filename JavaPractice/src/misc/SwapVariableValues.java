package misc;

public class SwapVariableValues {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		
		// 1: using temp 3rd var
//		int z;
//		z = x;
//		x = y;
//		y = z;		
		
		// 2: w/o 3rd var. use + operator
//		x=x+y;
//		y=x-y;
//		x=x-y;
		
		// 3: using * operator
		x=x*y;
		y=x/y;
		x=x/y;		
		
		System.out.println("x= "+x +" and y= "+ y);
	}

}
