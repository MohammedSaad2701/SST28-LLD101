package com.example.parking;

import java.time.LocalDateTime;

public class Bill {
    private String billId;
    private ParkingTicket ticket;
    private LocalDateTime outTime;
    private double amount;

    public Bill(String billId, ParkingTicket ticket, LocalDateTime outTime, double amount) {
        this.billId = billId;
        this.ticket = ticket;
        this.outTime = outTime;
        this.amount = amount;
    }
}
