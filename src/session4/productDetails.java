package session4;

import java.util.Scanner;

public class productDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product id");
        long id = s.nextLong();
        s.nextLine();
        System.out.println("Enter the product name ");
        String productName = s.nextLine();
        System.out.println("Enter the supplier name  ");
        String supplierName = s.nextLine();
        product call = new product();
        call.setId(id);
        call.setName(productName);
        call.setSupplier(supplierName);
        System.out.println("Product Id is " + call.getId());
        System.out.println("Product Name is  " + call.getName());
        System.out.println("Supplier Name is  " + call.getSupplier());
        s.close();
    }

}
