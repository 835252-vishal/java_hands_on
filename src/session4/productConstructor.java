package session4;

import java.util.Scanner;

public class productConstructor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product id");
        long id = s.nextLong();
        s.nextLine();
        System.out.println("Enter the product name ");
        String productName = s.nextLine();
        System.out.println("Enter the supplier name  ");
        String supplierName = s.nextLine();
        product call = new product(id, productName, supplierName);
        call.display();
        s.close();
    }
}
