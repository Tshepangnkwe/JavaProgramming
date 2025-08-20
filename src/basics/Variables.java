/**
 * Variables - Learn about different data types and variables
 * This demonstrates:
 * - Variable declaration
 * - Different data types
 * - Variable initialization
 * - Constants
 */
public class Variables {
    public static void main(String[] args) {
        System.out.println("=== Java Variables and Data Types ===");
        
        // Integer types
        byte smallNumber = 100;          // -128 to 127
        short mediumNumber = 1000;       // -32,768 to 32,767
        int number = 42;                 // Most commonly used integer type
        long bigNumber = 1000000L;       // Note the 'L' suffix
        
        // Floating-point types
        float decimal = 3.14f;           // Note the 'f' suffix
        double preciseDecimal = 3.14159; // More precise than float
        
        // Character and boolean
        char letter = 'A';
        boolean isJavaFun = true;
        
        // String (reference type, not primitive)
        String message = "Hello, Java!";
        
        // Constants (final keyword)
        final double PI = 3.14159;
        final int MAX_STUDENTS = 30;
        
        // Display all variables
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + number);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + decimal);
        System.out.println("double: " + preciseDecimal);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + message);
        
        System.out.println("\n=== Constants ===");
        System.out.println("PI: " + PI);
        System.out.println("MAX_STUDENTS: " + MAX_STUDENTS);
        
        // Variable operations
        System.out.println("\n=== Variable Operations ===");
        int a = 10;
        int b = 5;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)
        
        // String operations
        System.out.println("\n=== String Operations ===");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName; // String concatenation
        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + fullName);
        System.out.println("Length of full name: " + fullName.length());
        System.out.println("Full name in uppercase: " + fullName.toUpperCase());
        
        // Type conversion
        System.out.println("\n=== Type Conversion ===");
        int intValue = 42;
        double doubleValue = intValue; // Automatic conversion (widening)
        System.out.println("int to double: " + intValue + " -> " + doubleValue);
        
        double anotherDouble = 3.7;
        int convertedInt = (int) anotherDouble; // Manual conversion (narrowing)
        System.out.println("double to int: " + anotherDouble + " -> " + convertedInt);
        
        // String to number conversion
        String numberString = "123";
        int parsedNumber = Integer.parseInt(numberString);
        System.out.println("String to int: \"" + numberString + "\" -> " + parsedNumber);
    }
}
