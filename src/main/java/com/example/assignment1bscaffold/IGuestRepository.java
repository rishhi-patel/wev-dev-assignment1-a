package com.example.assignment1bscaffold;

import java.util.List;

public interface IGuestRepository {
    void addGuest(String name, String email);

    List<String> getGuestList();
}