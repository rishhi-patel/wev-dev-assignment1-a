package com.example.assignment1bscaffold;

import java.util.List;

// Controller class that is not the main class.
public class EventController {
    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    // Creator: Creates events
    public void createEvent(Event event) {
        System.out.println("started creating ");
        eventService.createEvent(event);
        System.out.println("Event created successfully!");
    }

    // Updates events
    public void updateEvent(Event event) {
        eventService.updateEvent(event);
        System.out.println("Event updated successfully!");
    }

    // Displays all events, demonstrating Indirection by delegating data fetching to
    // EventService
    public void displayEvents() {
        List<Event> events = eventService.findAllEvents();
        events.forEach(event -> System.out.println(
                "Event: " + event.getName() + ", Date: " + event.getDate() + ", Location: " + event.getLocation()));
    }
}
