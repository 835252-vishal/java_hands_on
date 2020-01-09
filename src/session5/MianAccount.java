package session5;

import java.util.Scanner;

public class MianAccount {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Account Number ");
        String accountNumber = s.nextLine();
        System.out.println("Enter the Account Balance");
        int balance = s.nextInt();
        System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
        int choice = s.nextInt();
        Account a = new Account(accountNumber, balance);
        {
            if (choice == 1) {
                System.out.println("Enter the amount to deposit");
                int transactionAmount = s.nextInt();
                a.deposit(transactionAmount);
            }
            if (choice == 2) {
                System.out.println("Enter the amount to withdraw");
                int transactionAmount = s.nextInt();
                a.withdraw(transactionAmount);
            }
        }
        s.close();
    }

}
