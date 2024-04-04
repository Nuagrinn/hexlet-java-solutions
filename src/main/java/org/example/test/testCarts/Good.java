package org.example.test.testCarts;

public final class Good {
    private String name;
    private int price;

    Good(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}