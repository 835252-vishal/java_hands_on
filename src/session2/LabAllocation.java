package session2;

import java.util.Scanner;

public class LabAllocation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter X");
        int Lab1 = s.nextInt();
        System.out.println("Enter Y");
        int Lab2 = s.nextInt();
        System.out.println("Enter Z");
        int Lab3 = s.nextInt();
        if ((Lab1 < Lab2) && (Lab1 < Lab3)) {
            System.out.println("L1 has the minimal seating capacity ");
        } else if ((Lab2 < Lab1) && (Lab2 < Lab3)) {
            System.out.println("L2 has the minimal seating capacity ");
        } else {
            System.out.println("L3 has the minimal seating capacity ");
        }
        s.close();
    }

}
