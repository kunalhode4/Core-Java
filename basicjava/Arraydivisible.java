package basicjava;

import java.util.Scanner;

public class Arraydivisible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array of 10 elements
        int[] arr = new int[10];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Multi-dimensional array to store numbers divisible by 2 and 3
        int[][] divisibleArr = new int[2][]; // Two rows: 0 for divisible by 2, 1 for divisible by 3

        // Count numbers divisible by 2 and 3
        int countDivBy2 = 0;
        int countDivBy3 = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                countDivBy2++;
            }
            if (num % 3 == 0) {
                countDivBy3++;
            }
        }

        // Initialize arrays in the multi-dimensional array
        divisibleArr[0] = new int[countDivBy2];
        divisibleArr[1] = new int[countDivBy3];

        // Populate arrays in the multi-dimensional array
        int indexDivBy2 = 0;
        int indexDivBy3 = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                divisibleArr[0][indexDivBy2++] = num; // Add to divisible by 2 array
            }
            if (num % 3 == 0) {
                divisibleArr[1][indexDivBy3++] = num; // Add to divisible by 3 array
            }
        }

        // Display numbers divisible by 2
        System.out.println("Numbers divisible by 2:");
        for (int num : divisibleArr[0]) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display numbers divisible by 3
        System.out.println("Numbers divisible by 3:");
        for (int num : divisibleArr[1]) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
