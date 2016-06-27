package com.miratech.patterns.examples.chainofresponsibility;


public class Message {
    private double pressure;
    private int temperature;
    private double humidity;
    private String sensor;

    public double getPressure() {
        return pressure;
    }

    public void setPressure(final double pressure) {
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(final int temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(final double humidity) {
        this.humidity = humidity;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(final String sensor) {
        this.sensor = sensor;
    }
}
