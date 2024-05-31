package com.example.assignment1bscaffold;

import java.util.List;

// Service class implementing IEventService, acting as an Information Expert.
public class EventService implements IEventService {
    private IEventRepository eventRepository;

    public EventService(IEventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public EventService() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void createEvent(Event event) {
        System.out.println("lololo");
        eventRepository.addEvent(event);
    }

    @Override
    public void updateEvent(Event event) {
        eventRepository.updateEvent(event);
    }

    @Override
    public List<Event> findAllEvents() {
        return eventRepository.getAllEvents();
    }
}
