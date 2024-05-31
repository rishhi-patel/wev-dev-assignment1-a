package com.example.assignment1bscaffold;

import java.util.List;
import java.util.ArrayList;

public class GuestRepository implements IGuestRepository {
    private List<String> guests = new ArrayList<>();

    @Override
    public void addGuest(String name, String email) {
        guests.add(name + " (" + email + ")");
    }

    @Override
    public List<String> getGuestList() {
        return new ArrayList<>(guests);
    }
}
