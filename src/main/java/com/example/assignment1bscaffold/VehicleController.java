package com.example.assignment1bscaffold;

import java.util.List;

// Controller class to manage business logics
public class VehicleController {
    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;

    }

    public void addVehicle(String make, String model, int year) {
        vehicleService.addVehicle(make, model, year);
        System.out.println("New vehicle Added..!\n");
    }

    public void printAllVehicles() {
        List<Vehicle> vehicles = vehicleService.getAllVehicles();
        System.out.println("Total vehicles:" + vehicles.size() + "\n");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

}
