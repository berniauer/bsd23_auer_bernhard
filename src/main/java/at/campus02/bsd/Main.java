package at.campus02.bsd;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is the Main class which is the entry point of the application.
 * It creates an instance of the Calculator class and performs various operations.
 * It also logs information and error messages.
 *
 * @author Bernhard Auer
 * @version 1.0
 */
public class Main {

    /**
     * Logger instance used to log messages.
     */
    private static Logger logger = LogManager.getLogger();

    /**
     * The main method which is the entry point of the application.
     * It creates an instance of the Calculator class and performs various operations.
     * It also logs information and error messages.
     *
     * @param args The command line arguments.
     */
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
