package session7;

import java.util.Scanner;

public class MainProduct {

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
        System.out.println(id + ":" + productName + ":" + supplierName);
        System.out.println("Invoking getClass() method :" + pro.getClass());
        s.close();
    }

}
