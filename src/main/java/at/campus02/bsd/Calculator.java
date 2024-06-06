package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {

    }


    public double add(double number1, double number2) {
        logger.debug("Addition called with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug("Subtraction called with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("Multiplication called with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            logger.error("Attempted to divide by zero with parameters: number1 = {}, number2 = {}", number1, number2);
            throw new ArithmeticException("Cannot divide by zero");
        }
        logger.debug("Division called with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1 / number2;
    }

    public long factorial(int number){
        logger.debug("Factorial called with parameter: number = {}", number);
        if(number < 0) return 0;
        return number > 1 ?  number * factorial(number - 1) :  1;
    }
}
