public class Products {

    public int productCode, quantity;
    public double value;
    public String productDescription;

    public Products() {
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void dataList() {
        this.productCode = productCode;
        this.quantity = quantity;
        this.value = value;
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "\nProduct code: " + productCode
                + "\nDescription: " + productDescription
                + "\nValue: " + value
                + "\nQuantity: " + quantity;
    }
}
