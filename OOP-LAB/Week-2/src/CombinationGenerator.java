public class CombinationGenerator {
    
    void generateCombinations() {
        System.out.println("All combinations of 1, 2, 3:");
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        CombinationGenerator generator = new CombinationGenerator();
        generator.generateCombinations();
    }
}