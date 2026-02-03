import java.util.Scanner;

public class NumberChecker {
    private int number;
    
    NumberChecker(Scanner sc) {
        System.out.println("Enter a number: ");
        number = sc.nextInt();
    }
    
    String checkOddEven() {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
    
    String checkPositiveNegative() {
        if (number > 0) return "Positive";
        else if (number < 0) return "Negative";
        else return "Zero";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberChecker checker = new NumberChecker(sc);
        System.out.println("Number is: " + checker.checkOddEven());
        System.out.println("Number is: " + checker.checkPositiveNegative());
    }
}