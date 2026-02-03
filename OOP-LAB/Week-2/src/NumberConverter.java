import java.util.Scanner;

public class NumberConverter {
    private String input;
    private int choice;
    
    NumberConverter(Scanner sc) {
        System.out.println("Choose conversion:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        choice = sc.nextInt();
        System.out.println("Enter number: ");
        input = sc.next();
    }
    
    void performConversion() {
        if (choice == 1) {
            int decimal = Integer.parseInt(input, 2);
            System.out.println("Decimal: " + decimal);
        } else if (choice == 2) {
            int decimal = Integer.parseInt(input);
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary: " + binary);
        } else {
            System.out.println("Invalid choice");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberConverter converter = new NumberConverter(sc);
        converter.performConversion();
    }
}