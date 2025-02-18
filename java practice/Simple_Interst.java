import java.util.Scanner;

public class Simple_Interst{
    public static void main(String[] args) {
        int p,t,r,Simple_Interst;
        Scanner myobj = new Scanner(System.in);

        System.out.println("enter the value of p");
        p = myobj.nextInt();
        
        System.out.println("Enter the value of t");
        t = myobj.nextInt();

        System.out.println("enter the value of p");
        r = myobj.nextInt();
        Simple_Interst = (p * t *r)/100;

        System.out.println("Simple_Interst: " + Simple_Interst);
    }
}
