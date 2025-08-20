# Project 1: Student Management System

## Overview
A console-based student management system that demonstrates fundamental Java concepts including classes, objects, arrays, methods, and user interaction.

## Features
- **Add Students**: Create new student records with name, ID, and age
- **Grade Management**: Add grades to students (up to 5 grades per student)
- **Student Search**: Find students by ID
- **Grade Calculations**: Automatic average calculation and letter grade assignment
- **Class Statistics**: View overall class performance metrics
- **Data Display**: View individual student details or all students

## Key Learning Concepts

### 1. Object-Oriented Programming
- **Classes**: `Student` and `StudentManager` classes
- **Objects**: Creating and managing multiple student objects
- **Encapsulation**: Private variables with public getter methods
- **Constructors**: Proper object initialization

### 2. Data Structures
- **Arrays**: Using arrays to store grades and students
- **Array of Objects**: Managing multiple student objects in an array

### 3. Methods and Functions
- **Instance Methods**: Methods that operate on object data
- **Parameter Passing**: Methods that accept and return values
- **Method Overloading**: Different ways to call methods

### 4. Control Flow
- **Loops**: For loops for iterating through arrays
- **Conditionals**: If-else statements for validation and logic
- **Switch Statements**: Menu-driven program structure

## How to Run

1. **Navigate to the project directory:**
   ```bash
   cd src/projects/project1-student-management
   ```

2. **Compile all Java files:**
   ```bash
   javac *.java
   ```

3. **Run the main program:**
   ```bash
   java Main
   ```

## Usage Example

```
=== Student Management System ===
1. Add Student
2. Add Grades to Student
3. Display All Students
4. Display Student by ID
5. Display Class Statistics
6. Exit
Choose an option (1-6): 1

=== Add New Student ===
Enter student name: Alice Johnson
Enter student ID: 1001
Enter student age: 20
Student added successfully!
```

## Code Structure

### Student.java
- **Purpose**: Represents a single student with their information
- **Key Methods**:
  - `addGrade(double grade)`: Add a grade to the student
  - `calculateAverage()`: Calculate average of all grades
  - `getLetterGrade()`: Convert average to letter grade
  - `displayInfo()`: Show complete student information

### StudentManager.java
- **Purpose**: Manages multiple students and provides system functionality
- **Key Methods**:
  - `addStudent()`: Create and add new student
  - `findStudentById(int id)`: Search for student by ID
  - `displayClassStatistics()`: Calculate and show class metrics
  - `run()`: Main program loop with menu system

### Main.java
- **Purpose**: Entry point for the application
- **Functionality**: Creates StudentManager and starts the program

## Learning Exercises

1. **Modify the Student class** to include additional fields like email or phone number
2. **Add validation** to ensure grades are between 0-100
3. **Implement sorting** to display students by name or average grade
4. **Add file I/O** to save and load student data
5. **Create different grade scales** (e.g., A+ through F)

## Common Programming Patterns Used

1. **Constructor Pattern**: Proper object initialization
2. **Getter/Setter Pattern**: Controlled access to private data
3. **Array Management**: Dynamic array usage with counters
4. **Menu-Driven Programming**: User interface design
5. **Input Validation**: Checking user input before processing

## Troubleshooting

**Issue**: "Student not found" message
- **Solution**: Make sure you're entering the correct student ID

**Issue**: "Cannot add more students"
- **Solution**: The system is limited to 10 students by default. Modify the constructor parameter in Main.java

**Issue**: "Failed to add grade"
- **Solution**: Check if the grade is between 0-100 and the student doesn't already have 5 grades

## Next Steps

After completing this project, you should understand:
- How to design and implement classes
- How to work with arrays and objects
- How to create interactive console programs
- Basic data validation and error handling

Try implementing the suggested exercises to deepen your understanding!
