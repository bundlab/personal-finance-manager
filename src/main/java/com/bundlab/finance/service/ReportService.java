package com.bundlab.finance.service;

import com.bundlab.finance.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final TransactionRepository repo;

    public BigDecimal getMonthlyIncome(int year, int month) {
        LocalDate start = LocalDate.of(year, month, 1);
        LocalDate end = start.plusMonths(1).minusDays(1);
        return repo.getTotalIncome(start, end);
    }

    // Similar method for expense + budget comparison
}