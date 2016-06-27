package com.miratech.patterns.examples;

public class Prototype {
    private int someInt;
    private String someString;

    public Prototype(final int someInt, final String someString) {
        this.someInt = someInt;
        this.someString = someString;
    }

    public Prototype getClone(){
        return new Prototype(someInt, someString);
    }
}
