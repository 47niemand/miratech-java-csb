package com.miratech.patterns.examples.strategy;


public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.emailId = email;
        this.password = password;
    }


    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}
