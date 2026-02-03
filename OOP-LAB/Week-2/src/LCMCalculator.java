import java.util.Scanner;

public class LCMCalculator {
    private int num1, num2;
    
    LCMCalculator(Scanner sc) {
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
    }
    
    int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    int calculateLCM() {
        return (num1 * num2) / calculateHCF(num1, num2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LCMCalculator calculator = new LCMCalculator(sc);
        System.out.println("LCM of " + calculator.num1 + " and " + calculator.num2 + ": " + calculator.calculateLCM());
    }
}