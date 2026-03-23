package com.example.parking;

import java.util.List;

public class ParkingLot {
    private String name;
    private List<Floor> floors;

    public ParkingLot(String name, List<Floor> floors) {
        this.name = name;
        this.floors = floors;
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
