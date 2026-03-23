package com.example.parking;

import java.time.LocalDateTime;
import java.util.Date;

public class BillingService {

    public Bill generateBill(ParkingTicket ticket, Date exitTime) {
        return new Bill("B1", ticket, LocalDateTime.now(), 100.0);
    }
}