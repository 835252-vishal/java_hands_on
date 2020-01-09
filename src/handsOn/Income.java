package handsOn;

import java.util.Scanner;

public class Income {

    public static void main(String[] args) {
        int age = 0;
        double salary;
        double rem, tax, tax2, tax3 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        age = sc.nextInt();
        if (age >= 60 && age <= 80) {
            System.out.println("Enter the salary");
            salary = sc.nextInt();

            if (salary <= 300000) {
                System.out.println("Tax amount is : 0 ");
            } else if (salary > 300000 && salary <= 500000) {
                rem = (salary - 300000);
                tax = (rem * 5) / 100;
                System.out.println("Tax amount is : " + tax);
            } else if (salary > 500000 && salary <= 1000000) {
                rem = (salary - 500000);
                tax = (200000 * 5) / 100;
                System.out.println(tax);
                tax2 = (rem * 20) / 100;
                System.out.println(tax2);
                System.out.println("Tax amount is : " + (tax + tax2));
            } else if (salary <= 1000001) {
                rem = (salary - 1000000);
                tax = (200000 * 5) / 100;
                System.out.println(tax);
                tax2 = (500000 * 20) / 100;
                System.out.println(tax2);
                tax3 = (rem * 30) / 100;
                System.out.println(tax3);
                System.out.println("Tax amount is : " + (tax + tax2 + tax3));
            }
        } else {
            System.out.println("Enter the salary");
            salary = sc.nextInt();

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
            } else if (salary <= 1000001) {
                rem = (salary - 1000000);
                tax = (250000 * 5) / 100;
                System.out.println(tax);
                tax2 = (500000 * 20) / 100;
                System.out.println(tax2);
                tax3 = (rem * 30) / 100;
                System.out.println(tax3);
                System.out.println("Tax amount is : " + (tax + tax2 + tax3));
            }

        }
        sc.close();
    }

}
