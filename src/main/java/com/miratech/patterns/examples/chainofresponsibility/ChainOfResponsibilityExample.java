package com.miratech.patterns.examples.chainofresponsibility;


public class ChainOfResponsibilityExample {

    public static void main(String[] args) {

        PressureProcessor pressureProcessor = new PressureProcessor(null);
        TemperatureProcessor temperatureProcessor = new TemperatureProcessor(pressureProcessor);
        HumidityProcessor humidityProcessor = new HumidityProcessor(temperatureProcessor);

        Message message = new Message();
        message.setSensor("temperature");
        humidityProcessor.handleRequest(message);
    }
}
