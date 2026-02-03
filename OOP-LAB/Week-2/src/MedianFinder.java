import java.util.Arrays;
import java.util.Scanner;

public class MedianFinder {
    private int[] numbers;
    private int count;
    
    MedianFinder(Scanner sc) {
        System.out.println("Enter count of numbers: ");
        count = sc.nextInt();
        numbers = new int[count];
        
        System.out.println("Enter numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
    }
    
    double findMedian() {
        Arrays.sort(numbers);
        
        if (count % 2 == 0) {
            return (numbers[count / 2 - 1] + numbers[count / 2]) / 2.0;
        } else {
            return numbers[count / 2];
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedianFinder finder = new MedianFinder(sc);
        System.out.println("Median: " + finder.findMedian());
    }
}