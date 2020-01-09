package session2;

import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int number1 = s.nextInt();
        System.out.println("Enter the second number ");
        int number2 = s.nextInt();
        if (number1 < number2) {
            System.out.println(number1 + " is less than " + number2);
        } else if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }
        s.close();
    }
}