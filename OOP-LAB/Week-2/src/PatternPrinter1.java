public class PatternPrinter1 {
    
    void printPattern() {
        int num = 1;
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        PatternPrinter1 printer = new PatternPrinter1();
        printer.printPattern();
    }
}