package com.bookmyshow;

public class Debit implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid via Debit Card: " + amount);
    }
}