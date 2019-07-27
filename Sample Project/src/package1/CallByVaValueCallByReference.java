package package1;

public class CallByVaValueCallByReference {

	
	int p,q;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByVaValueCallByReference byReference=new CallByVaValueCallByReference();
		
		int x=10;
		int y=20;
		
		byReference.sum(x, y);  // call by value or pass by value
		
		byReference.p=50;
		byReference.q=60;
		
		byReference.swap(byReference);
		
		// After swapping
		
		System.out.println(byReference.p);
		System.out.println(byReference.q);
	}
	

	public int sum(int a, int b)
	{
		a=30;
		
		b=40;
		 
		int c=a+b;
		
		return c;
		
	}
	// call by ref
	
	public void swap(CallByVaValueCallByReference obj)
	{
		int temp;
		
		temp=obj.p;
		
		obj.p=obj.q;
		
		obj.q=temp;
		
	}
}
