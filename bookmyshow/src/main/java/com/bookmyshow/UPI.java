package com.bookmyshow;

public class UPI implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}