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
}
