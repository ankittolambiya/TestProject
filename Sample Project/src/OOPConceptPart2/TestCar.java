 package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// static polymorphism ---- compile-time polymorphism
		BMW b=new BMW();
		
		b.start();
		b.stop();
		b.refuel();
		b.Engine();
		
		System.out.println("********");
		Car c=new Car();
		
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("********");
		
		// Top casting 
		
		Car c1=new BMW(); // dynamic polymorphism  ---- run-time polymorphism (child class object can be reference by parent class variable)
		                   // Overridden and parent class methods will be called
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down casting
		
		BMW b1=(BMW)new Car();  // ClassCastException
	}

}
