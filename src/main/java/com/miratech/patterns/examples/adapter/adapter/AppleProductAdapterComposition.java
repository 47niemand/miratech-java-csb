package com.miratech.patterns.examples.adapter.adapter;


import com.miratech.patterns.examples.adapter.legacy.Apple;
import com.miratech.patterns.examples.adapter.product.IProduct;

public class AppleProductAdapterComposition implements IProduct {
    Apple apple;

    public AppleProductAdapterComposition(final Apple apple) {
        this.apple = apple;
    }

    public String getTaste() {
        if (apple.getColor().equals("red")) {
            return "Good red apples";
        } else {
            return "Bad apples";
        }
    }

}
