package session2;

import java.util.Scanner;

public class ProfitLoss {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased");
        int x = s.nextInt();
        System.out.println("Enter the price per dozen");
        int y = s.nextInt();
        System.out.println("Enter the selling price of one toy");
        int z = s.nextInt();
        float a = (int) x;
        float b = (int) y;
        float c = (int) z;
        float costPrice = (b / 12);
        float profit = (c - costPrice);
        float profitPercent = (profit / costPrice * 100);
        System.out.printf("Sam's profit percentage is %.2f percent", profitPercent);
        s.close();
    }

}
