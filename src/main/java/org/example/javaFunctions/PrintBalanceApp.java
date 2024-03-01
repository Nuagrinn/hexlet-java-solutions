package org.example.javaFunctions;

import java.util.Map;

// Java: Функции 2. Лямбда-функции
// В классе App реализуйте публичный статический метод printBalance(), который выведет на экран названия тех фруктов,
// которых осталось мало на складе. Метод принимает два параметра:
//
//        Склад, Map<String, Integer>, которая содержит названия товаров и их количество на складе
//        Минимальный остаток для количества товара, целое число
//        Метод должен вывести на экран название тех товаров, которых на складе осталось меньше минимального остатка.
//        Каждый товар с новой строки


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
