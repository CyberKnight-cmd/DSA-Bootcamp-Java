import java.util.Scanner;

public class DivisibilityChecker {
    private int number;
    
    DivisibilityChecker(Scanner sc) {
        System.out.println("Enter a number: ");
        number = sc.nextInt();
    }
    
    boolean isDivisibleBy5() {
        return number % 5 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DivisibilityChecker checker = new DivisibilityChecker(sc);
        if (checker.isDivisibleBy5()) {
            System.out.println(checker.number + " is divisible by 5");
        } else {
            System.out.println(checker.number + " is not divisible by 5");
        }
    }
}