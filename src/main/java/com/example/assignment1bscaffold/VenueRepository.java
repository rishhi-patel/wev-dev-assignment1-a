package com.example.assignment1bscaffold;

import java.util.ArrayList;
import java.util.List;

public class VenueRepository implements IVenueRepository {
    private List<String> bookedVenues = new ArrayList<>();

    @Override
    public void bookVenue(String name, String date) {
        bookedVenues.add(name + " on " + date);
    }

    @Override
    public List<String> getBookedVenues() {
        return new ArrayList<>(bookedVenues);
    }
}
