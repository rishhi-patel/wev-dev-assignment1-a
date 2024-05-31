package com.example.assignment1bscaffold;

import java.util.ArrayList;
import java.util.List;

public class BudgetRepository implements IBudgetRepository {
    private List<Expense> expenses = new ArrayList<>();

    @Override
    public void recordExpense(String description, double amount) {
        expenses.add(new Expense(description, amount));
    }

    @Override
    public List<Expense> getExpenses() {
        return new ArrayList<>(expenses);
    }

    static class Expense {
        private String description;
        private double amount;

        public Expense(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        public String getDescription() {
            return description;
        }

        public double getAmount() {
            return amount;
        }
    }
}
