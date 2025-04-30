import java.util.Scanner;
public class StudentPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the middle name:");
        String middleName = scanner.nextLine();
        System.out.println("Enter the last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter the age:");
        int age = scanner.nextInt(); 
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        String password = "" + firstInitial + middleInitial + lastInitial + age;
        System.out.println("Generated password: " + password);
        scanner.close();
    }
}
