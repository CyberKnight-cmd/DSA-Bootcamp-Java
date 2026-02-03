# Week-2 OOP Lab Solutions

This repository contains Object-Oriented Programming solutions for all Week-2 assignments focusing on variables, decision control, and loop control statements. Each solution follows OOP principles with proper class structure, encapsulation, and methods.

## Question-Solution Mapping

| Question | File Path | Description |
|----------|-----------|-------------|
| 1. Buzz number checker | [src/BuzzChecker.java](src/BuzzChecker.java) | Checks if number is divisible by 7 or ends with 7 |
| 2. Factorial of 12 | [src/FactorialCalculator.java](src/FactorialCalculator.java) | Calculates factorial using loop iteration |
| 3. Fibonacci series | [src/FibonacciGenerator.java](src/FibonacciGenerator.java) | Generates Fibonacci sequence up to n terms |
| 4. Reverse a number | [src/NumberReverser.java](src/NumberReverser.java) | Reverses digits of a number handling negatives |
| 5. Admission processor | [src/AdmissionProcessor.java](src/AdmissionProcessor.java) | Processes student admissions based on marks criteria |
| 6. Quadratic equation roots | [src/QuadraticSolver.java](src/QuadraticSolver.java) | Finds real/complex roots using discriminant |
| 7. Sum of natural numbers | [src/NaturalNumberSum.java](src/NaturalNumberSum.java) | Calculates sum using mathematical formula |
| 8. Multiples of 10 | [src/MultiplesPrinter.java](src/MultiplesPrinter.java) | Prints multiples of 10 in given interval |
| 9. Multiplication table | [src/MultiplicationTable.java](src/MultiplicationTable.java) | Generates multiplication table for given number |
| 10. HCF of two numbers | [src/HCFCalculator.java](src/HCFCalculator.java) | Finds HCF using Euclidean algorithm |
| 11. LCM of two numbers | [src/LCMCalculator.java](src/LCMCalculator.java) | Calculates LCM using HCF formula |
| 12. Count digits | [src/DigitCounter.java](src/DigitCounter.java) | Counts digits in an integer |
| 13. Exponential calculation | [src/ExponentialCalculator.java](src/ExponentialCalculator.java) | Calculates base^exponent using Math.pow |
| 14. Palindrome checker | [src/PalindromeChecker.java](src/PalindromeChecker.java) | Checks if number reads same forwards/backwards |
| 15. Prime number checker | [src/PrimeChecker.java](src/PrimeChecker.java) | Optimized prime checking algorithm |
| 16. Binary-Decimal converter | [src/NumberConverter.java](src/NumberConverter.java) | Converts between binary and decimal systems |
| 17. Median finder | [src/MedianFinder.java](src/MedianFinder.java) | Finds median of array using sorting |
| 18. Euler's number | [src/EulerCalculator.java](src/EulerCalculator.java) | Calculates e using factorial series |
| 19. Combinations generator | [src/CombinationGenerator.java](src/CombinationGenerator.java) | Generates all combinations of 1,2,3 |
| 20. Multiple checker | [src/MultipleChecker.java](src/MultipleChecker.java) | Checks if m is multiple of n |
| 21. Prime range finder | [src/PrimeRangeFinder.java](src/PrimeRangeFinder.java) | Displays primes in given interval |
| 22. Armstrong number | [src/ArmstrongChecker.java](src/ArmstrongChecker.java) | Checks Armstrong number property |
| 23. Pattern 1 | [src/PatternPrinter1.java](src/PatternPrinter1.java) | Prints sequential number pattern |
| 24. Pattern 2 | [src/PatternPrinter2.java](src/PatternPrinter2.java) | Prints symmetric number pattern |
| 25. Pattern 3 | [src/PatternPrinter3.java](src/PatternPrinter3.java) | Prints spaced number pattern |

## OOP Concepts Used

### 1. **Encapsulation**
- All classes use private attributes to hide data
- Public methods provide controlled access to functionality

### 2. **Constructor Overloading**
- Parameterized constructors for input handling
- Default constructors for fixed values (like factorial of 12)

### 3. **Method Design**
- Single responsibility principle - each method has one purpose
- Clear return types and parameter lists
- Helper methods for complex calculations

### 4. **Class Structure**
```java
public class ClassName {
    private dataType attribute;
    
    ClassName(Scanner sc) {
        // Initialize with user input
    }
    
    returnType businessMethod() {
        // Core logic implementation
        return result;
    }
    
    public static void main(String[] args) {
        // Object creation and method execution
    }
}
```

## Solution Explanations

### BuzzChecker.java (Q1)
- **Concept**: Conditional checking with OR logic
- **Logic**: Number is Buzz if divisible by 7 OR ends with 7
- **OOP**: Boolean return method for clear true/false result

### FactorialCalculator.java (Q2)
- **Concept**: Loop-based calculation with fixed input
- **Logic**: Iterative multiplication from 1 to 12
- **OOP**: Default constructor for predetermined value

### FibonacciGenerator.java (Q3)
- **Concept**: Sequence generation using loops
- **Logic**: Each term = sum of previous two terms
- **OOP**: Void method for display, encapsulated generation logic

### NumberReverser.java (Q4)
- **Concept**: Digit manipulation with sign handling
- **Logic**: Extract digits using modulo, build reversed number
- **OOP**: Handles edge cases (negative numbers) within method

