import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter the first number:");
        a = myobj.nextInt();

        System.out.println("Enter the second number:");
        b = myobj.nextInt();

        System.out.println("Enter the third number:");
        c = myobj.nextInt();

        // Using ternary operator to find the largest number
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);
    }
}