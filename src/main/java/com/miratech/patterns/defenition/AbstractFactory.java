package com.miratech.patterns.defenition;

public class AbstractFactory {
    ProductA getProductA() {
        return new ProductA();
    }

    ProductB getProductB() {
        return new ProductB();
    }
}

class ProductA {
}

class ProductB {
}

class Client{
    public static void main(String[] args) {
        AbstractFactory factory = new AbstractFactory();
        factory.getProductA();
        factory.getProductB();
    }
}
