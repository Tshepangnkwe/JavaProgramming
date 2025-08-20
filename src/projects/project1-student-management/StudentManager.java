import java.util.Scanner;

/**
 * StudentManager class handles multiple students
 * This demonstrates:
 * - Array of objects
 * - Methods for data management
 * - User input handling
 * - Control flow and loops
 */
public class StudentManager {
    private Student[] students;
    private int studentCount;
    private Scanner scanner;
    
    // Constructor
    public StudentManager(int maxStudents) {
        this.students = new Student[maxStudents];
        this.studentCount = 0;
        this.scanner = new Scanner(System.in);
    }
    
    // Method to add a new student
    public boolean addStudent() {
        if (studentCount >= students.length) {
            System.out.println("Cannot add more students. Maximum capacity reached.");
            return false;
        }
        
        System.out.println("\n=== Add New Student ===");
        
        // Get student information from user
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Create new student
        Student newStudent = new Student(name, id, age);
        students[studentCount] = newStudent;
        studentCount++;
        
        System.out.println("Student added successfully!");
        return true;
    }
    
    // Method to add grades to a student
    public void addGradesToStudent() {
        if (studentCount == 0) {
            System.out.println("No students available. Add students first.");
            return;
        }
        
        System.out.println("\n=== Add Grades ===");
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        
        System.out.print("Enter grade (0-100): ");
        double grade = scanner.nextDouble();
        
        if (student.addGrade(grade)) {
            System.out.println("Grade added successfully!");
        } else {
            System.out.println("Failed to add grade. Check if grade is valid or student has maximum grades.");
        }
    }
    
    // Method to find student by ID
    public Student findStudentById(int id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }
    
    // Method to display all students
    public void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }
        
        System.out.println("\n=== All Students ===");
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
            System.out.println();
        }
    }
    
    // Method to display student by ID
    public void displayStudentById() {
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }
        
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        
        Student student = findStudentById(id);
        if (student != null) {
            student.displayInfo();
        } else {
            System.out.println("Student not found!");
        }
    }
    
    // Method to calculate class statistics
    public void displayClassStatistics() {
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }
        
        double totalAverage = 0;
        int passingStudents = 0;
        double highestAverage = 0;
        double lowestAverage = 100;
        Student topStudent = null;
        
        System.out.println("\n=== Class Statistics ===");
        
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            double average = student.calculateAverage();
            
            if (student.getGradeCount() > 0) {
                totalAverage += average;
                
                if (student.isPassing()) {
                    passingStudents++;
                }
                
                if (average > highestAverage) {
                    highestAverage = average;
                    topStudent = student;
                }
                
                if (average < lowestAverage) {
                    lowestAverage = average;
                }
            }
        }
        
        System.out.println("Total Students: " + studentCount);
        System.out.println("Passing Students: " + passingStudents);
        System.out.printf("Class Average: %.2f\n", totalAverage / studentCount);
        System.out.printf("Highest Average: %.2f\n", highestAverage);
        System.out.printf("Lowest Average: %.2f\n", lowestAverage);
        
        if (topStudent != null) {
            System.out.println("Top Student: " + topStudent.getName());
        }
        
        System.out.println("========================");
    }
    
    // Method to display menu and handle user choice
    public void displayMenu() {
        System.out.println("\n=== Student Management System ===");
        System.out.println("1. Add Student");
        System.out.println("2. Add Grades to Student");
        System.out.println("3. Display All Students");
        System.out.println("4. Display Student by ID");
        System.out.println("5. Display Class Statistics");
        System.out.println("6. Exit");
        System.out.print("Choose an option (1-6): ");
    }
    
    // Method to run the student management system
    public void run() {
        System.out.println("Welcome to Student Management System!");
        
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addGradesToStudent();
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    displayStudentById();
                    break;
                case 5:
                    displayClassStatistics();
                    break;
                case 6:
                    System.out.println("Thank you for using Student Management System!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    
    // Method to get current student count
    public int getStudentCount() {
        return studentCount;
    }
}
