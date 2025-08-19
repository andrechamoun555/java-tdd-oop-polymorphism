package com.booleanuk.core;

import java.io.Serializable;

public class Book implements Item {
    String name;
    int price;

    public Book(String name, int price) {
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
