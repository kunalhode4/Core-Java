package basicjava;

import java.util.*;
public class Calculator2 {
	int x, y;//instance variables or global 
	
//	public Calculator()//default constructor
//	{
//		x=0;
//		y=0;
//	}
	public Calculator2()//no -arg constructor 
	{
		System.out.println("Welcome to my program calculator");
	}
	public Calculator2(int a, int b)//parameterized 
	{
		int sum=a+b;
		int diff=a-b;
		int prod=a*b;
		int div=a/b;
		System.out.println("Sum is"+sum);
		System.out.println("DIfference is"+diff);
		System.out.println("Product is"+prod);
		System.out.println("Division is"+div);
	}
	public static void main(String[] args) {
		Calculator cc = new Calculator();//default constructor
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two numbers");
		int c=sc.nextInt();
		int d=sc.nextInt();
		Calculator2 cc1=new Calculator2 (c,d);
	}

}