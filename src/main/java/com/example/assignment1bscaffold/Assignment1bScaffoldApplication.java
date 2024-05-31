package com.example.assignment1bscaffold;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1bScaffoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1bScaffoldApplication.class, args);

		WeddingController controller = new WeddingController(
				new VenueService(new VenueRepository()),
				new GuestService(new GuestRepository()),
				new BudgetService(new BudgetRepository()));

		// Sample usage of wedding planner
		controller.bookVenue("Lakeside Banquet", "2024-05-20");
		controller.addGuest("Jane Doe", "jane.doe@example.com");
		controller.recordExpense("Venue Booking", 2000);
		controller.printEventDetails();
	}

}
