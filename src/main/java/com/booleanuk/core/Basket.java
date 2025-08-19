package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Item> items = new ArrayList<>();



    public void add(Item item) {
        this.items.add(item);
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i<items.size(); i++) {
            total += items.get(i).getPrice();
        }
        return total;
    }

    public boolean isInBasket(String name) {
        for (Item item : items)  {
            if (item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
