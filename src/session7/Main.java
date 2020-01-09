package session7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product id ");
        Long id = s.nextLong();
        s.nextLine();
        System.out.println("Enter the product name");
        String productName = s.nextLine();
        System.out.println("Enter the supplier name");
        String supplierName = s.nextLine();
        Product pro = new Product(id, productName, supplierName);
        System.out.println("Enter the product id ");
        Long id1 = s.nextLong();
        s.nextLine();
        System.out.println("Enter the product name");
        String productName1 = s.nextLine();
        System.out.println("Enter the supplier name");
        String supplierName1 = s.nextLine();
        Product pro1 = new Product(id1, productName1, supplierName1);
        if (pro.equals(pro1)) {
            System.out.println("The two products are the same");
        } else {
            System.out.println("The two products are different ");
        }
        s.close();
    }
}
