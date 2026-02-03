# Week-1 OOP Lab Solutions

This repository contains Object-Oriented Programming solutions for all Week-1 assignments. Each solution follows OOP principles with proper class structure, encapsulation, and methods.

## Question-Solution Mapping

| Question | File Path | Description |
|----------|-----------|-------------|
| 1. Print your name | [src/Person.java](src/Person.java) | Uses Person class with constructor and getter method |
| 2. Add two numbers | [src/Calculator.java](src/Calculator.java) | Calculator class with add method |
| 3-4. Temperature conversion | [src/TemperatureConverter.java](src/TemperatureConverter.java) | Handles both Celsius↔Fahrenheit conversions |
| 5. Rectangle area/perimeter | [src/Rectangle.java](src/Rectangle.java) | Rectangle class with area and perimeter calculations |
| 6. Circle area/perimeter | [src/Circle.java](src/Circle.java) | Circle class with PI constant and calculation methods |
| 7-8. Number properties | [src/NumberChecker.java](src/NumberChecker.java) | Checks odd/even and positive/negative |
| 9. Maximum of three numbers | [src/MaxFinder.java](src/MaxFinder.java) | Finds maximum using Math.max() |
| 10. Swap two numbers | [src/NumberSwapper.java](src/NumberSwapper.java) | Swaps numbers with before/after display |
| 11. Miles to kilometers | [src/DistanceConverter.java](src/DistanceConverter.java) | Distance conversion with conversion factor |
| 12. Leap year checker | [src/LeapYearChecker.java](src/LeapYearChecker.java) | Leap year logic implementation |
| 13. Grading system | [src/GradeCalculator.java](src/GradeCalculator.java) | Grade calculation based on percentage |
| 14. Divisibility by 5 | [src/DivisibilityChecker.java](src/DivisibilityChecker.java) | Checks divisibility using modulo operator |

## OOP Concepts Used

### 1. **Encapsulation**
- All classes use private attributes to hide data
- Public methods provide controlled access to data

### 2. **Constructor**
- Each class has a parameterized constructor that takes Scanner input
- Initializes object state during creation

### 3. **Methods**
- Business logic separated into specific methods
- Clear method names indicating functionality

### 4. **Class Structure**
```java
public class ClassName {
    private dataType attribute;
    
    ClassName(Scanner sc) {
        // Initialize attributes
    }
    
    returnType methodName() {
        // Business logic
        return result;
    }
    
    public static void main(String[] args) {
        // Object creation and method calls
    }
}
```

## Solution Explanations

### Person.java (Q1)
- **Concept**: Basic class with string attribute
- **Logic**: Constructor takes name input, getter returns name
- **OOP**: Encapsulation with private name field

### Calculator.java (Q2)
- **Concept**: Mathematical operations in class
- **Logic**: Stores two numbers, add() method returns sum
- **OOP**: Data hiding with private number fields

### TemperatureConverter.java (Q3-4)
- **Concept**: Single class handling multiple conversions
- **Logic**: Uses standard temperature conversion formulas
- **OOP**: Method overloading concept (different conversion methods)

### Rectangle.java (Q5)
- **Concept**: Geometric calculations
- **Logic**: Area = length × width, Perimeter = 2(length + width)
- **OOP**: Related data (length, width) grouped in single class

### Circle.java (Q6)
- **Concept**: Constants and mathematical operations
- **Logic**: Uses PI constant, Area = πr², Perimeter = 2πr
- **OOP**: Constant field (final PI) demonstrates immutability

### NumberChecker.java (Q7-8)
- **Concept**: Conditional logic in methods
- **Logic**: Modulo for odd/even, comparison operators for positive/negative
- **OOP**: Single responsibility - number checking operations

### MaxFinder.java (Q9)
- **Concept**: Comparison operations
- **Logic**: Nested Math.max() calls for three-way comparison
- **OOP**: Encapsulates comparison logic in dedicated method

### NumberSwapper.java (Q10)
- **Concept**: State modification and display
- **Logic**: Temporary variable for swapping
- **OOP**: Methods for different responsibilities (display, swap)

### DistanceConverter.java (Q11)
- **Concept**: Unit conversion
- **Logic**: Multiplication by conversion factor (1.60934)
- **OOP**: Conversion logic encapsulated in method

### LeapYearChecker.java (Q12)
- **Concept**: Complex conditional logic
- **Logic**: Leap year rules - divisible by 4, not by 100, or by 400
- **OOP**: Boolean return type for clear true/false result

### GradeCalculator.java (Q13)
- **Concept**: Multi-condition branching
- **Logic**: If-else ladder for grade ranges
- **OOP**: Grade calculation logic separated from input/output

### DivisibilityChecker.java (Q14)
- **Concept**: Modulo operation
- **Logic**: number % 5 == 0 for divisibility check
- **OOP**: Boolean method for clear divisibility result

## How to Run
1. Navigate to `src/` directory
2. Compile: `javac ClassName.java`
3. Run: `java ClassName`
4. Follow input prompts

## Key OOP Benefits Demonstrated
- **Code Reusability**: Classes can be instantiated multiple times
- **Data Security**: Private fields prevent direct access
- **Modularity**: Each class handles specific functionality
- **Maintainability**: Clear separation of concerns
- **Readability**: Descriptive class and method names