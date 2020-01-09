package session6;

import java.util.Scanner;

public class MainCard {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String holderName;
        String cardNumber;
        String expiryDate;
        System.out.println("Select the Card");
        System.out.println("1.Payback Card");
        System.out.println("2.Membership Card ");
        int choice = s.nextInt();
        s.nextLine();
        switch (choice) {
        case 1:

            System.out.println("Enter the Card Details:");
            String detail[] = s.nextLine().split("\\|");
            System.out.println("Enter points in card");
            int pointsEarned = s.nextInt();
            System.out.println("Enter Amount");
            double totalAmount = s.nextDouble();
            holderName = detail[0];
            cardNumber = detail[1];
            expiryDate = detail[2];
            PaybackCard pay = new PaybackCard(holderName, cardNumber, expiryDate, pointsEarned,
                    totalAmount);
            pay.display();
            break;
        case 2:
            System.out.println("Enter the Card Details: ");
            String details[] = s.nextLine().split("\\|");
            System.out.println("Enter rating in card ");
            int rating = s.nextInt();
            holderName = details[0];
            cardNumber = details[1];
            expiryDate = details[2];
            MembershipCard mem = new MembershipCard(holderName, cardNumber, expiryDate, rating);
            mem.display();
            break;
        }
        s.close();
    }

}
