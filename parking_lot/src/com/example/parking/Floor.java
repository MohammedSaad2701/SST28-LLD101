package com.example.parking;

import java.util.List;

public class Floor {
    private int floorId;
    private List<ParkingSlot> slots;

    public Floor(int floorId, List<ParkingSlot> slots) {
        this.floorId = floorId;
        this.slots = slots;
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }
}
