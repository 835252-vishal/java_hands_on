package handsOn;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        double rem, tax, tax2, tax3 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = sc.nextInt();
        if (salary <= 250000) {
            System.out.println("Tax amount is : 0 ");
        } else if (salary > 250001 && salary <= 500000) {
            rem = (salary - 250000);
            tax = (rem * 5) / 100;
            System.out.println("Tax amount is : " + tax);
        } else if (salary > 500001 && salary <= 1000000) {
            rem = (salary - 500000);
            tax = (250000 * 5) / 100;
            System.out.println(tax);
            tax2 = (rem * 20) / 100;
            System.out.println(tax2);
            System.out.println("Tax amount is : " + (tax + tax2));
        } else {
            rem = (salary - 1000000);
            tax = (250000 * 5) / 100;
            System.out.println(tax);
            tax2 = (500000 * 20) / 100;
            System.out.println(tax2);
            tax3 = (rem * 30) / 100;
            System.out.println(tax3);
            System.out.println("Tax amount is : " + (tax + tax2 + tax3));
        }
        sc.close();
    }

}
