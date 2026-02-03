import java.util.Scanner;

public class Rectangle {
    private double length, width;
    
    Rectangle(Scanner sc) {
        System.out.println("Enter length: ");
        length = sc.nextDouble();
        System.out.println("Enter width: ");
        width = sc.nextDouble();
    }
    
    double getArea() {
        return length * width;
    }
    
    double getPerimeter() {
        return 2 * (length + width);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle(sc);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}