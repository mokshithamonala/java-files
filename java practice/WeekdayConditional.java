import java.util.Scanner;

class WeekdayConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number (1-7): ");
        int numb = sc.nextInt();
        String day;

        if (numb == 1) {
            day = "Sunday";
        } else if (numb == 2) {
            day = "Monday";
        } else if (numb == 3) {
            day = "Tuesday";
        } else if (numb == 4) {
            day = "Wednesday";
        } else if (numb == 5) {
            day = "Thursday";
        } else if (numb == 6) {
            day = "Friday";
        } else if (numb == 7) {
            day = "Saturday";
        } else {
            day = "Invalid input! Please enter a number between 1 and 7.";
        }
        
        System.out.println("Day of the week is: " + day);
        sc.close();
    }
}
