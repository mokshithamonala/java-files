import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
        
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
        
        sc.close();
    }
}