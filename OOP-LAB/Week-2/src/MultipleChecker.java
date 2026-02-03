import java.util.Scanner;

public class MultipleChecker {
    private int m, n;
    
    MultipleChecker(Scanner sc) {
        System.out.println("Enter value of m: ");
        m = sc.nextInt();
        System.out.println("Enter value of n: ");
        n = sc.nextInt();
    }
    
    boolean isMultiple() {
        return n != 0 && m % n == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultipleChecker checker = new MultipleChecker(sc);
        
        if (checker.n == 0) {
            System.out.println("Division by zero is not allowed");
        } else {
            System.out.println(checker.m + (checker.isMultiple() ? " is " : " is not ") + "a multiple of " + checker.n);
        }
    }
}