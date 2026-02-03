import java.util.Scanner;

public class ExponentialCalculator {
    private double base;
    private int exponent;
    
    ExponentialCalculator(Scanner sc) {
        System.out.println("Enter base: ");
        base = sc.nextDouble();
        System.out.println("Enter exponent: ");
        exponent = sc.nextInt();
    }
    
    double calculatePower() {
        return Math.pow(base, exponent);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExponentialCalculator calculator = new ExponentialCalculator(sc);
        System.out.println(calculator.base + "^" + calculator.exponent + " = " + calculator.calculatePower());
    }
}