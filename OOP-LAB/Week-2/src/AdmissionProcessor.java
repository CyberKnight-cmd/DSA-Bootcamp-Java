import java.util.Scanner;

public class AdmissionProcessor {
    private int students;
    private int[][] marks;
    
    AdmissionProcessor(Scanner sc) {
        System.out.println("Enter number of students: ");
        students = sc.nextInt();
        marks = new int[students][3];
        
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Mathematics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Physics: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][2] = sc.nextInt();
        }
    }
    
    boolean isEligible(int math, int physics, int chemistry) {
        int total = math + physics + chemistry;
        return (math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) ||
               (math + physics >= 150);
    }
    
    void processApplications() {
        System.out.println("\nEligible Candidates:");
        for (int i = 0; i < students; i++) {
            if (isEligible(marks[i][0], marks[i][1], marks[i][2])) {
                System.out.println("Student " + (i + 1) + " - Eligible");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdmissionProcessor processor = new AdmissionProcessor(sc);
        processor.processApplications();
    }
}