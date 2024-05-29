package basicjava;
import java.util.Scanner;

public class marks {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		 
		//User enter marks in English
		System.out.println("Enter marks obtained in English:");
		int englishMarks=scanner.nextInt();
		
		//User enter marks in maths
		System.out.println("Enter marks obtained in Maths:");
		int mathsMarks=scanner.nextInt();
		
		//user enter marks in Science
		System.out.println("Enter marks obtained in Science:");
		int scienceMarks=scanner.nextInt();
		
		//Check the Condition to determine the Stream
		if(englishMarks>=80 && mathsMarks>=80 && scienceMarks>=80) {
			System.out.println("Stream:Pure Science");
		}
		else if (englishMarks>=80 && scienceMarks>=80 && mathsMarks>=60) {
			System.out.println("Stream:Bio.Science");
		}
		else if (englishMarks>=60 && scienceMarks>=60 && mathsMarks>=60) {
			System.out.println("Stream:Commerce");
		}
		else {
			System.out.println(" Sorry Marks is very low ");
		}
		
		//Close the Scanner
		scanner.close();


	}

}
