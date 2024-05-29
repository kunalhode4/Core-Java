package basicjava;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		int a, b,sum,diff,prod, quo,rem;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		diff=a-b;
		prod=a*b;
		quo=a/b;
		rem=a%b;
		System.out.println("Sum is"+sum);
		System.out.println("Diff is"+diff);
		System.out.println("Product is"+prod);
		System.out.println("quotient is"+quo);
		System.out.println("remainder is"+rem);
		
				
	}

}