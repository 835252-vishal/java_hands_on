package session4;

import java.util.Scanner;

public class ProfitAndLoss {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased");
        int x = s.nextInt();
        System.out.println("Enter the price per dozen");
        int y = s.nextInt();
        System.out.println("Enter the selling price of one toy");
        int z = s.nextInt();
        ProfitAndLoss total = new ProfitAndLoss();
        total.calculateProfit(x, y, z);
        s.close();
    }

    public float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) {
        float pricePerDozen1 = pricePerDozen;
        float sellPrice1 = sellPrice;
        float costPrice = (pricePerDozen1 / 12);
        float profit = (sellPrice1 - costPrice);
        float profitPercent = (profit / costPrice * 100);
        System.out.printf("Sam's profit percentage is %.2f percent", profitPercent);
        return 0;
    }

}
