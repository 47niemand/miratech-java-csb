package com.miratech.patterns.examples.abstractfactory;

interface Color {
    void fill();
}

class Red implements Color {
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

class Green implements Color {
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}

class Blue implements Color {
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
