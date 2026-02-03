import java.util.Scanner;

public class PrimeRangeFinder {
    private int start, end;
    
    PrimeRangeFinder(Scanner sc) {
        System.out.println("Enter start of interval: ");
        start = sc.nextInt();
        System.out.println("Enter end of interval: ");
        end = sc.nextInt();
    }
    
    boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    void displayPrimes() {
        System.out.print("Prime numbers between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeRangeFinder finder = new PrimeRangeFinder(sc);
        finder.displayPrimes();
    }
}