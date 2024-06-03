package com.example.assignment1bscaffold;

import java.util.ArrayList;
import java.util.List;

// handles storage and retrieval
public class ScienceFairRepository {
    private List<ScienceFair> fairs = new ArrayList<>();

    public void addScienceFair(ScienceFair fair) {
        fairs.add(fair);
    }

    public List<ScienceFair> getAllFairs() {
        return fairs;
    }
}
