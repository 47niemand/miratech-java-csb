package com.miratech.test;


public class User {
    Account account;

    double getAnnualSalary() {
        return account.calculateSalary(12);
    }

    public static void main(String[] args) {
        User user = new User();
        user.getAnnualSalary();
    }


}
