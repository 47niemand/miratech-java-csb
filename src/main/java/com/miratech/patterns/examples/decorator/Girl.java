package com.miratech.patterns.examples.decorator;

public abstract class Girl {
    protected String description = "no particular";

    public String getDescription() {
        return description;
    }
}

class AmericanGirl extends Girl {
    public AmericanGirl() {
        description = "+American";
    }
}

class EuropeanGirl extends Girl {
    public EuropeanGirl() {
        description = "+European";
    }
}
