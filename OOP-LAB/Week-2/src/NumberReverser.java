import java.util.Scanner;

public class NumberReverser {
    private int number;
    
    NumberReverser(Scanner sc) {
        System.out.println("Enter a number: ");
        number = sc.nextInt();
    }
    
    int reverseNumber() {
        int reversed = 0;
        int temp = Math.abs(number);
        
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        
        return number < 0 ? -reversed : reversed;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberReverser reverser = new NumberReverser(sc);
        System.out.println("Reversed number: " + reverser.reverseNumber());
    }
}