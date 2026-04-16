package com.bundlab.finance.service;

import com.bundlab.finance.model.Transaction;
import com.bundlab.finance.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public void delete(Long id) {
        transactionRepository.deleteById(id);
    }

    public BigDecimal getBalance(LocalDate start, LocalDate end) {
        BigDecimal income = transactionRepository.getTotalIncome(start, end);
        BigDecimal expense = transactionRepository.getTotalExpense(start, end);
        return income.subtract(expense);
    }
}