import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int x, y, Multiplication;
        Scanner myobj = new Scanner(System.in);

        System.out.println("Type x value");
        x = myobj.nextInt();
        
        System.out.println("Type y value");
        y = myobj.nextInt();

        Multiplication = x * y;

        System.out.println("Multiplication: " + Multiplication);
    }
}
