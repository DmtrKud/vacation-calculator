package calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private static final double AVERAGE_DAYS_IN_MONTH = 29.3;

    public double calculate(double averageSalary, int vacationDays) {
        double averageDailySalary = averageSalary / AVERAGE_DAYS_IN_MONTH;
        return Math.round(averageDailySalary * vacationDays * 100.0) / 100.0;
    }
}
