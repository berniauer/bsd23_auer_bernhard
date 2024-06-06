package at.campus02.bsd;


public class Main {


    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.minus(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Division: " + calc.divide(5, 3));
        System.out.println("Factorial: " + calc.factorial(6));

        // test division by zero
        try {
            System.out.println("Division (by zero): " + calc.divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Bernhard Auer");
    }

}
