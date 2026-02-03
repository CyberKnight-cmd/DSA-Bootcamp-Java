import java.util.Scanner;

public class DistanceConverter {
    private double miles;
    
    DistanceConverter(Scanner sc) {
        System.out.println("Enter distance in miles: ");
        miles = sc.nextDouble();
    }
    
    double milesToKilometers() {
        return miles * 1.60934;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DistanceConverter converter = new DistanceConverter(sc);
        System.out.println("Kilometers: " + converter.milesToKilometers());
    }
}