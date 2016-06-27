package com.miratech.patterns.examples.observer;

import java.util.Observable;

public class ObservableDemo extends Observable {
    private String weather;


    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        setChanged();
        notifyObservers();
    }
}
