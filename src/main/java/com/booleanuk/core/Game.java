package com.booleanuk.core;

public class Game implements Item {
    String name;
    int price;

    public Game(String name, int price) {
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
