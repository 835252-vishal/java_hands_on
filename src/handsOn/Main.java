package handsOn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        s.close();
    }
}
