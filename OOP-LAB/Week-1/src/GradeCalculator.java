import java.util.Scanner;

public class GradeCalculator {
    private double percentage;
    
    GradeCalculator(Scanner sc) {
        System.out.println("Enter percentage: ");
        percentage = sc.nextDouble();
    }
    
    char calculateGrade() {
        if (percentage >= 90) return 'A';
        else if (percentage >= 80) return 'B';
        else if (percentage >= 70) return 'C';
        else if (percentage >= 60) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'F';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeCalculator calculator = new GradeCalculator(sc);
        System.out.println("Grade: " + calculator.calculateGrade());
    }
}