package com.example.assignment1bscaffold;

// Controller class which Manages the interactions between UI and business logic/services.
public class WeddingController {
    private VenueService venueService;
    private GuestService guestService;
    private BudgetService budgetService;

    // Constructor Injection an example of Low Coupling.
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
        System.out.println("");
        venueService.printBookedVenues();
        System.out.println("");
        guestService.printGuestList();
        System.out.println("");
        budgetService.printBudgetReport();
    }
}
