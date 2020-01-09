package session2;

import java.util.Scanner;

public class DiscountCalculation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Price of item 1");
        float item1 = s.nextFloat();
        System.out.println("Price of item 2");
        float item2 = s.nextFloat();
        System.out.println("Discount in percentage");
        int discount = s.nextInt();
        float price = discount;
        float total = item1 + item2;
        System.out.printf("Total amount $%.2f\n", total);
        float dis = (total * price) / 100;
        float save = (total - dis);
        System.out.println("Discounted amount $" + save);
        System.out.println("Saved amount $" + dis);
        s.close();
    }

}
