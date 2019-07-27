package package1;

public class A {

	public A()
	{
		System.out.println("parent class constructor");
	}
	
	public A(int i)
	{
		System.out.println("Parent class constructor with value i "+i);
	}
	
	public A(int i, int j)
	{
		System.out.println("Parent class constructor with i "+i);
		System.out.println("Parent class construtor with j "+j);
	}
	
}
