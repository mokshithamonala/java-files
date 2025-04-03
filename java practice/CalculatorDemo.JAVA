class Calculator {
    protected double num1;
    protected double num2;
    
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void displayNumbers() {
        System.out.println("Numbers: " + num1 + " and " + num2);
    }
}

class AdditionCalculator extends Calculator {
    public AdditionCalculator(double num1, double num2) {
        super(num1, num2);
    }
    
    public double add() {
        return num1 + num2;
    }
}

class SubtractionCalculator extends AdditionCalculator {
    public SubtractionCalculator(double num1, double num2) {
        super(num1, num2);
    }
    
    public double subtract() {
        return num1 - num2;
    }
}

class MultiplicationCalculator extends SubtractionCalculator {
    public MultiplicationCalculator(double num1, double num2) {
        super(num1, num2);
    }
    
    public double multiply() {
        return num1 * num2;
    }
}

class DivisionCalculator extends MultiplicationCalculator {
    public DivisionCalculator(double num1, double num2) {
        super(num1, num2);
    }
    
    public double divide() {
        if(num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        DivisionCalculator calc = new DivisionCalculator(10, 5);
        
        calc.displayNumbers();
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
    }
}