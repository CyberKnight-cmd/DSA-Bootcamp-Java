import java.util.Scanner;

public class HCFCalculator {
    private int num1, num2;
    
    HCFCalculator(Scanner sc) {
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
    }
    
    int calculateHCF() {
        int a = num1, b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HCFCalculator calculator = new HCFCalculator(sc);
        System.out.println("HCF of " + calculator.num1 + " and " + calculator.num2 + ": " + calculator.calculateHCF());
    }
}