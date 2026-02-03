import java.util.Scanner;

public class DigitCounter {
    private int number;
    
    DigitCounter(Scanner sc) {
        System.out.println("Enter an integer: ");
        number = sc.nextInt();
    }
    
    int countDigits() {
        if (number == 0) return 1;
        
        int count = 0;
        int temp = Math.abs(number);
        
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DigitCounter counter = new DigitCounter(sc);
        System.out.println("Number of digits: " + counter.countDigits());
    }
}