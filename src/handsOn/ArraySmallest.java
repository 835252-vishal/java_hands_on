package handsOn;

import java.util.Scanner;

public class ArraySmallest {

    public static void main(String[] args) {
        int number, max, min;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        int a[] = new int[number];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < number; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        min = a[0];
        for (int i = 0; i < number; i++) {
            if (max < a[i]) {
                max = a[i];
            } else if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum value:" + max);
        System.out.println("Minimum value:" + min);
        s.close();

    }

}
