package com.miratech.patterns.examples.flyweight;

import java.util.HashMap;
import java.util.Random;

interface Shape {
    void draw(int x, int y, int radius);
}

class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y, int radius) {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}

class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}


public class Flyweight {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            Random random = new Random();
            circle.draw(random.nextInt(100), random.nextInt(100), random.nextInt(10));
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}


