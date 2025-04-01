public class Calculator { 
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(20, 50)); 
        System.out.println("Sum of 3.5 and 6.2: " + calc.add(3.5, 6.2));
        System.out.println("Sum of 20, 30 and 20: " + calc.add(20, 30, 20));
    }
}
