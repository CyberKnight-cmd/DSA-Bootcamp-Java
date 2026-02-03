import java.util.Scanner;

public class QuadraticSolver {
    private double a, b, c;
    
    QuadraticSolver(Scanner sc) {
        System.out.println("Enter coefficients of quadratic equation (ax² + bx + c = 0):");
        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();
    }
    
    void findRoots() {
        if (a == 0) {
            System.out.println("Not a quadratic equation");
            return;
        }
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Real and distinct roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Real and equal roots:");
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Complex roots:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuadraticSolver solver = new QuadraticSolver(sc);
        solver.findRoots();
    }
}