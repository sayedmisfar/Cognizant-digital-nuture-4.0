package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("🔧 Setup before each test");
        calculator = new Calculator(); // Arrange
    }

    @After
    public void tearDown() {
        System.out.println("🧹 Cleanup after each test");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(3, 4);

        // Assert
        assertEquals("Addition failed", 7, result);
    }

    @Test
    public void testMultiplication() {
        // Act
        int result = calculator.multiply(2, 5);

        // Assert
        assertEquals("Multiplication failed", 10, result);
    }
}
