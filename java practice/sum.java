import java.util.Scanner;
public class sum {
 public static void main(String[] args) {
  int x,y,z,sum;
  Scanner myobj=new Scanner(System.in);
  System.out.println("Type a number:");
  x=myobj.nextInt();
  System.out.println("Type another number:");
  y=myobj.nextInt();
  System.out.println("Type another number:");
  z=myobj.nextInt();
  System.out.println("Type another number:");
  sum=x+y+z;
  System.out.println("sum is:"+sum);
 }
}