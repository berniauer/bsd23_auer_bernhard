package at.campus02.bsd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;


    @BeforeEach
    public void setup() {
        this.calculator = new Calculator();
    }

    @Test
    public void testAddPositiveNumbers() {

        assertEquals(8, calculator.add(5, 3));

    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-8, calculator.add(-5, -3));

    }

    @Test
    public void testAddZero() {
        assertEquals(5, calculator.add(5, 0));
    }

    @Test
    public void testMinusPositiveNumbers() {
        assertEquals(2, calculator.minus(5, 3));
    }

    @Test
    public void testMinusNegativeNumbers() {
        assertEquals(-2, calculator.minus(-5, -3));
    }

    @Test
    public void testMinusWithZero() {
        assertEquals(5, calculator.minus(5, 0));
    }

    @Test
    public void testMultiplyWithPositiveNumbers() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testMultiplyWithNegativeNumbers() {
        assertEquals(15, calculator.multiply(-5, -3));
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    public void testDivideWithNegativeNumbers() {
        assertEquals(-2, calculator.divide(-10, 5));
    }

    @Test
    public void testDivideWithNegativeResult() {
        assertEquals(-2, calculator.divide(10, -5));
    }

    @Test
    public void testDivideByOne() {
        assertEquals(10, calculator.divide(10, 1));
    }

    @Test
    public void testDivideWithZeroNumerator() {
        assertEquals(0, calculator.divide(0, 5));
    }

    @Test
    public void testDivideByZeroThrowsArithmeticException() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }

    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorialNegativeNumber() {
        assertEquals(0, calculator.factorial(-5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, calculator.factorial(0));
    }


}
