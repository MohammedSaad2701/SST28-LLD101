package com.example.parking;

import java.time.LocalDateTime;

public class TicketService {
    private SlotAssignmentStrategy strategy;

    public TicketService(SlotAssignmentStrategy strategy) {
        this.strategy = strategy;
    }

    public ParkingTicket generateTicket(Vehicle vehicle) {
        ParkingSlot slot = strategy.getSlot(SlotType.SMALL);
        if (slot != null) {
            slot.assignVehicle(vehicle);
        }
        return new ParkingTicket("T1", vehicle, LocalDateTime.now());
    }
}
