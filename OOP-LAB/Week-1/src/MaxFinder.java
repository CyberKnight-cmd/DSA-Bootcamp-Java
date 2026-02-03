import java.util.Scanner;

public class MaxFinder {
    private int num1, num2, num3;
    
    MaxFinder(Scanner sc) {
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        num3 = sc.nextInt();
    }
    
    int findMaximum() {
        return Math.max(Math.max(num1, num2), num3);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxFinder finder = new MaxFinder(sc);
        System.out.println("Maximum: " + finder.findMaximum());
    }
}