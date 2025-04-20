package calculator.controller;

import calculator.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public ResponseEntity<Double> calculateVacationPay(
            @RequestParam double averageSalary,
            @RequestParam int vacationDays
    ) {
        double result = calculatorService.calculate(averageSalary, vacationDays);
        return ResponseEntity.ok(result);
    }
}
