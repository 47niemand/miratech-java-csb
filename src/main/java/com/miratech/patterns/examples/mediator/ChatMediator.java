package com.miratech.patterns.examples.mediator;

import java.util.ArrayList;
import java.util.List;


public interface ChatMediator {

    void sendMessage(String msg, AbstractUser user);

    void addUser(AbstractUser user);
}

class ChatMediatorImpl implements ChatMediator {

    private List<AbstractUser> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<AbstractUser>();
    }


    public void addUser(AbstractUser user) {
        this.users.add(user);
    }


    public void sendMessage(String msg, AbstractUser user) {
        for (AbstractUser u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receive(msg);
            }
        }
    }

}