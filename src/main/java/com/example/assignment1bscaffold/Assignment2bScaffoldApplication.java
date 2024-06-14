package com.example.assignment1bscaffold;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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