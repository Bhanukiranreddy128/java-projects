package Bhanu128;

import java.util.Scanner;

public class DsaBiggestNumberTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int A = sc.nextInt();

        if (A <= 0) {
            System.out.println("Array size must be greater than 0");
            return;
        }

        int[] arr = new int[A];

        System.out.println("Enter " + A + " integers:");
        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The biggest number is: " + max);
    }
}
