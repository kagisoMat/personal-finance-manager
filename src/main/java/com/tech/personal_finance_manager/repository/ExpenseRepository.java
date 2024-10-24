package com.tech.personal_finance_manager.repository;

import com.tech.personal_finance_manager.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
