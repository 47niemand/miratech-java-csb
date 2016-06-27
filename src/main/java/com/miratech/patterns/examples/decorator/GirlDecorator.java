package com.miratech.patterns.examples.decorator;


public abstract class GirlDecorator extends Girl {
    public abstract String getDescription();
}

class Science extends GirlDecorator {

    private Girl girl;

    public Science(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Science";
    }

    public void calculateStuff() {
        System.out.println("scientific calculation!");
    }
}

class Art extends GirlDecorator {

    private Girl girl;

    public Art(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Art";
    }

    public void draw() {
        System.out.println("draw pictures!");
    }
}


