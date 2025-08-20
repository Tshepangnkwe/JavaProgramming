# Object-Oriented Programming Concepts

This document explains the fundamental concepts of Object-Oriented Programming (OOP) in Java, which are essential for understanding data structures and algorithms.

## Table of Contents
1. [What is Object-Oriented Programming?](#what-is-object-oriented-programming)
2. [Classes and Objects](#classes-and-objects)
3. [Encapsulation](#encapsulation)
4. [Constructors](#constructors)
5. [Methods](#methods)
6. [Static vs Instance](#static-vs-instance)
7. [Object Interactions](#object-interactions)
8. [Best Practices](#best-practices)

## What is Object-Oriented Programming?

Object-Oriented Programming (OOP) is a programming paradigm that uses "objects" to design applications and computer programs. It's based on several concepts including:

- **Classes**: Blueprints for creating objects
- **Objects**: Instances of classes
- **Encapsulation**: Bundling data and methods together
- **Inheritance**: Creating new classes based on existing ones (advanced topic)
- **Polymorphism**: Using one interface for different data types (advanced topic)

### Why Use OOP?
- **Modularity**: Code is organized into separate, interchangeable components
- **Reusability**: Classes can be used multiple times
- **Maintainability**: Easier to debug and modify
- **Real-world modeling**: Objects represent real-world entities

## Classes and Objects

### What is a Class?
A class is a blueprint or template for creating objects. It defines:
- **Attributes** (variables/fields): What the object knows
- **Methods** (functions): What the object can do

### What is an Object?
An object is an instance of a class. It's a concrete entity created from the class blueprint.

### Example: Car Class
```java
public class Car {
    // Attributes (instance variables)
    private String make;
    private String model;
    private int year;
    private boolean isRunning;
    
    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }
    
    // Methods (behaviors)
    public void start() {
        isRunning = true;
        System.out.println("Car started");
    }
    
    public void stop() {
        isRunning = false;
        System.out.println("Car stopped");
    }
    
    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}
```

### Creating and Using Objects
```java
public class CarTest {
    public static void main(String[] args) {
        // Creating objects (instances of Car class)
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);
        
        // Using object methods
        car1.displayInfo();  // 2020 Toyota Camry
        car1.start();        // Car started
        
        car2.displayInfo();  // 2019 Honda Civic
        car2.start();        // Car started
    }
}
```

## Encapsulation

Encapsulation is the principle of bundling data (variables) and methods that operate on that data within a single unit (class), and restricting access to some components.

### Access Modifiers
- **private**: Only accessible within the same class
- **public**: Accessible from anywhere
- **protected**: Accessible within the same package and subclasses (advanced)
- **default**: Accessible within the same package

### Example: Bank Account with Encapsulation
```java
public class BankAccount {
    // Private variables (encapsulated)
    private String accountNumber;
    private double balance;
    private String ownerName;
    
    // Constructor
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }
    
    // Public getter methods (controlled access)
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    // Public setter methods (with validation)
    public void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.trim().isEmpty()) {
            this.ownerName = ownerName;
        }
    }
    
    // Business logic methods
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
```

### Benefits of Encapsulation
1. **Data Protection**: Private variables can't be directly modified
2. **Validation**: Setters can validate input before setting values
3. **Flexibility**: Internal implementation can change without affecting users
4. **Debugging**: Easier to track where data is modified

## Constructors

Constructors are special methods used to initialize objects when they're created.

### Constructor Rules
- Must have the same name as the class
- No return type (not even void)
- Called automatically when object is created
- Can be overloaded (multiple constructors)

### Types of Constructors

#### Default Constructor
```java
public class Student {
    private String name;
    private int age;
    
    // Default constructor (no parameters)
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }
}
```

#### Parameterized Constructor
```java
public class Student {
    private String name;
    private int age;
    
    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

#### Constructor Overloading
```java
public class Student {
    private String name;
    private int age;
    private String email;
    
    // Constructor 1: Default
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.email = "";
    }
    
    // Constructor 2: Name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "";
    }
    
    // Constructor 3: All parameters
    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
```

### Using Different Constructors
```java
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();                    // Default constructor
        Student student2 = new Student("Alice", 20);         // Name and age
        Student student3 = new Student("Bob", 22, "bob@email.com");  // All parameters
    }
}
```

## Methods

Methods define what objects can do. They represent the behavior of objects.

### Method Structure
```java
[access modifier] [static] [return type] methodName([parameters]) {
    // Method body
    return value;  // if return type is not void
}
```

### Types of Methods

#### Instance Methods
```java
public class Calculator {
    // Instance method - operates on object data
    public int add(int a, int b) {
        return a + b;
    }
    
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// Usage
Calculator calc = new Calculator();
int sum = calc.add(5, 3);
```

#### Methods with Different Return Types
```java
public class StringHelper {
    // Method returning int
    public int countVowels(String text) {
        int count = 0;
        // Implementation here
        return count;
    }
    
    // Method returning boolean
    public boolean isPalindrome(String text) {
        // Implementation here
        return true; // or false
    }
    
    // Method returning void (no return value)
    public void printReverse(String text) {
        // Implementation here
        System.out.println("Reversed text");
    }
    
    // Method returning String
    public String capitalizeWords(String text) {
        // Implementation here
        return "Capitalized Text";
    }
}
```

#### Method Overloading
Multiple methods with the same name but different parameters:
```java
public class MathUtils {
    // Method 1: Two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Method 2: Three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    // Method 3: Two doubles
    public double multiply(double a, double b) {
        return a * b;
    }
    
    // Method 4: Array of integers
    public int multiply(int[] numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}
```

## Static vs Instance

### Instance Variables and Methods
- Belong to object instances
- Each object has its own copy
- Access through object reference
- Can access other instance variables and methods

### Static Variables and Methods
- Belong to the class itself
- Shared among all instances
- Access through class name
- Cannot access instance variables directly

### Example: Counter Class
```java
public class Counter {
    // Static variable - shared by all instances
    private static int totalCount = 0;
    
    // Instance variable - unique to each object
    private int instanceCount;
    private String name;
    
    public Counter(String name) {
        this.name = name;
        this.instanceCount = 0;
        totalCount++;  // Increment shared counter
    }
    
    // Instance method
    public void increment() {
        instanceCount++;
        totalCount++;
    }
    
    // Instance method
    public int getInstanceCount() {
        return instanceCount;
    }
    
    // Static method
    public static int getTotalCount() {
        return totalCount;
    }
    
    public void displayInfo() {
        System.out.println(name + " count: " + instanceCount);
        System.out.println("Total count: " + totalCount);
    }
}
```

### Using Static vs Instance
```java
public class CounterTest {
    public static void main(String[] args) {
        // Static method - called on class
        System.out.println("Initial total: " + Counter.getTotalCount());
        
        // Create instances
        Counter counter1 = new Counter("Counter1");
        Counter counter2 = new Counter("Counter2");
        
        // Instance methods - called on objects
        counter1.increment();
        counter1.increment();
        counter2.increment();
        
        // Display results
        counter1.displayInfo();  // Counter1 count: 2, Total count: 5
        counter2.displayInfo();  // Counter2 count: 1, Total count: 5
        
        // Static method
        System.out.println("Final total: " + Counter.getTotalCount());  // 5
    }
}
```

## Object Interactions

Objects often need to work with other objects to accomplish complex tasks.

### Example: Student and Course System
```java
public class Course {
    private String courseCode;
    private String courseName;
    private int maxStudents;
    private int enrolledCount;
    
    public Course(String courseCode, String courseName, int maxStudents) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.enrolledCount = 0;
    }
    
    public boolean enrollStudent() {
        if (enrolledCount < maxStudents) {
            enrolledCount++;
            return true;
        }
        return false;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public int getAvailableSpots() {
        return maxStudents - enrolledCount;
    }
}

public class Student {
    private String studentId;
    private String name;
    private Course[] courses;
    private int courseCount;
    
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new Course[5];  // Max 5 courses
        this.courseCount = 0;
    }
    
    // Method that interacts with Course objects
    public boolean enrollInCourse(Course course) {
        if (courseCount < courses.length && course.enrollStudent()) {
            courses[courseCount] = course;
            courseCount++;
            System.out.println(name + " enrolled in " + course.getCourseName());
            return true;
        }
        return false;
    }
    
    public void displayCourses() {
        System.out.println(name + "'s courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + courses[i].getCourseName());
        }
    }
}
```

### Using Object Interactions
```java
public class UniversityTest {
    public static void main(String[] args) {
        // Create course objects
        Course mathCourse = new Course("MATH101", "Calculus I", 30);
        Course javaCourse = new Course("CS101", "Java Programming", 25);
        
        // Create student objects
        Student alice = new Student("S001", "Alice");
        Student bob = new Student("S002", "Bob");
        
        // Object interactions
        alice.enrollInCourse(mathCourse);
        alice.enrollInCourse(javaCourse);
        bob.enrollInCourse(javaCourse);
        
        // Display results
        alice.displayCourses();
        bob.displayCourses();
        
        System.out.println("Java course available spots: " + javaCourse.getAvailableSpots());
    }
}
```

## Best Practices

### 1. Naming Conventions
```java
// Classes: PascalCase
public class BankAccount { }
public class StudentManager { }

// Methods and variables: camelCase
public void calculateTotal() { }
private String firstName;
private int accountBalance;

// Constants: UPPER_CASE
private static final int MAX_ATTEMPTS = 3;
private static final double PI = 3.14159;
```

### 2. Encapsulation Guidelines
```java
public class Person {
    // Make fields private
    private String name;
    private int age;
    
    // Provide public getters/setters with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        }
    }
    
    public int getAge() {
        return age;
    }
}
```

### 3. Constructor Best Practices
```java
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        // Validate parameters
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            this.length = 1.0;
            this.width = 1.0;
        }
    }
}
```

### 4. Method Design
```java
public class Calculator {
    // Good: Single responsibility
    public double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Good: Descriptive name and validation
    public boolean isValidGrade(double grade) {
        return grade >= 0 && grade <= 100;
    }
    
    // Good: Clear return values
    public String getLetterGrade(double score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }
}
```

### 5. Code Organization
```java
public class Student {
    // 1. Instance variables (private first)
    private String name;
    private int id;
    
    // 2. Static variables
    private static int studentCount = 0;
    
    // 3. Constructors
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        studentCount++;
    }
    
    // 4. Public methods
    public String getName() {
        return name;
    }
    
    // 5. Private helper methods
    private boolean isValidId(int id) {
        return id > 0;
    }
    
    // 6. Static methods
    public static int getStudentCount() {
        return studentCount;
    }
}
```

## Common Patterns in DSA

### 1. Data Container Pattern
```java
public class Node {
    private int data;
    private Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    
    // Getters and setters
}
```

### 2. Manager/Controller Pattern
```java
public class LinkedList {
    private Node head;
    private int size;
    
    public void add(int data) {
        Node newNode = new Node(data);
        // Implementation
    }
    
    public boolean remove(int data) {
        // Implementation
        return true;
    }
}
```

### 3. Utility Class Pattern
```java
public class ArrayUtils {
    // All static methods, no instances needed
    public static int findMax(int[] array) {
        // Implementation
    }
    
    public static void sort(int[] array) {
        // Implementation
    }
}
```

Understanding these OOP concepts is crucial for implementing data structures and algorithms effectively. Objects provide a natural way to model the entities and operations in DSA problems.
