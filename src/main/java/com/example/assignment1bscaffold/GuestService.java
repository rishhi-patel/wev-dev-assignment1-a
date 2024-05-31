package com.example.assignment1bscaffold;

import java.util.List;

public class GuestService {
    private IGuestRepository guestRepository;

    public GuestService(IGuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public void addGuest(String name, String email) {
        guestRepository.addGuest(name, email);
    }

    public void printGuestList() {
        System.out.println("Guest List:");
        List<String> guests = guestRepository.getGuestList();
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
