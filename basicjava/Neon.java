package basicjava;

import java.util.Scanner;

//neon number 9 , square 81 , find sum 8+1=9
public class Neon {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,sum=0,rem, square;
		System.out.println("enter a number");
		num=sc.nextInt();
		square=num*num;
		while(square>0)
		{
			rem=square%10;//used to extract the last digit
			sum=sum+rem;//find the sum
			square=square/10;//reduce the number by dividing 10	
		}
		if(sum==num)
			System.out.println("Neon number");
		else System.out.println("Not a Neon Number");	
	}

}