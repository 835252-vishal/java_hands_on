package session6;

import java.util.Scanner;

public class MainCricet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu ");
        System.out.println("1.Player details of the delivery");
        System.out.println("2.Run details of the delivery");
        int choice = s.nextInt();
        s.nextLine();
        Delivery d = new Delivery();
        switch (choice) {
        case 1:
            System.out.println("Enter the bowler name");
            String[] bowler = s.nextLine().split(" ");
            int a = bowler.length;
            System.out.println("Enter the batsman name");
            String[] batsman = s.nextLine().split(" ");
            int b = bowler.length;
            d.displayDeliveryDetails(bowler[a - 1], batsman[b - 1]);
            break;
        case 2:
            System.out.println("Enter the number of runs ");
            long runs = s.nextLong();
            d.displayDeliveryDetails(runs);
            break;
        default:
            System.out.println("Choose an appropriate number !");
        }
        s.close();
    }

}
