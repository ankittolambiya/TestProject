package ListConcept;

public class Employee {

	String name;
	int age;
	String dept;
	
	Employee(String name,int age,String dept)   // this keyword is used to differentiate b/w local and global variables, when their names are same
	{
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
}
