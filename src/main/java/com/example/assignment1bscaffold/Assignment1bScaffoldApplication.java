package com.example.assignment1bscaffold;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1bScaffoldApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1bScaffoldApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		VehicleController vehicleService = new VehicleController(new VehicleService(new VehicleRepository()));

		vehicleService.addVehicle("Toyota", "Corolla", 2020);
		vehicleService.addVehicle("Ford", "Mustang", 2021);
		vehicleService.addVehicle("Lamborghini", "Gallardo", 2022);
		vehicleService.addVehicle("Pagani", "Huyara", 2021);

		vehicleService.printAllVehicles();
	}
}
