package package1;

import java.util.Scanner;

public class PrimeNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		
		System.out.println("Enter your number: ");
	Scanner in=new Scanner(System.in);
	
	Integer num=in.nextInt();
	
	// System.out.println("Your entered string is: "+s);
		
		
		
	//	System.out.println("Enter the number:");
		
		for (int i=1;i<=num;i++)
		{
			if(num%i==0)
				
			{
				count++;
			}
		} 
		
		if(count>2)
		{
			System.out.println("The given no is prime number");
		}
		
		else
		{
			System.out.println("The given no is not a prime number");
		}
	}

}
