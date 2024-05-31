package com.example.assignment1bscaffold;

public class WeddingController {
    private VenueService venueService;
    private GuestService guestService;
    private BudgetService budgetService;

    public WeddingController(VenueService venueService, GuestService guestService, BudgetService budgetService) {
        this.venueService = venueService;
        this.guestService = guestService;
        this.budgetService = budgetService;
    }

    // Method to book a venue
    public void bookVenue(String venueName, String date) {
        venueService.bookVenue(venueName, date);
        System.out.println("Venue booked: " + venueName + " on " + date);
    }

    // Method to add a guest
    public void addGuest(String name, String email) {
        guestService.addGuest(name, email);
        System.out.println("Guest added: " + name + ", Email: " + email);
    }

    // Method to record an expense
    public void recordExpense(String description, double amount) {
        budgetService.recordExpense(description, amount);
        System.out.println("Expense recorded: " + description + " - $" + amount);
    }

    // Print details for all bookings, guests, and expenses
    public void printEventDetails() {
        System.out.println("\n--- Event Details ---");
        venueService.printBookedVenues();
        guestService.printGuestList();
        budgetService.printBudgetReport();
    }
}
