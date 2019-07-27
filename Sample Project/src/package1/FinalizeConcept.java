package package1;

public class FinalizeConcept {

	
	public void finalize()   // Finalize
	                         // 1. Used for cleanup processing of object
	{
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalizeConcept f1=new FinalizeConcept();
		
		FinalizeConcept f2=new FinalizeConcept();
		
		f1=null;
		
		f2=null;
		
		System.gc();
	} 

}
