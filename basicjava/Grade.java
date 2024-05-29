package basicjava;

import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m1, m2, m3, m4, m5, total;
		double avg;
		char grade;
		System.out.println("enter 5 subject marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		total=(m1+m2+m3+m4+m5);
		avg=(total)/5.0;
		if(avg>=90&&avg<=100)
			grade='A';
		else if(avg>=80 && avg<90)
			grade='B';
		else if(avg>=70 && avg<80)
			grade='C';
		else
			grade='D';
		System.out.println("total="+total);
		System.out.println("Average"+avg);
		System.out.println("The Grade is"+grade);
		
	
	}

}