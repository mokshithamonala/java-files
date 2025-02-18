import java.util.Scanner;
 public class celsius_to_farenheit {
   public static void main(String[] args) {
   int C,F;
   Scanner myobj = new Scanner(System.in);
   System.out.println("enter the value of F");
   F = myobj.nextInt();
   C = (F - 32)* 5/9;
   System.out.println("Celsius is:"+C);
  }
 }