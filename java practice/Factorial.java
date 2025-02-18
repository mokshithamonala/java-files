import java.util.Scanner;
public class Factorial {
   public static void main(String[] args) {
        int N, factorial = 1;
       Scanner myobj = new Scanner(System.in);
       System.out.println("Enter a number to calculate its factorial:");
        N = myobj.nextInt();
                for (int I = 1; I <= N; I++) {
          factorial *= I;

        }
        System.out.println("Factorial of " + N + " is: " + factorial);

    }

}