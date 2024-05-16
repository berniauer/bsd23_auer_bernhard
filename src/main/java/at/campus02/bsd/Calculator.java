package at.campus02.bsd;

public class Calculator {
    public Calculator() {

    }


    public double add(double number1, double number2) {
        return number1 + number2;
    }


    public double minus(double number1, double number2) {
        return number1 - number2;
    }


    public double multiply(double number1, double number2) {
        return number1 * number2;
    }


    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return number1 / number2;
    }

    public long factorial(int number){
        if(number < 0) return 0;
        return number > 1 ?  number * factorial(number - 1) :  1;
    }
}
