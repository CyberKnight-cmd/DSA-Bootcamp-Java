import java.util.Scanner;

public class FibonacciGenerator {
    private int terms;
    
    FibonacciGenerator(Scanner sc) {
        System.out.println("Enter number of terms: ");
        terms = sc.nextInt();
    }
    
    void generateSeries() {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        
        if (terms >= 1) System.out.print(first + " ");
        if (terms >= 2) System.out.print(second + " ");
        
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciGenerator generator = new FibonacciGenerator(sc);
        generator.generateSeries();
    }
}