package com.example.assignment1bscaffold;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1bScaffoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1bScaffoldApplication.class, args);
		EventController controller = new EventController(new EventService(new EventRepository()));
		// Demonstration of creating an event
		Event newEvent = new Event("Tech Conference", new Date(0), "Convention Center");
		System.out.println(newEvent.getName());
		controller.createEvent(newEvent);

		// Demonstration of updating an event
		newEvent.setDate(new Date(newEvent.getDate().getTime() + 86400000)); // Adding one day
		controller.updateEvent(newEvent);

		// Demonstration of displaying events
		controller.displayEvents();
	}
}
