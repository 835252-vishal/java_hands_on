package handsOn;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int number, max;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        int a[] = new int[number];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < number; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        for (int i = 0; i < number; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum value:" + max);
        s.close();
    }
}