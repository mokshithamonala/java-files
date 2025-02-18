import java.util.Scanner;

public class LargestOfNumbers {
    public static void main(String[] args) {
        int x, y;
        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter first number");
        x = myobj.nextInt();

        System.out.println("Enter second number");
        y = myobj.nextInt();

        int largest = (x > y) ? x : y;
        System.out.println("The largest number is: " + largest);
    }
}
