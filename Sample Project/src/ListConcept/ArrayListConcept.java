package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[3];  //static array -- size if fixed
		
		// dynamic array -- ArrayList 
		
		//1. can contain duplicate values/elements
		//2. maintains insertion order
		//3. not synchronized
		//4. allows random access to fetch elements because it stores the values based on indexes 
		
		ArrayList ar=new ArrayList();
		
		ar.add(10); //1
		ar.add(20); //2
		ar.add(30); //3
		
		System.out.println(ar.size());
		
		ar.add(40); //4
		ar.add(50); //5
		ar.add(50); //6
		
		ar.add(14.33);
		ar.add("Tom");
		ar.add('M');
		ar.add(true);
		
		
		System.out.println(ar.size());
		
		// non generic vs generic:
		
		Employee e1=new Employee("Naveen",27, "QA");
		Employee e2=new Employee("Tom",28, "Dev");
		Employee e3=new Employee("Peter",29, "Admin");
		
		// create arraylist:
		
		ArrayList<Employee> ar1=new ArrayList<Employee>();
		
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		
		// iterator to traverse the values
		
		Iterator<Employee> it=ar1.iterator();
		
		while(it.hasNext())
		{
			Employee emp=it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		// ****************
		
		// addAll()

	    ArrayList<String> ar2=new ArrayList<String>();
	    
	    ar2.add("A");
	    ar2.add("B");
	    ar2.add("C");
	    
	    ArrayList<String>ar3=new ArrayList<String>();
	    
	    ar3.add("D");
	    ar3.add("E");
	    ar3.add("F");
	    
	    ar2.addAll(ar3);   // Add all elements from ar3 to ar2
	    
	    for(int i=0;i<ar2.size();i++)
	    {
	    	System.out.println(ar2.get(i));
	    }
	    
         System.out.println("*********");
         
         
         // removeAll()
         
         ar2.removeAll(ar3);   // Remove all elements of ar3 from ar2
 	    
 	    for(int i=0;i<ar2.size();i++)
 	    {
 	    	System.out.println(ar2.get(i));
 	    }
	    
 	    
 	    System.out.println("*******");
 	    
 	    // retainAll()    ---- Used to print common intersection value
 	    
 	   ArrayList<String> ar4=new ArrayList<String>();
	    
	    ar4.add("A");
	    ar4.add("B");
	    ar4.add("C");
	    
	    ArrayList<String>ar5=new ArrayList<String>();
	    
	    ar5.add("A");
	    ar5.add("E");

	    ar4.retainAll(ar5);
	    
	    
	    for(int i=0;i<ar4.size();i++)
 	    {
 	    	System.out.println(ar4.get(i));
 	    }
	    
	    
	    System.out.println("*************");
	    
	    
	    
	    ArrayList list = new ArrayList();

	    list.add("ONE");
	    list.add("FOUR");
	    list.add(2,"THREE");
	    list.add(2,"TWO");
	    list.add(2,"five");
	    
	    for(int i=0;i<list.size();i++)
 	    {
 	    	System.out.println(list.get(i));
 	    }
	   


	   
	}

}
