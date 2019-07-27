package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> l1= new LinkedList<String>();
		
		// add
		
		l1.add("test");
		l1.add("selenium");
		l1.add("qtp");
		l1.add("RPA");
		l1.add("RFT");
		
		//print
		
		System.out.println("Content of linked list: "+l1);
		
		//add first
		
		l1.addFirst("Naveen");
		
		//add last
		
		l1.addLast("Automation");
		
		System.out.println("Updated content of linked list: "+l1);
		
		
		// get
		
		System.out.println(l1.get(1));
		
		// set
		
		l1.set(0,"Tom");
		
		System.out.println(l1.get(0));
		
		// remove first and last element:
		
		l1.removeFirst();
		l1.removeLast();
		
		System.out.println(l1);
		
		//remove from specific index
		
		l1.remove(0);
		
		System.out.println(l1);
		
		// Print all values of Linked list
		
		//1. for loop
		//2. advanced for loop
		//3. iterator
		//4. while loop
		
		System.out.println("Using for loop:");

		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println("Using advanced for loop:");
		
		for(String str:l1)
		{
			System.out.println(str);
		}
		
		System.out.println("Using iterator:");
		
		Iterator<String> it1=l1.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		System.out.println("Using while loop:");
		
		int num=0;
		
		while(l1.size()>num)
		{
			System.out.println(l1.get(num));
			
			num++;
		}
		
	}

}
