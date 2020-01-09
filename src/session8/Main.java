package session8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the 2 numbers ");
            int first = s.nextInt();
            int second = s.nextInt();
            System.out.println("The quotient of " + first + "/" + second + "=" + (first / second));
        } catch (ArithmeticException e) {
            System.out.println("DivideByZeroException caught");
        } finally {
            System.out.println("Inside finally block");
            s.close();
        }
    }

}
