import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int grade;
        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter  value");
        grade = myobj.nextInt();

        String result = (grade >= 9) ? "Grade is a+" : "Grade is b+";
        System.out.println(result);
    }
}
