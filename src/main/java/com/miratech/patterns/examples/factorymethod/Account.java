package com.miratech.patterns.examples.factorymethod;


import java.util.Random;

class Account {
    static boolean isPremium() {
        return new Random().nextBoolean();
    }
}
