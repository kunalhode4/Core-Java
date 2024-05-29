package basicjava;

import java.util.Scanner;

public class factorialproblem {
    public static void main(String[] args) {
        // sum of factorial of digit == number itself
        System.out.print("Enter a Number - ");
        int num, rem, sum = 0, copy = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        copy = num;

        while (num > 0) {
            rem = num % 10;   // 145
            int fact = 1;

            for(int i = 1; i <= rem; i++){
                fact = fact * i;
            }
            
            sum = sum + fact;
            num = num / 10;

        }
        if (copy == sum) {
            System.out.println("Special number");
        } else {
            System.out.println("Not special number");
        }
    }
}