import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();
        
        int days;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28; // Assuming it's not a leap year
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                days = 0; // Invalid month number
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return; // Exit the program
        }
        
        System.out.println("Number of days in month " + month + ": " + days);
    }
}

