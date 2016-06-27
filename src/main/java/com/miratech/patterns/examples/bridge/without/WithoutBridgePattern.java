package com.miratech.patterns.examples.bridge.without;


abstract class Sender {
    public abstract void send(String message);

}

abstract class SmsSender extends Sender {
    public String packageMessage(String message) {
        return "SMS [" + message + "]";
    }

    class Asynchronous extends SmsSender {
        public void send(String message) {
            System.out.printf("Send async message : " + this.packageMessage(message));
        }
    }

    class Synchronous extends SmsSender {
        public void send(String message) {
            System.out.printf("Send sync message : " + this.packageMessage(message));
        }
    }
}

abstract class EmailSender extends Sender {
    public String packageMessage(String message) {
        return "Email [" + message + "]";
    }

    class Asynchronous extends EmailSender {
        public void send(String message) {
            System.out.printf("Send async message : " + this.packageMessage(message));
        }
    }

    class Synchronous extends EmailSender {
        public void send(String message) {
            System.out.printf("Send sync message : " + this.packageMessage(message));
        }
    }
}


public class WithoutBridgePattern {
    public static void main(String[] args) {

    }
}
