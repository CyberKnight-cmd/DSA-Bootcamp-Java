import java.util.Scanner;

public class NumberSwapper {
    private int num1, num2;
    
    NumberSwapper(Scanner sc) {
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
    }
    
    void displayBefore() {
        System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);
    }
    
    void swap() {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    
    void displayAfter() {
        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberSwapper swapper = new NumberSwapper(sc);
        swapper.displayBefore();
        swapper.swap();
        swapper.displayAfter();
    }
}