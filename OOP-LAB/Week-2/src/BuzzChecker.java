import java.util.Scanner;

public class BuzzChecker {
    private int number;
    
    BuzzChecker(Scanner sc) {
        System.out.println("Enter a number: ");
        number = sc.nextInt();
    }
    
    boolean isBuzz() {
        return (number % 7 == 0) || (number % 10 == 7);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BuzzChecker checker = new BuzzChecker(sc);
        System.out.println(checker.isBuzz() ? "Buzz Number" : "Not a Buzz Number");
    }
}