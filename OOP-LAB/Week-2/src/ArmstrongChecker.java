import java.util.Scanner;

public class ArmstrongChecker {
    private int number;
    
    ArmstrongChecker(Scanner sc) {
        System.out.println("Enter a number: ");
        number = sc.nextInt();
    }
    
    int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    
    boolean isArmstrong() {
        int original = number;
        int digits = countDigits(number);
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        
        return sum == original;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArmstrongChecker checker = new ArmstrongChecker(sc);
        System.out.println(checker.isArmstrong() ? "Armstrong Number" : "Not an Armstrong Number");
    }
}