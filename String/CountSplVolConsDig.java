package String;

import java.util.*;

public class CountSplVolConsDig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int vol = 0, spl = 0, dig = 0, word = 0;
        
        System.out.println("Enter a string");
        str = sc.nextLine();
        str = " " + str; // to read the first word
        str = str.toLowerCase(); // convert the string to lowercase for uniform comparison
        
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vol++;
            
            // Check if the character is a digit
            if (ch >= '0' && ch <= '9')
                dig++;
            
            // Check if the character is a whitespace to count words
            if (ch == ' ')
                word++;
            
            // Check if the character is a special character
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))
                spl++;
        }
        
        // Output the counts
        System.out.println("The number vowels are " + vol);
        System.out.println("The number of digits are " + dig);
        System.out.println("The number of words are " + word);
        System.out.println("The number of special characters are " + spl);

        sc.close();
    }
}