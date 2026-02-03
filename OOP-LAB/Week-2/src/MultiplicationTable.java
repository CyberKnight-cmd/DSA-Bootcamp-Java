import java.util.Scanner;

public class MultiplicationTable {
    private int number;
    
    MultiplicationTable(Scanner sc) {
        System.out.println("Enter a number: ");
        number = sc.nextInt();
    }
    
    void generateTable() {
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiplicationTable table = new MultiplicationTable(sc);
        table.generateTable();
    }
}