### AdmissionProcessor.java (Q5)
- **Concept**: Complex conditional logic with arrays
- **Logic**: Multiple criteria evaluation with OR conditions
- **OOP**: 2D array for student data, separate eligibility method

### QuadraticSolver.java (Q6)
- **Concept**: Mathematical formula implementation
- **Logic**: Discriminant-based root calculation
- **OOP**: Comprehensive solution handling (real, equal, complex roots)

### NaturalNumberSum.java (Q7)
- **Concept**: Mathematical optimization
- **Logic**: Uses formula n(n+1)/2 instead of loop
- **OOP**: Efficient calculation method

### MultiplesPrinter.java (Q8)
- **Concept**: Range-based filtering with loops
- **Logic**: Iterate through range, check divisibility by 10
- **OOP**: Void method for formatted output

### MultiplicationTable.java (Q9)
- **Concept**: Nested loop structure for table generation
- **Logic**: Fixed loop (1-10) with multiplication
- **OOP**: Clear display method with formatted output

### HCFCalculator.java (Q10)
- **Concept**: Euclidean algorithm implementation
- **Logic**: Recursive division until remainder is 0
- **OOP**: Classic algorithm encapsulated in method

### LCMCalculator.java (Q11)
- **Concept**: Mathematical relationship (LCM × HCF = product)
- **Logic**: Uses HCF method to calculate LCM
- **OOP**: Method reusability - HCF method used within LCM

### DigitCounter.java (Q12)
- **Concept**: Digit extraction using division
- **Logic**: Count divisions by 10 until number becomes 0
- **OOP**: Handles special case (zero) and negative numbers

### ExponentialCalculator.java (Q13)
- **Concept**: Built-in mathematical functions
- **Logic**: Uses Math.pow() for accurate calculation
- **OOP**: Separate attributes for base and exponent

### PalindromeChecker.java (Q14)
- **Concept**: Number reversal and comparison
- **Logic**: Reverse number and compare with original
- **OOP**: Reuses reversal logic, handles negative numbers

### PrimeChecker.java (Q15)
- **Concept**: Optimized prime algorithm
- **Logic**: Check divisibility up to √n with 6k±1 optimization
- **OOP**: Efficient algorithm implementation

### NumberConverter.java (Q16)
- **Concept**: Number system conversion
- **Logic**: Uses built-in parsing and conversion methods
- **OOP**: Choice-based method execution

### MedianFinder.java (Q17)
- **Concept**: Statistical calculation with sorting
- **Logic**: Sort array, find middle element(s)
- **OOP**: Array handling with even/odd length consideration

### EulerCalculator.java (Q18)
- **Concept**: Series calculation with factorial
- **Logic**: e = 1 + 1/1! + 1/2! + ... + 1/n!
- **OOP**: Helper factorial method, series summation

### CombinationGenerator.java (Q19)
- **Concept**: Nested loops for permutation generation
- **Logic**: Triple nested loop for all combinations
- **OOP**: Simple generation method with no input required

### MultipleChecker.java (Q20)
- **Concept**: Division validation and modulo operation
- **Logic**: Check if m % n == 0, handle division by zero
- **OOP**: Error handling within business logic

### PrimeRangeFinder.java (Q21)
- **Concept**: Range iteration with prime checking
- **Logic**: Iterate through range, apply prime check to each
- **OOP**: Reuses prime checking logic from Q15

### ArmstrongChecker.java (Q22)
- **Concept**: Digit manipulation with power calculation
- **Logic**: Sum of digits raised to power of digit count
- **OOP**: Helper method for digit counting, power calculation

### PatternPrinter1.java (Q23)
- **Concept**: Sequential number printing with row logic
- **Logic**: Print 2i-1 numbers in row i
- **OOP**: Pattern generation encapsulated in method

### PatternPrinter2.java (Q24)
- **Concept**: Symmetric pattern with bidirectional printing
- **Logic**: Print decreasing then increasing numbers
- **OOP**: Complex pattern logic in single method

### PatternPrinter3.java (Q25)
- **Concept**: Spacing and conditional printing
- **Logic**: Variable spaces with duplicate/single number printing
- **OOP**: Handles special case (row 4) within loop

## Key Programming Concepts Demonstrated

### Loop Control Statements
- **For loops**: Pattern printing, range operations, table generation
- **While loops**: Digit manipulation, algorithm implementation
- **Nested loops**: Pattern printing, combination generation

### Decision Control Statements
- **If-else**: Conditional logic, validation
- **Switch-case**: Choice-based operations
- **Ternary operator**: Concise conditional assignments

### Mathematical Operations
- **Modulo operator**: Divisibility, digit extraction
- **Mathematical functions**: Power, square root calculations
- **Algorithm implementation**: HCF, prime checking, sorting

### Array Operations
- **1D arrays**: Number storage, sorting
- **2D arrays**: Student data management
- **Array manipulation**: Sorting, median calculation

## How to Run
1. Navigate to `src/` directory
2. Compile: `javac ClassName.java`
3. Run: `java ClassName`
4. Follow input prompts for interactive programs

## Key OOP Benefits Demonstrated
- **Code Organization**: Each problem solved in dedicated class
- **Reusability**: Methods can be called multiple times
- **Maintainability**: Clear separation of input, processing, output
- **Scalability**: Easy to extend functionality
- **Readability**: Descriptive class and method names