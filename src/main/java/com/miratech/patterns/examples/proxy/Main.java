package com.miratech.patterns.examples.proxy;

/**
 * "Subject"
 */
interface Calculator {

    public double add(double x, double y);

    public double sub(double x, double y);

    public double mul(double x, double y);

    public double div(double x, double y);
}

public class Main {

    public static void main(String[] args) {
        // Create math proxy
        Calculator p = new BasicCalculatorProxy();

        // Do the math
        System.out.println("4 + 2 = " + p.add(4, 2));
        System.out.println("4 - 2 = " + p.sub(4, 2));
        System.out.println("4 * 2 = " + p.mul(4, 2));
        System.out.println("4 / 2 = " + p.div(4, 2));

    }
}

/**
 * "Real Subject"
 */
class BasicCalculator implements Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        return x / y;
    }
}

/**
 * "Proxy Object"
 */
class BasicCalculatorProxy implements Calculator {

    private BasicCalculator math;

    public double add(double x, double y) {
        if (math == null) {
            math = new BasicCalculator();
        }
        return math.add(x, y);
    }

    public double sub(double x, double y) {
        if (math == null) {
            math = new BasicCalculator();
        }
        return math.sub(x, y);
    }

    public double mul(double x, double y) {
        if (math == null) {
            math = new BasicCalculator();
        }
        return math.mul(x, y);
    }

    public double div(double x, double y) {
        if (math == null) {
            math = new BasicCalculator();
        }
        return math.div(x, y);
    }
}