package com.bookmyshow;

public class Credit implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid via Credit Card: " + amount);
    }
}