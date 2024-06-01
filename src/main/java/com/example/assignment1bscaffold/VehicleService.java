package com.example.assignment1bscaffold;

import java.util.List;

//focused on vehicle-related business operations.
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void addVehicle(String make, String model, int year) {
        Vehicle vehicle = new Vehicle(make, model, year);
        vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public void printAllVehicles() {
        List<Vehicle> vehicles = vehicleRepository.findAll();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
