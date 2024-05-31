package com.example.assignment1bscaffold;

import java.util.ArrayList;
import java.util.List;

// Repository class implementing IEventRepository, also an Information Expert.
public class EventRepository implements IEventRepository {
    private List<Event> events = new ArrayList<>();

    @Override
    public void addEvent(Event event) {
        events.add(event);
    }

    @Override
    public void updateEvent(Event event) {
        // Placeholder for update logic, could include more complex logic to find and
        // replace events
    }

    @Override
    public List<Event> getAllEvents() {
        return new ArrayList<>(events);
    }
}
