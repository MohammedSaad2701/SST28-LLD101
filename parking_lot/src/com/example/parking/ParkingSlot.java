package com.example.parking;

public class ParkingSlot {
    private String slotId;
    private SlotType type;
    private Vehicle vehicle;

    public ParkingSlot(String slotId, SlotType type) {
        this.slotId = slotId;
        this.type = type;
    }

    public boolean isOccupied() {
        return vehicle != null;
    }

    public void assignVehicle(Vehicle v) {
        this.vehicle = v;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public SlotType getType() {
        return type;
    }
}
