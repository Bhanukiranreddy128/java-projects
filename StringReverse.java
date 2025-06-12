package java11_6_2025;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        System.out.println(new String(chars));
    }
}
