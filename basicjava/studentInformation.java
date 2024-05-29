package basicjava;

import java.util.*;

public class studentInformation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollno[]=new int[3]; //decalration of arrrays
		String name[]=new String[10];
		int mark1[]=new int[10];
		int mark2[]=new int[10];
		int mark3[]=new int[10];
		int total[]=new int[10];
		double avg[]=new double[10];
		System.out.println("Enter student information");
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter rollno");
		
		 rollno[i]=sc.nextInt();
		 System.out.println("Enter Name");
		 name[i]=sc.next();
		 System.out.println("Enter mark1");
		 mark1[i]=sc.nextInt();
		 System.out.println("Enter mark2");
		 mark2[i]=sc.nextInt();
		 System.out.println("Enter mark3");
		 mark3[i]=sc.nextInt();
		 total[i]=mark1[i]+mark2[i]+mark3[i];
		 avg[i]=total[i]/3.0;
				 
		}
		System.out.println("The Student information");
		for(int i=0;i<10;i++)
		{
			System.out.println("Rollno\t\tName\t\tTotal\t\tAverage");
			System.out.println(rollno[i]+"\t\t"+name[i]+"\t\t "+total[i]+"\t\t"+avg[i]);
		}
		
		

	}

}