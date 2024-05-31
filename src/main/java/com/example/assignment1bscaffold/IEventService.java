package com.example.assignment1bscaffold;

import java.util.List;

// Interface for Event Service demonstrating Polymorphism
public interface IEventService {
    void createEvent(Event event);

    void updateEvent(Event event);

    List<Event> findAllEvents();
}
