package basicjava;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	System.out.println("Enter array elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter search element");
	int se=sc.nextInt();
	
	int l=0,h=arr.length-1,mid,p=-1;
	while(l<=h)
	{
		mid=(l+h)/2;
		if(arr[mid]==se)
		{
			p=mid+1;
			break;
		}
		else if(arr[mid]<se)
			l=mid+1;
		else
			h=mid-1;
			
	}
	if(p>1)
		System.out.println("Element found at"+p+"position");
	else
		System.out.println("Search is unsuccessful");
	}

}