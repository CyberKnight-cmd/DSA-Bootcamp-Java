import java.util.Scanner;

public class Calculator {
    private double num1, num2;
    
    Calculator(Scanner sc) {
        System.out.println("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        num2 = sc.nextDouble();
    }
    
    double add() {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator(sc);
        System.out.println("Sum: " + calc.add());
    }
}