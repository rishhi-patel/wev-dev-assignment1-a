package com.example.assignment1bscaffold;

import java.util.Date;

// Simple POJO class for Event
public class Event {
    private String name;
    private Date date;
    private String location;

    public Event(String name, Date date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
        System.out.println("started-------->");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
