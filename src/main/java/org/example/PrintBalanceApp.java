package org.example;

import java.util.Map;

public class PrintBalanceApp {

    public static void printBalance(Map<String, Integer> products, Integer amountLow) {
        products.forEach((key, value) -> {
            if(value < amountLow) {
                System.out.println(key);
            }
        });
    }

    public static void main(String[] args) {
        var products = Map.of(
                "Apple", 5,
                "Lemon", 9,
                "Pear", 15
        );

        printBalance(products, 10);

    }

}
