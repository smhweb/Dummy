import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DeciToBi {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
//			String k = Integer.toBinaryString(n);
//			char[] binary = k.toCharArray();
//			int count = 0, max = 0;
//			for (int i = 0; i < binary.length; i++) {
//				if (binary[i] == '1')
//					count++;
//
//				if (count > max)
//					max = count;
//
//				if (binary[i] == '0')
//					count = 0;
//			}System.out.println(max);
		
		// 2nd solution  - NOT WORKING
		//String[] bo = new String[n];
		String boS = Integer.toBinaryString(n);
		char[] bo = boS.toCharArray();
		int count =0, max=0, k=0;
       while(n>0){            
            int r = n%2;
            n=n/2;
                        
            for(k=0; k<bo.length-1; k++) {
            	bo[k]='r';
            	if(bo[k]=='1') {
            		count++;
            		if(count>max) {
            			max=count; 
            		}
            	}if(bo[k]=='0') 
            		count=0;            	
            }System.out.println(max);            
		}
		
		// 3rd solution
//            String[] ones = Integer.toBinaryString(n).split("[0]+");
//            int max = 0;
//            for (String s : ones){
//                if(s.length()>max){
//                    max = s.length();
//                    //System.out.println(max);
//                }//System.out.println(max);
//            }System.out.println(max);


		scanner.close();
	}
}