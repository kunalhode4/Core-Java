package basicjava;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];//array declaration
	System.out.println("Enter Array elements");
	for(int i=0;i<arr.length;i++)//input array elemnets
	{
	arr[i]=sc.nextInt();
	}
	int se, pos=-1;//search element and position to mark 
	System.out.println("Enter a search element");
	se=sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(se==arr[i])
		{
			pos=i; 
break;//break the loop once element is found and mark the position
		}		
	}
	if(pos>-1)
		System.out.println("Elemnet found at"+(pos+1));
	else
		System.out.println("Element not found");
	
	}

}