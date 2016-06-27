package com.miratech.patterns.examples.decorator;


public class DecoratorMain {

    public static void main(String[] args) {
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());


        Science g2 = new Science(g1);
        System.out.println(g2.getDescription());
        g2.calculateStuff();

        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());
        g3.draw();
    }
}
