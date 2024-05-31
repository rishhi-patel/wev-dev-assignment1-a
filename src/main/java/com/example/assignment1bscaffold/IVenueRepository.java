package com.example.assignment1bscaffold;

import java.util.List;

public interface IVenueRepository {
    void bookVenue(String name, String date);

    List<String> getBookedVenues();
}