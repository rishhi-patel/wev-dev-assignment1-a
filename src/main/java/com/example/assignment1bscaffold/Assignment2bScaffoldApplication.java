package com.example.assignment1bscaffold;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Low Coupling & High Cohesion: Each class has a clear, independent role reducing dependencies and focusing on their responsibilities.
// Single Responsibility Principle (SRP): Each class has one reason to change. For example, Vendor is only changed if vendor attributes need to be updated.
//pen/Closed Principle (OCP): The system can easily accommodate new types of vendors without changing existing code, such as adding new functionalities to VendorList.
@SpringBootApplication
public class Assignment2bScaffoldApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Assignment2bScaffoldApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server is Online");
	}
}
