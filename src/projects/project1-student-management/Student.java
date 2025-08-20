/**
 * Student class represents a student with basic information
 * This demonstrates:
 * - Class creation
 * - Instance variables
 * - Constructor usage
 * - Method implementation
 * - Encapsulation basics
 */
public class Student {
    // Instance variables (private for encapsulation)
    private String name;
    private int id;
    private int age;
    private double[] grades;
    private int gradeCount;
    
    // Constructor to initialize a Student object
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grades = new double[5]; // Maximum 5 grades
        this.gradeCount = 0;
    }
    
    // Getter methods (to access private variables)
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public int getAge() {
        return age;
    }
    
    public double[] getGrades() {
        return grades;
    }
    
    public int getGradeCount() {
        return gradeCount;
    }
    
    // Method to add a grade
    public boolean addGrade(double grade) {
        if (gradeCount < grades.length && grade >= 0 && grade <= 100) {
            grades[gradeCount] = grade;
            gradeCount++;
            return true;
        }
        return false;
    }
    
    // Method to calculate average grade
    public double calculateAverage() {
        if (gradeCount == 0) {
            return 0.0;
        }
        
        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return sum / gradeCount;
    }
    
    // Method to get letter grade based on average
    public char getLetterGrade() {
        double average = calculateAverage();
        
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Grades: ");
        
        if (gradeCount == 0) {
            System.out.println("No grades recorded");
        } else {
            for (int i = 0; i < gradeCount; i++) {
                System.out.print(grades[i]);
                if (i < gradeCount - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.printf("Average: %.2f\n", calculateAverage());
            System.out.println("Letter Grade: " + getLetterGrade());
        }
        System.out.println("==========================");
    }
    
    // Method to check if student is passing (average >= 60)
    public boolean isPassing() {
        return calculateAverage() >= 60.0;
    }
    
    // Override toString method for easy printing
    @Override
    public String toString() {
        return String.format("Student[ID=%d, Name=%s, Age=%d, Average=%.2f]", 
                           id, name, age, calculateAverage());
    }
}
