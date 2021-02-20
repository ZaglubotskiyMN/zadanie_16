package part1.lessons16.task1;

public interface Basket {
    void addProducts(String product,int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();
}
