package com.miratech.patterns.examples.adapter;


import com.miratech.patterns.examples.adapter.adapter.AppleProductAdapterComposition;
import com.miratech.patterns.examples.adapter.legacy.Apple;
import com.miratech.patterns.examples.adapter.product.IProduct;

public class Client {

    static void printProductTaste(IProduct product){
        System.out.println(product.getTaste());
    }

    public static void main(String[] args) {

        Apple apple = new Apple("red");
        AppleProductAdapterComposition adapter = new AppleProductAdapterComposition(apple);


        printProductTaste(adapter);
    }
}
