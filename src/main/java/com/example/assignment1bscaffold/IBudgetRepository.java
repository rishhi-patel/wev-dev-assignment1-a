package com.example.assignment1bscaffold;

import java.util.ArrayList;
import java.util.List;

public interface IBudgetRepository {
    void recordExpense(String description, double amount);

    List<com.example.assignment1bscaffold.BudgetRepository.Expense> getExpenses();
}
