package com.example.assignment1bscaffold;

import java.sql.Date;

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
		// Creator pattern: MainApp is responsible for creating the WeddingController
		// and initializing it with its dependencies.
		WeddingController controller = new WeddingController(
				new VenueService(new VenueRepository()),
				new GuestService(new GuestRepository()),
				new BudgetService(new BudgetRepository()));

		// Sample usage of wedding planner
		controller.bookVenue("Lakeside Banquet", "2024-05-20");
		controller.addGuest("Rishikumar Patel", "rishhi.dev@gmail.com");
		controller.recordExpense("Venue Booking", 20000);
		controller.printEventDetails();
	}

}
