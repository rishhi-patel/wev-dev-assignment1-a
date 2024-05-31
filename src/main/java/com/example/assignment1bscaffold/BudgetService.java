package com.example.assignment1bscaffold;

public class BudgetService {
    private IBudgetRepository budgetRepository;

    public BudgetService(IBudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public void recordExpense(String description, double amount) {
        budgetRepository.recordExpense(description, amount);
    }

    public void printBudgetReport() {
        System.out.println("Budget Report:");
        budgetRepository.getExpenses()
                .forEach(expense -> System.out.println(expense.getDescription() + ": $" + expense.getAmount()));
    }
}
