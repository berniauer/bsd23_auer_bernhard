package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {



        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.minus(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Division: " + calc.divide(5, 3));
        System.out.println("Factorial: " + calc.factorial(6));


        logger.info("Addition: " + calc.add(5, 3));

        logger.error("Division by zero");
        // test division by zero
        try {
            System.out.println("Division (by zero): " + calc.divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Bernhard Auer");
    }

}
