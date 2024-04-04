package org.example.test.testCarts;

import java.util.List;
import java.util.Map;

public interface Cart {
    void addItem(Good item, int count);
    List<Map> getItems();
    int getCost();
    int getCount();
}