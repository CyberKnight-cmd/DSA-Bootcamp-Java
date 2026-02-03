import java.util.Scanner;

public class LeapYearChecker {
    private int year;
    
    LeapYearChecker(Scanner sc) {
        System.out.println("Enter year: ");
        year = sc.nextInt();
    }
    
    boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeapYearChecker checker = new LeapYearChecker(sc);
        if (checker.isLeapYear()) {
            System.out.println(checker.year + " is a leap year");
        } else {
            System.out.println(checker.year + " is not a leap year");
        }
    }
}