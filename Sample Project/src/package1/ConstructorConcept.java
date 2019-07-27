package package1;

public class ConstructorConcept {            // We can overload a constructor

	public ConstructorConcept()
	{
		System.out.println("Default constructor"); 
	}
	
	public ConstructorConcept(int i)
	{
		System.out.println("single params constructor");
		
		System.out.println("the value of i is: "+i);
	}
	
	public ConstructorConcept(int i,int j)
	{
		System.out.println("two params constructor");
		
		System.out.println("the value of i is: "+i);
		System.out.println("the value of j is: "+j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj3=new ConstructorConcept(10,20);
		
	}

}
