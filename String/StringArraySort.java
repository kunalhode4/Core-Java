package String;

import java.util.*;

public class StringArraySort {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of String: ");
		int n= sc.nextInt();
		sc.nextLine(); //consume newline
		String[]strings = new String[n];
		
		//Input strings from user
		for (int i=0; i<n;i++) {
			System.out.println("Enter String"+ (i+1)+ ":");
			strings[i]=sc.nextLine();
		}
		//Sort the array of string in ascending order
		Arrays.sort(strings);
		//display the sorted string in ascending order
		System.out.println("Sorted string in ascending order: ");
		for (String str:strings)
		{
			System.out.println(str);
		}
		sc.close();
	}

}