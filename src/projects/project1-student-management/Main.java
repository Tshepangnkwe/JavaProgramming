/**
 * Main class for Student Management System
 * This demonstrates:
 * - Program entry point
 * - Object creation and usage
 * - Basic program structure
 */
public class Main {
    public static void main(String[] args) {
        // Create a student manager that can handle up to 10 students
        StudentManager manager = new StudentManager(10);
        
        // Add some sample data for demonstration
        System.out.println("Initializing with sample data...");
        
        // Sample students
        StudentManager sampleManager = new StudentManager(10);
        
        // You can uncomment this section to add sample data automatically
        /*
        // Create sample students
        Student student1 = new Student("Alice Johnson", 1001, 20);
        student1.addGrade(85.5);
        student1.addGrade(92.0);
        student1.addGrade(78.5);
        
        Student student2 = new Student("Bob Smith", 1002, 19);
        student2.addGrade(76.0);
        student2.addGrade(88.5);
        student2.addGrade(82.0);
        
        Student student3 = new Student("Carol Davis", 1003, 21);
        student3.addGrade(95.0);
        student3.addGrade(97.5);
        student3.addGrade(93.0);
        
        // Display sample data
        System.out.println("\n=== Sample Students ===");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        */
        
        // Start the interactive student management system
        System.out.println("\nStarting Student Management System...");
        manager.run();
    }
}
