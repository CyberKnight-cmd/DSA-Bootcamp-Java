import java.util.Scanner;

public class PrimeChecker {
    private int number;
    
    PrimeChecker(Scanner sc) {
        System.out.println("Enter a number: ");
        number = sc.nextInt();
    }
    
    boolean isPrime() {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeChecker checker = new PrimeChecker(sc);
        System.out.println(checker.isPrime() ? "Prime Number" : "Not a Prime Number");
    }
}