package com.example.assignment1bscaffold;

import java.util.List;

// Information Expert which handles all processes related to venue management.
public class VenueService {
    private IVenueRepository venueRepository;

    // here an exmaple of Polymorphism VenueService uses an interface
    // (IVenueRepository) to interact with the repository
    public VenueService(IVenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    public void bookVenue(String name, String date) {
        venueRepository.bookVenue(name, date);
    }

    public void printBookedVenues() {
        System.out.println("Booked Venues:");
        List<String> bookedVenues = venueRepository.getBookedVenues();
        for (String venue : bookedVenues) {
            System.out.println(venue);
        }
    }
}
