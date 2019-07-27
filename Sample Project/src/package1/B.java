package package1;

public class B extends A{

	
	public B()
	{
		super();                              // "Super" keyword is used to call parent class constructor
		System.out.println("child class const");  // It should bes first statement in child class constructor
	}
	
	public B(int i)
	{
		super(i);
	}
	
	public B(int i,int j)
	{
		super(i,j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj=new B();
		B obj1=new B(10);
		B obj2=new B(10,20);
	}

}
