import java.util.Scanner;

public class TemperatureConverter {
    private double temperature;
    
    TemperatureConverter(Scanner sc) {
        System.out.println("Enter temperature: ");
        temperature = sc.nextDouble();
    }
    
    double celsiusToFahrenheit() {
        return (temperature * 9/5) + 32;
    }
    
    double fahrenheitToCelsius() {
        return (temperature - 32) * 5/9;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
        int choice = sc.nextInt();
        
        TemperatureConverter temp = new TemperatureConverter(sc);
        
        if (choice == 1) {
            System.out.println("Fahrenheit: " + temp.celsiusToFahrenheit());
        } else {
            System.out.println("Celsius: " + temp.fahrenheitToCelsius());
        }
    }
}