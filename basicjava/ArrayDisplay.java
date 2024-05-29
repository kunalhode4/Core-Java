package basicjava;
import java.util.*;

public class ArrayDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]=new int [10];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Array Elements are");
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println("Reverse Array");
		for (int i = a.length - 1; i >= 0; i--) 
		{
		    System.out.print(a[i] + " ");
		}
		
		sc.close();
	}

}
