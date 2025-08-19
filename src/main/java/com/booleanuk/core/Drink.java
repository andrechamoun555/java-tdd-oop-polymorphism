package com.booleanuk.core;

public class Drink implements Item {
    String name;
    int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
