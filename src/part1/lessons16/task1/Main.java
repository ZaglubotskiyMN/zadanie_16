package part1.lessons16.task1;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        MyBasket basket =new MyBasket();
        System.out.println("Добавляем продукты в корзину");
        basket.addProducts("Milk",10);
        basket.addProducts("Bread",15);
        basket.addProducts("Beer",25);
        basket.showAll();
        System.out.println("Удаляем продукт");
        basket.removeProduct("Beer");
        basket.showAll();
        //System.out.println("Модифицируем продукт");
        //basket.updateProductQuantity("water",35);
       // basket.showAll();
        //System.out.println("Удаляем корзину!");
       //basket.clear();
       // basket.showAll();






    }


}


