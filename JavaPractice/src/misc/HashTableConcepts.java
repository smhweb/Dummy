package misc;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcepts {

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();
		h1.put(1, "Telnor");
		h1.put(2, "Doug");
		h1.put(3, "Chen");
		
		// create a clone copy / shallow copy
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		
		System.out.println("h1 values: "+h1);
		System.out.println("h2 values: "+h2);
		
		h1.clear();
		
		System.out.println("h1 values: "+h1);
		System.out.println("h2 values: "+h2);
		// contains value
		if(h1.containsValue("Doug")) {
			System.out.println("Doug found in h1");
		}else if(h2.containsValue("Doug")) {
			System.out.println("Doug found in h2");
		}
		
		Hashtable s = new Hashtable();
		s.put("A", "Kareem");
		s.put("B", "Nasreen");
		s.put("C", "Wasim");
		//  using enumeration ----  elements
		Enumeration e = s.elements();
		System.out.println("enumeration values fro s are: "+e);
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		// using entrySet() ---  set of hashtABLE VALUES.
		Set se = s.entrySet();
		System.out.println("entrySet Values are:  "+se)
;		
		// check if2 hashtables are equal
		Hashtable s2 = new Hashtable();
		s2.put("A", "Kareem");
		s2.put("B", "Nasreen");
		s2.put("C", "Wasim");
		if(s.equals(s2)) {
			System.out.println("Hashtables s and s2 are equal.");
			
			// get vale of a key
		System.out.println(s2.get("B"));	
		// get hashcode of hashtable object
		System.out.println("hashcode of s2 is :  "+ s2.hashCode());
		
		// Hashtable contains unique values and Hashmap does not. Also hashtable does not contain null key or values.
		//Hashtable is thread safe (single thread each time) and hashmap is not (multi threads work at a time). 
		// generics
		Hashtable<String, String> s3 = new Hashtable<String, String>();
		
		}
	}

}
