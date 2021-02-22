package part1.lessons16.task1;

import java.util.*;

public class MyBasket implements Basket {
    private List<Product> product;

    public MyBasket() {
        product = new ArrayList<>();
    }

    public void showAll(){
        product.forEach(System.out::println);
    }


    @Override
    public void addProducts(String product, int quantity) {
        this.product.add(new Product(product, quantity));
    }
    @Override
    public void removeProduct(String product){
        this.product.remove(2);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        this.product.remove(0);
        this.product.add(0,new Product(product, quantity));
    }

    @Override
    public void clear() {
        this.product.removeAll(product);
        boolean removed = product.isEmpty();
        if (removed==true)
            System.out.println("Корзина пуста");
    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}
