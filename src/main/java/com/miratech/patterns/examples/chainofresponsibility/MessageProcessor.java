package com.miratech.patterns.examples.chainofresponsibility;


public abstract class MessageProcessor {

    private MessageProcessor successor;

    public MessageProcessor(final MessageProcessor successor) {
        this.successor = successor;
    }


    public void handleRequest(Message message) {
        if (message.getSensor().equals(getSensorName())) {
            processRequest(message);
        } else {
            if (successor != null) {
                successor.processRequest(message);
            }
        }
    }

    abstract public String getSensorName();

    abstract public void processRequest(Message message);
}

class PressureProcessor extends MessageProcessor {

    public PressureProcessor(final MessageProcessor successor) {
        super(successor);
    }

    public String getSensorName() {
        return "pressure";
    }

    public void processRequest(Message message) {
        System.out.println("Process pressure from message");
    }
}

class TemperatureProcessor extends MessageProcessor {

    public TemperatureProcessor(final MessageProcessor successor) {
        super(successor);
    }

    public String getSensorName() {
        return "temperature";
    }

    public void processRequest(Message message) {
        System.out.println("Process temperature from message");
    }
}

class HumidityProcessor extends MessageProcessor {

    public HumidityProcessor(final MessageProcessor successor) {
        super(successor);
    }

    public String getSensorName() {
        return "humidity";
    }

    public void processRequest(Message message) {
        System.out.println("Process humidity from message");
    }
}



