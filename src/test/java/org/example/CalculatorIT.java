package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorIT {

    @Test
    void testIntegration() {
        // Imagine this simulates DB or network setup
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        assertTrue(result > 0);
    }
}
