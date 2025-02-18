import java.util.Scanner;

public class Area_of_rectangle {
    public static void main(String[] args) {
        int x, y, Area_of_rectangle;
        Scanner myobj = new Scanner(System.in);

        System.out.println("enter the value of length");
        x = myobj.nextInt();
        
        System.out.println("Enter the value of breadth");
        y = myobj.nextInt();

        Area_of_rectangle = x * y;

        System.out.println("Area_of_rectangle: " + Area_of_rectangle);
    }
}
