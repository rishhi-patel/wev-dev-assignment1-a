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
        guestRepository.getGuestList().forEach(System.out::println);
    }
}
