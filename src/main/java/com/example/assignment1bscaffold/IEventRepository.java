package com.example.assignment1bscaffold;

import java.util.List;

// Interface for Event Repository demonstrating Polymorphism and Low Coupling
public interface IEventRepository {
    void addEvent(Event event);

    void updateEvent(Event event);

    List<Event> getAllEvents();
}
