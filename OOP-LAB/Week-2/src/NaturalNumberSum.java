import java.util.Scanner;

public class NaturalNumberSum {
    private int range;
    
    NaturalNumberSum(Scanner sc) {
        System.out.println("Enter the range: ");
        range = sc.nextInt();
    }
    
    int calculateSum() {
        return range * (range + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NaturalNumberSum calculator = new NaturalNumberSum(sc);
        System.out.println("Sum of natural numbers up to " + calculator.range + ": " + calculator.calculateSum());
    }
}