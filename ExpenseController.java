package com.enterprise.expensemanagement.controller;


import com.enterprise.expensemanagement.model.Expense;
import com.enterprise.expensemanagement.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseService.createExpense(expense);
    }
}