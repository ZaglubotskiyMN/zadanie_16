package part1.lessons16.task1;

import java.util.List;

public interface Basket {
    void addProducts(String product,int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();
    List<String> getProducts();
    int getProductQuantity(String product);
}
