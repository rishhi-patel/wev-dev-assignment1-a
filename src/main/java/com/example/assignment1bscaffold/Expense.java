package com.example.assignment1bscaffold;

public class Expense {
    private String description;
    private double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    // Setters (if needed, depending on whether you allow modifications to existing
    // expenses)
    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Optional: Override toString for easier display of expenses
    @Override
    public String toString() {
        return "Expense{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
