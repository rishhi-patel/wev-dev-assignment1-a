package com.example.assignment1bscaffold;

import java.util.List;

public class VenueService {
    private IVenueRepository venueRepository;

    public VenueService(IVenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    public void bookVenue(String name, String date) {
        venueRepository.bookVenue(name, date);
    }

    public void printBookedVenues() {
        System.out.println("Booked Venues:");
        venueRepository.getBookedVenues().forEach(System.out::println);
    }
}
