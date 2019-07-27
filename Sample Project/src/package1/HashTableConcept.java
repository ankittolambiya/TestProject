package package1;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h=new Hashtable<>();   // we can give any combination of values
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1,100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		
		System.out.println(h.get("C"));
		
		h.put(3, "Tom");
		
		Hashtable<Integer, Integer> h1=new Hashtable<Integer,Integer>();
		
	}

}
