package Bhanu128;

import java.util.Scanner;

public class PalindromeTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            int org = num;
            int rev = 0;

            while (num > 0) { 
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }

            if (org == rev) {
                System.out.println("Given number is a palindrome.");
            } else {
                System.out.println("Given number is not a palindrome.");
            }
        }

    }
}
