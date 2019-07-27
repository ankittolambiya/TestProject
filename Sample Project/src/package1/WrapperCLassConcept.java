package package1;

public class WrapperCLassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="100";
		
		System.out.println(x+20);
		
		int i= Integer.parseInt(x);
		
		System.out.println(i+20);
		
		// Integer, Double, Character, Boolean
	
	//	String to Double conversion
		
		String y= "10.33";
		
		Double d= Double.parseDouble(y);
		
		System.out.println(d+20);
		
	//	String to Boolean conversion
		
		String s1="true";
		
		Boolean b=Boolean.parseBoolean(s1);
		
		System.out.println(b);
		
	//  int to String conversion
		
		int k=200;
		
		System.out.println(k+20);
		
		String m= String.valueOf(k);
		
		System.out.println(m+20);
		
		String u="100A";
		
		Integer.parseInt(u);  // NumberFormat Exception
		
		
		
		
	
	}

}
