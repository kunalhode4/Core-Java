package basicjava;
import java.util.*;

public class Greatest {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n1,n2,n3;
    	System.out.println("Enter three numbers");
    	n1=sc.nextInt();
    	n2=sc.nextInt();
    	n3=sc.nextInt();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}