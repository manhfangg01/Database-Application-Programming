package assignment1;

public class WarrantyCard {
    private String warrantyCode;
    private String productName;
    private String customerName;
    private String warrantyPeriod;
    private Product product;

    public WarrantyCard(String warrantyCode, String productName, String customerName, String warrantyPeriod) {
        this.warrantyCode = warrantyCode;
        this.productName = productName;
        this.customerName = customerName;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCode() {
        return warrantyCode;
    }

    public void setWarrantyCode(String warrantyCode) {
        this.warrantyCode = warrantyCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
