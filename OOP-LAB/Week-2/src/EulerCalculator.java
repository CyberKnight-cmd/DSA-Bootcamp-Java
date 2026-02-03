import java.util.Scanner;

public class EulerCalculator {
    private int terms;
    
    EulerCalculator(Scanner sc) {
        System.out.println("Enter number of terms: ");
        terms = sc.nextInt();
    }
    
    long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    double calculateEuler() {
        double euler = 1.0;
        
        for (int i = 1; i <= terms; i++) {
            euler += 1.0 / factorial(i);
        }
        
        return euler;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EulerCalculator calculator = new EulerCalculator(sc);
        System.out.println("Euler's number (e): " + calculator.calculateEuler());
    }
}