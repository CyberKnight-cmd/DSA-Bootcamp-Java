public class PatternPrinter3 {
    
    void printPattern() {
        for (int i = 1; i <= 4; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers
            if (i == 4) {
                System.out.println(i);
            } else {
                System.out.println(i + " " + i);
            }
        }
    }
    
    public static void main(String[] args) {
        PatternPrinter3 printer = new PatternPrinter3();
        printer.printPattern();
    }
}