# Java Basics Documentation

This document covers fundamental Java concepts you need to understand before diving into Data Structures and Algorithms.

## Table of Contents
1. [Java Program Structure](#java-program-structure)
2. [Data Types and Variables](#data-types-and-variables)
3. [Operators](#operators)
4. [Control Flow Statements](#control-flow-statements)
5. [Input and Output](#input-and-output)
6. [Common Mistakes and Tips](#common-mistakes-and-tips)

## Java Program Structure

### Basic Program Template
```java
public class ClassName {
    public static void main(String[] args) {
        // Your code goes here
    }
}
```

### Key Points:
- **Class Name**: Must match the filename (ClassName.java)
- **main method**: Entry point of the program
- **public**: Access modifier (visible everywhere)
- **static**: Belongs to the class, not an instance
- **void**: Returns nothing
- **String[] args**: Command line arguments

### Comments
```java
// Single-line comment

/*
 * Multi-line comment
 * Can span multiple lines
 */

/**
 * Javadoc comment
 * Used for documentation
 */
```

## Data Types and Variables

### Primitive Data Types

| Type | Size | Range | Example |
|------|------|-------|---------|
| byte | 8 bits | -128 to 127 | `byte age = 25;` |
| short | 16 bits | -32,768 to 32,767 | `short year = 2024;` |
| int | 32 bits | -2³¹ to 2³¹-1 | `int count = 100;` |
| long | 64 bits | -2⁶³ to 2⁶³-1 | `long distance = 1000000L;` |
| float | 32 bits | ±3.4E38 | `float price = 19.99f;` |
| double | 64 bits | ±1.7E308 | `double pi = 3.14159;` |
| char | 16 bits | Unicode characters | `char grade = 'A';` |
| boolean | 1 bit | true or false | `boolean isActive = true;` |

### Variable Declaration and Initialization
```java
// Declaration
int number;

// Initialization
number = 42;

// Declaration and initialization
int anotherNumber = 100;

// Multiple variables of same type
int a = 1, b = 2, c = 3;

// Constants
final double PI = 3.14159;
final int MAX_SIZE = 100;
```

### Naming Conventions
- **Variables**: camelCase (`firstName`, `totalAmount`)
- **Constants**: UPPER_CASE (`MAX_VALUE`, `DEFAULT_SIZE`)
- **Classes**: PascalCase (`Person`, `BankAccount`)
- **Methods**: camelCase (`calculateArea`, `getName`)

## Operators

### Arithmetic Operators
```java
int a = 10, b = 3;

int sum = a + b;        // Addition: 13
int diff = a - b;       // Subtraction: 7
int product = a * b;    // Multiplication: 30
int quotient = a / b;   // Division: 3 (integer division)
int remainder = a % b;  // Modulus: 1

// Increment and Decrement
a++;  // Post-increment: use a, then add 1
++a;  // Pre-increment: add 1, then use a
a--;  // Post-decrement: use a, then subtract 1
--a;  // Pre-decrement: subtract 1, then use a
```

### Assignment Operators
```java
int x = 5;
x += 3;  // x = x + 3;  (x becomes 8)
x -= 2;  // x = x - 2;  (x becomes 6)
x *= 4;  // x = x * 4;  (x becomes 24)
x /= 3;  // x = x / 3;  (x becomes 8)
x %= 5;  // x = x % 5;  (x becomes 3)
```

### Comparison Operators
```java
int a = 5, b = 10;

boolean result1 = (a == b);  // Equal to: false
boolean result2 = (a != b);  // Not equal to: true
boolean result3 = (a < b);   // Less than: true
boolean result4 = (a > b);   // Greater than: false
boolean result5 = (a <= b);  // Less than or equal: true
boolean result6 = (a >= b);  // Greater than or equal: false
```

### Logical Operators
```java
boolean p = true, q = false;

boolean and = p && q;  // Logical AND: false
boolean or = p || q;   // Logical OR: true
boolean not = !p;      // Logical NOT: false

// Short-circuit evaluation
if (p && someMethod()) {  // someMethod() only called if p is true
    // code
}
```

## Control Flow Statements

### if-else Statements
```java
int score = 85;

if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else if (score >= 60) {
    System.out.println("Grade: D");
} else {
    System.out.println("Grade: F");
}

// Ternary operator (shorthand if-else)
String result = (score >= 60) ? "Pass" : "Fail";
```

### switch-case Statements
```java
int dayOfWeek = 3;

switch (dayOfWeek) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
    case 7:
        System.out.println("Weekend");
        break;
    default:
        System.out.println("Invalid day");
}
```

### for Loops
```java
// Basic for loop
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

// For loop with different step
for (int i = 0; i < 20; i += 2) {
    System.out.println(i);  // Prints even numbers
}

// Countdown
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}

// Enhanced for loop (for arrays)
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}
```

### while Loops
```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}

// Infinite loop prevention
int attempts = 0;
boolean found = false;
while (!found && attempts < 10) {
    // Search logic
    attempts++;
}
```

### do-while Loops
```java
int input;
do {
    System.out.println("Enter a number (0 to quit): ");
    input = scanner.nextInt();
    System.out.println("You entered: " + input);
} while (input != 0);
```

### break and continue
```java
// break - exits the loop completely
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;  // Loop ends here
    }
    System.out.println(i);  // Prints 1, 2, 3, 4
}

// continue - skips current iteration
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;  // Skip even numbers
    }
    System.out.println(i);  // Prints 1, 3, 5, 7, 9
}
```

## Input and Output

### Output (System.out)
```java
// Basic printing
System.out.println("Hello World");  // Prints with newline
System.out.print("Hello ");         // Prints without newline
System.out.print("World");

// Formatted output
int age = 25;
String name = "John";
System.out.printf("Name: %s, Age: %d\n", name, age);

// Format specifiers
System.out.printf("Integer: %d\n", 42);
System.out.printf("Float: %.2f\n", 3.14159);  // 2 decimal places
System.out.printf("String: %s\n", "Hello");
System.out.printf("Character: %c\n", 'A');
```

### Input (Scanner)
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

// Reading different types
System.out.print("Enter your name: ");
String name = scanner.nextLine();

System.out.print("Enter your age: ");
int age = scanner.nextInt();

System.out.print("Enter your GPA: ");
double gpa = scanner.nextDouble();

System.out.print("Enter first character of your name: ");
char firstChar = scanner.next().charAt(0);

// Always close the scanner
scanner.close();
```

## String Manipulation

### String Basics
```java
// String creation
String str1 = "Hello";
String str2 = new String("World");

// String concatenation
String greeting = str1 + " " + str2;
String formatted = String.format("%s %s", str1, str2);

// String methods
int length = str1.length();                    // 5
char firstChar = str1.charAt(0);               // 'H'
String upper = str1.toUpperCase();             // "HELLO"
String lower = str1.toLowerCase();             // "hello"
boolean contains = str1.contains("ell");       // true
boolean startsWith = str1.startsWith("He");    // true
boolean endsWith = str1.endsWith("lo");        // true
String substring = str1.substring(1, 4);       // "ell"
String replaced = str1.replace("l", "x");      // "Hexxo"
```

### String Comparison
```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");

// Wrong way (compares references)
if (s1 == s2) { /* Don't do this */ }

// Right way (compares content)
if (s1.equals(s2)) {        // true
    System.out.println("Strings are equal");
}

// Case-insensitive comparison
if (s1.equalsIgnoreCase("HELLO")) {  // true
    System.out.println("Strings are equal (ignoring case)");
}
```

## Arrays

### Array Declaration and Initialization
```java
// Declaration
int[] numbers;
String[] names;

// Initialization
numbers = new int[5];           // Array of 5 integers (all 0)
names = new String[3];          // Array of 3 strings (all null)

// Declaration and initialization
int[] scores = {85, 92, 78, 96, 88};
String[] colors = {"red", "green", "blue"};

// Using new keyword
int[] values = new int[]{1, 2, 3, 4, 5};
```

### Array Operations
```java
int[] array = {10, 20, 30, 40, 50};

// Accessing elements
int first = array[0];           // 10
int last = array[array.length - 1];  // 50

// Modifying elements
array[2] = 35;  // Changes 30 to 35

// Array length
int size = array.length;        // 5

// Iterating through array
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}

// Enhanced for loop
for (int value : array) {
    System.out.println(value);
}
```

## Common Mistakes and Tips

### Common Mistakes
1. **Array Index Out of Bounds**
   ```java
   int[] arr = new int[5];
   arr[5] = 10;  // ERROR: Index 5 doesn't exist (0-4 only)
   ```

2. **Off-by-One Errors**
   ```java
   // Wrong
   for (int i = 1; i <= array.length; i++) { /* Error */ }
   
   // Correct
   for (int i = 0; i < array.length; i++) { /* Correct */ }
   ```

3. **Integer Division**
   ```java
   int result = 5 / 2;        // 2 (not 2.5)
   double result = 5.0 / 2;   // 2.5 (correct)
   ```

4. **String Comparison**
   ```java
   String s1 = "hello";
   String s2 = "hello";
   if (s1 == s2) { /* Wrong way */ }
   if (s1.equals(s2)) { /* Right way */ }
   ```

### Best Practices
1. **Use meaningful variable names**
   ```java
   // Bad
   int x = 25;
   
   // Good
   int studentAge = 25;
   ```

2. **Initialize variables**
   ```java
   int count = 0;  // Always initialize
   ```

3. **Use constants for fixed values**
   ```java
   final int MAX_STUDENTS = 30;
   final double TAX_RATE = 0.08;
   ```

4. **Handle edge cases**
   ```java
   public static int divide(int a, int b) {
       if (b == 0) {
           System.out.println("Cannot divide by zero");
           return 0;
       }
       return a / b;
   }
   ```

5. **Use proper indentation and spacing**
   ```java
   if (condition) {
       // Properly indented
       doSomething();
   }
   ```

## Next Steps
After mastering these basics, you'll be ready to move on to:
- Methods and Functions
- Object-Oriented Programming
- Data Structures and Algorithms

Remember: Practice is key! Write lots of small programs to reinforce these concepts.
