package basicjava;
import java.util.*;
public class TypeCasting {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in) ;
		int x,y;
		System.out.println("Enter the value of x "); 
		x=sc.nextInt();
		System.out.println("Enter the value of y"); 
		y=sc.nextInt();
		double z=x+y;//implicit conversion done by compiler
		System.out.println("The result is"+z);
		int a=(int)z+y+x;//explicit conversion done by compiler
		System.out.println("The result is"+a);
		
		
		
		}
}