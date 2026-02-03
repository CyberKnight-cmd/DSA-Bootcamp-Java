public class PatternPrinter2 {
    
    void printPattern() {
        for (int i = 1; i <= 4; i++) {
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // Print increasing numbers (excluding the center)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        PatternPrinter2 printer = new PatternPrinter2();
        printer.printPattern();
    }
}