package org.example.test.testCarts;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.example.test.testCarts.Carts.makeCart;

//Напишите тесты для корзины интернет-магазина. Интерфейс корзины следующий:
public class TestCart {

    private static Cart cart;
    private static Good car = new Good("car", 3);;
    private static Good house = new Good("house", 10);


    @BeforeAll
    private static void init() {
        cart = makeCart();
        cart.addItem(car, 5);
        cart.addItem(house, 2);
    }

    @Test
    public void testCart() {

        assertEquals(cart.getItems().size(), 2);
        assertEquals(cart.getCost(), 35);
        assertEquals(cart.getCount(), 7);

    }

}
