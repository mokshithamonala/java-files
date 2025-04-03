import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input an integer number less than ten billion: ");
        long number = scanner.nextLong();
        
        if (number < 0) {
            System.out.println("Please enter a positive number.");
        } else if (number >= 10_000_000_000L) {
            System.out.println("Number should be less than ten billion.");
        } else {
            int digitCount = 0;
            
            if (number == 0) {
                digitCount = 1;
            } else {
                long temp = number;
                while (temp != 0) {
                    temp /= 10;
                    digitCount++;
                }
            }
            
            System.out.println("Number of digits in the number: " + digitCount);
        }
        
        scanner.close();
    }
}