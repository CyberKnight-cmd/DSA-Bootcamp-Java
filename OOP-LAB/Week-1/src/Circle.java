import java.util.Scanner;

public class Circle {
    private double radius;
    private final double PI = 3.14159;
    
    Circle(Scanner sc) {
        System.out.println("Enter radius: ");
        radius = sc.nextDouble();
    }
    
    double getArea() {
        return PI * radius * radius;
    }
    
    double getPerimeter() {
        return 2 * PI * radius;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle(sc);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}