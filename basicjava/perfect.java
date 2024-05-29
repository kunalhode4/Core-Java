package basicjava;
import java.util.*;
public class perfect {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int num, sum=0,i;
		System.out.println("Enter a number"); 
		num=sc.nextInt();
		for(i=1;i<num; i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
			if (num==sum)
				System.out.println("Perfect number");
			else
			System.out.println("Not a perfect number");
}

}
