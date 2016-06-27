package com.miratech.test;


public class Account {
    Salary salary;

    double calculateSalary(int month) {
        double monthlySalary = salary.amount;
        return monthlySalary * month;
    }
}
