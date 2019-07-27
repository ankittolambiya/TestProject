 package package1;

import java.awt.geom.Arc2D;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar=new ArrayList<>();
		
		ar.add(100);  // 0
		ar.add(200);  // 1
		ar.add(300);  // 2
		
	//	System.out.println(ar.size());
		
		ar.add("Tom");    // 3
		ar.add("Hello");  // 4
		ar.add(12.33);    // 5
		ar.add('M');      // 6
		
		System.out.println(ar);
		
		System.out.println("***********");
		System.out.println(ar.size());
		
		System.out.println(ar.get(1));
		
		System.out.println(ar.remove(2));
		
		System.err.println(ar.size());
		
		// print all values of ArrayList using for loop
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ar1.add(150);


		ArrayList<String> ar2=new ArrayList<String>();
		
		ar2.add("Nike");
		
		
		
	}

}
