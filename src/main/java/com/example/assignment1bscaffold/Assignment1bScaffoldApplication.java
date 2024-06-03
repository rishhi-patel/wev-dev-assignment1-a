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
// Manages application logic flow based on command line arguments
		ScienceFairController scienceFairController = new ScienceFairController();
		String fairTitle = "Annual Science Fair 2024";
		scienceFairController.createFair(fairTitle);
		scienceFairController.registerProject(fairTitle, "VIrtal AI", "Vikas Raj", "AI");
		scienceFairController.registerProject(fairTitle, "Volcano Eruption", "Alice Johnson", "Geology");
		scienceFairController.registerProject(fairTitle, "Hydroponics in Space", "Bob Smith", "Astronomy");
		scienceFairController.displayProjects(fairTitle);
	}
}
