package misc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		// Selenium compatible with these languages
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
		
		//1- compare each element --- worst solution  --- on2  time complexity
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate found :  "+names[i]);
				}
			}
		}
		System.out.println("=================");
		//2- using HashSet: part of Java Collections.  It stores unique values.  good solution. o(n)
		Set<String> store = new HashSet<String>();	// interface: interface,  HashSet: class
		for(String name : names) {
			if(store.add(name) == false) {	// this will print when set does not add duplicate.
				System.out.println("duplicate element in Set :  "+name);
			}
		}
		System.out.println("=================");
		// 3 - using HashMap - duplicates allowed - good solution o(2n)
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for(String name : names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}	// get the value from this HashMap
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate found through HashMap & entrySet : "+entry.getKey());
			}
		}
		System.out.println("=================");
		
		/*Solution 1 : with Time Complexity = O(nxn)

Our first solution is very simple. All we are doing here is to loop over an array and comparing each element
 to every other element. Since we are comparing every element to every other element, this solution has
  quadratic time complexity i.e. O(n^2). This solution has the worst complexity in all three solutions.

======================================================

Solution 2 : with Time Complexity = O(n)

Second solution is even simpler than this. All you need to know is that Set doesn't
 allow duplicates in Java. Which means if you have added an element into Set and trying
  to insert duplicate element again, it will not be allowed. If add() returns false it
   means that element is not allowed in the Set and that is your duplicate.

======================================================

Solution 3 : with Time Complexity = O(2n)

Third solution takes advantage of another useful data structure, hash map. All you need
 to do is loop through the array using enhanced for loop and insert each element and its
  count into hash table. 
In order to build map, you check if hash table contains the elements or not, if it is
 then increment the count otherwise insert element with count 1. Once you have this map
  ready, you can iterate over hashmap and print all those keys which has values greater
   than one. These are your duplicate elements. This is in fact a very good solution 
   because you can extend it to found count of duplicates as well.
		*/
	}
}
