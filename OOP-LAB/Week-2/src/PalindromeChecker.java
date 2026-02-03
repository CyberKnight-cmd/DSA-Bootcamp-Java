import java.util.Scanner;

public class PalindromeChecker {
    private int number;
    
    PalindromeChecker(Scanner sc) {
        System.out.println("Enter a number: ");
        number = sc.nextInt();
    }
    
    boolean isPalindrome() {
        int original = Math.abs(number);
        int reversed = 0;
        int temp = original;
        
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        
        return original == reversed;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker(sc);
        System.out.println(checker.isPalindrome() ? "Palindrome" : "Not a Palindrome");
    }
}