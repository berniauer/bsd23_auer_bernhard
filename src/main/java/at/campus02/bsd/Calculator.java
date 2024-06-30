package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is the Calculator class which provides basic arithmetic operations.
 * <p>
 * It supports addition, subtraction, multiplication, division, and factorial operations.
 * Each method logs debug messages with the parameters it was called with.
 * @author Bernhard Auer
 * @version 1.0
 *
 */
public class Calculator {

    /**
     * Logger instance used to log debug messages.
     */
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Default constructor for the Calculator class.
     */
    public Calculator() {

    }

    /**
     * Adds two numbers.
     *
     * @param number1 The first number.
     * @param number2 The second number.
     * @return The sum of number1 and number2.
     */
    public double add(double number1, double number2) {
        logger.debug("Addition called with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1 + number2;
    }

    /**
     * Subtracts two numbers.
     *
     * @param number1 The first number.
     * @param number2 The second number.
     * @return The difference of number1 and number2.
     */
    public double minus(double number1, double number2) {
        logger.debug("Subtraction called with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1 - number2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param number1 The first number.
     * @param number2 The second number.
     * @return The product of number1 and number2.
     */
    public double multiply(double number1, double number2) {
        logger.debug("Multiplication called with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1 * number2;
    }

    /**
     * Divides two numbers.
     *
     * @param number1 The dividend.
     * @param number2 The divisor.
     * @return The result of the division of number1 by number2.
     * @throws ArithmeticException If number2 is zero.
     */
    public double divide(double number1, double number2) {
        if (number2 == 0) {
            logger.error("Attempted to divide by zero with parameters: number1 = {}, number2 = {}", number1, number2);
            throw new ArithmeticException("Cannot divide by zero");
        }
        logger.debug("Division called with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1 / number2;
    }

    /**
     * Calculates the factorial of a number.
     *
     * @param number The number to calculate the factorial of.
     * @return The factorial of the number.
     */
    public long factorial(int number){
        logger.debug("Factorial called with parameter: number = {}", number);
        if(number < 0) return 0;
        return number > 1 ?  number * factorial(number - 1) :  1;
    }
}
