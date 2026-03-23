package com.example.parking;

public interface SlotAssignmentStrategy {
    ParkingSlot getSlot(SlotType type);
}
