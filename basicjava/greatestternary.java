package basicjava;

import java.util.Scanner;

public class greatestternary {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n1,n2,n3;  	
    	System.out.println("Enter three numbers");
    	n1=sc.nextInt();
    	n2=sc.nextInt();
    	n3=sc.nextInt();
    	int g=(n1>n2)?n1:(n2>n3)?n2:n3;
    	System.out.println("The largest number is " +g);
      
    }
}