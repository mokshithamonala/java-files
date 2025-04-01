import java.util.Scanner;

public class AdmissionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter previous qualification percentage:");
        double percentage = scanner.nextDouble();
        
        System.out.println("Enter program type (UG/PG):");
        String program = scanner.next().toUpperCase();

        if (program.equals("UG")) {
            if (percentage >= 60) {
                System.out.println("Congratulations, " + name + "! You are eligible for UG admission.");
            } else {
                System.out.println("Sorry, " + name + ". You do not meet the UG admission criteria.");
            }
        } else if (program.equals("PG")) {
            if (percentage >= 70) {
                System.out.println("Congratulations, " + name + "! You are eligible for PG admission.");
            } else {
                System.out.println("Sorry, " + name + ". You do not meet the PG admission criteria.");
            }
        } else {
            System.out.println("Invalid program type entered. Please enter UG or PG.");
        }
        
        scanner.close();
    }
}