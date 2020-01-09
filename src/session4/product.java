package session4;

public class product {
    private long id;
    private String productName;
    private String supplierName;

    public product() {
    }

    public product(long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setSupplier(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplier() {
        return supplierName;
    }

    void display() {
        System.out.println("Product Id is " + id);
        System.out.println("Product Name is  " + productName);
        System.out.println("Supplier Name is  " + supplierName);
    }

}
