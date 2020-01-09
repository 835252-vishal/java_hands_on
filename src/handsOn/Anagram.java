package handsOn;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] input) {
        String st1;
        String st2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        st1 = sc.nextLine().toLowerCase();
        System.out.println("Enter Second string: ");
        st2 = sc.nextLine().toLowerCase();
        char s1[] = st1.toCharArray();
        char s2[] = st2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        st1 = s1.toString();
        st2 = s2.toString().toString();
        if (s1.length != s2.length) {
            System.out.println("Not an anagram");
        } else {
            if (Arrays.equals(s1, s2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an anagram");
            }
        }
        sc.close();
    }
}