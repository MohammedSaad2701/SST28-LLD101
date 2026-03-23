package com.example.parking;

import java.time.LocalDateTime;

public class ParkingTicket {
    private String ticketId;
    private Vehicle vehicle;
    private LocalDateTime inTime;

    public ParkingTicket(String ticketId, Vehicle vehicle, LocalDateTime inTime) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.inTime = inTime;
    }
}
