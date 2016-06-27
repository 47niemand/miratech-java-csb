package com.miratech.patterns.examples.bridge;

interface SyncProtocolAPI {
    void send(String message);
}

class Asynchronous implements SyncProtocolAPI {
    public void send(String message) {
        System.out.printf("Send async message : " + message);
    }
}

class Synchronous implements SyncProtocolAPI {
    public void send(String message) {
        System.out.printf("Send sync message : " + message);
    }
}

abstract class Sender {
    protected SyncProtocolAPI protocolAPI;

    protected Sender(SyncProtocolAPI api) {
        this.protocolAPI = api;
    }

    public abstract String packageMessage(String message);

    public void send(String message) {
        protocolAPI.send(packageMessage(message));
    }
}

class SmsSender extends Sender {
    public SmsSender(SyncProtocolAPI syncProtocolAPI) {
        super(syncProtocolAPI);
    }

    public String packageMessage(final String message) {
        return "SMS [" + message + "]";
    }
}

class EmailSender extends Sender {
    public EmailSender(SyncProtocolAPI syncProtocolAPI) {
        super(syncProtocolAPI);
    }

    public String packageMessage(final String message) {
        return "Email [" + message + "]";
    }
}

class BridgePattern {
    public static void main(String[] args) {
    }
}
