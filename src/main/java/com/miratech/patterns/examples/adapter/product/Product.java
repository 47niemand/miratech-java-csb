package com.miratech.patterns.examples.adapter.product;



public class Product implements IProduct {
    private String name;
    private int tasteLevel;

    public Product(final String name, final int tasteScale) {
        this.name = name;
        this.tasteLevel = tasteScale;
    }

    public String getTaste() {
        if (tasteLevel > 60) {
            return name + " is delicious";
        } else {
            return name + " is bad";
        }
    }
}
