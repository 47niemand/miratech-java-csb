package com.miratech.patterns.examples.adapter.adapter;


import com.miratech.patterns.examples.adapter.legacy.Apple;
import com.miratech.patterns.examples.adapter.product.IProduct;

public class AppleProductAdapterInheritance extends Apple implements IProduct {

    public AppleProductAdapterInheritance(final String color) {
        super(color);
    }

    public String getTaste() {
        if (getColor().equals("red")) {
            return "Good red apples";
        } else {
            return "Bad apples";
        }
    }


}
