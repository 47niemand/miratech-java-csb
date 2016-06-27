package com.miratech.test;

/**
 * Created by Roman Zolotarov on 29/4/16.
 */
public class CustomKey {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int hashCode() {
        return value;
    }

    public static void main(String[] args) {

    }

}