package String;

import java.util.*;
public class RemoveVowel {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//input a string from user
		System.out.println("Enter a string: ");
		String input=sc.nextLine();
		
		//remove vowel from input string
		String result= removeVowels(input);
		//display the modify string without vowel
		System.out.println("Modified stringafter removing vowels: "+ result);
		sc.close();
	}
	
     // Methods to remove vowels from a string
	private static String removeVowels(String input) {
		//regular expression to match vowels
		String vowels="[aeiouAEIOU]";
		//REPLACE all vowels with an empty string
		return input.replaceAll(vowels,"");
	}
	
}