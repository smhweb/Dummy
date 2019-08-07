package misc;

import java.util.ArrayList;
import java.util.Arrays;

public class Misce {

	public static void main(String[] args) {
		String a="Welcome to the interview sessions with Syntax";      
		System.out.println(a.substring(39));      
		String [] words=a.split(" ");   
		System.out.println(words.length);   
		System.out.println(words.length);   

		   for (String string : words) {    
			   System.out.println(string);   
			   } 
		   String reverse="";   
		   for (int i=a.length()-1; i>=0; i--) {    
			   reverse=reverse+a.charAt(i);   }   
		   System.out.println(reverse); 
	
		   String reverse1="";   
		   for (int i=a.length(); i>=1; i--) {    
			   reverse1=reverse1+a.substring(i-1, i);   
			   }   System.out.println(reverse1); 
			   String a1= "Hello Syntax";   
			   // 1 method   
			   StringBuffer sb=new StringBuffer(a1);   
			   System.out.println(sb.reverse());
			   
			   String a2="SyntaxTechnologies";   
			   char[] array=a2.toCharArray();   
			   System.out.println(array.length);   
			   for (int i=0; i<array.length; i++) {    
				   System.out.print(array[i]+" ");   } 
			   System.out.println();
			   System.out.println(Arrays.toString(array));
			   //ArrayList: 
				   ArrayList al=new ArrayList();   
			   al.add("John");   al.add("John");   al.add(10); 				    
				     for (int i=0; i<al.size(); i++) {    
				    	 System.out.println(al.get(i));   
				    	 } 				     
			     //Array:   
			     String[] array1=new String[3];   
			     array1[0]="Jordan";   array1[1]="Jack";   array1[2]="Jack";      
			     for(int i=0; i<array1.length; i++) {    
			    	 System.out.println(array1[i]);   
			    	 }
			   
			   
	}
}
