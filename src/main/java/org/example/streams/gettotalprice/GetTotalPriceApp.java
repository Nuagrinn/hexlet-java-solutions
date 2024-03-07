package org.example.streams.gettotalprice;

import java.util.List;


//В классе App реализуйте публичный статический метод getTotalPrice(), который принимает в качестве параметра список
// товаров на складе List<Product>. Метод должен вернуть общую стоимость всех товаров из категории Электроника
// (electronics) на складе (число типа int)
public class GetTotalPriceApp {

    public static int getTotalPrice(List<Product> products) {

        return products.stream()
                .filter(e -> e.getCategory().equals("electronics"))
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        var products = List.of(
                new Product("Smartphone", "electronics", 500),
                new Product("Laptop", "electronics", 1000),
                new Product("Headphones", "electronics", 100),
                new Product("Smart Watch", "electronics", 300),
                new Product("T-Shirt", "cloth", 20),
                new Product("Sneakers", "shoes", 100),
                new Product("Coffee Machine", "kitchen", 200),
                new Product("Sunglasses", "accessories", 50),
                new Product("Book", "books", 15),
                new Product("Gaming Console", "electronics", 400)
        );

        System.out.println(getTotalPrice(products)); // 2300
    }
}
