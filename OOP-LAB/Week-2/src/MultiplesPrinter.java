import java.util.Scanner;

public class MultiplesPrinter {
    private int start, end;
    
    MultiplesPrinter(Scanner sc) {
        System.out.println("Enter start of interval: ");
        start = sc.nextInt();
        System.out.println("Enter end of interval: ");
        end = sc.nextInt();
    }
    
    void printMultiplesOf10() {
        System.out.print("Multiples of 10 between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiplesPrinter printer = new MultiplesPrinter(sc);
        printer.printMultiplesOf10();
    }
}