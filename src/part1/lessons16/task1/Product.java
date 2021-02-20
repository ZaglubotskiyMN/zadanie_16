package part1.lessons16.task1;

public class Product
{
    private int quantity;
    private String product;

    Product(String product, int quantity) {
        this.setProduct(product);
        this.setQuantity(quantity);
    }

    @Override
    public String toString() {
        return "Product{product='" + getProduct() + '\'' + ", quantity=" + getQuantity() + '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
