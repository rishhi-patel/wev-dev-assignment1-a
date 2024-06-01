package com.example.assignment1bscaffold;

import java.util.ArrayList;
import java.util.List;

//VehicleRepository is only concerned with storage and retrieval to show low Coupling
public class VehicleRepository {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void save(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> findAll() {
        return vehicles;
    }
}
