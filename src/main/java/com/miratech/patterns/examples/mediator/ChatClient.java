package com.miratech.patterns.examples.mediator;

public class ChatClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        AbstractUser user1 = new User(mediator, "Rick");
        AbstractUser user2 = new User(mediator, "Carl");
        AbstractUser user3 = new User(mediator, "Glen");
        AbstractUser user4 = new User(mediator, "Maggie");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");

    }
}

