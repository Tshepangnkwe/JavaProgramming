/**
 * HelloWorld - Your first Java program!
 * This demonstrates:
 * - Basic program structure
 * - Main method
 * - Print statements
 */
public class HelloWorld {
    public static void main(String[] args) {
        // This is a single-line comment
        
        /*
         * This is a multi-line comment
         * Great for longer explanations
         */
        
        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");
        
        // Print without a new line
        System.out.print("Hello, ");
        System.out.print("Java!");
        System.out.println(); // Add a new line
        
        // Print with formatting
        String name = "Student";
        int age = 20;
        System.out.printf("Hello %s, you are %d years old!\n", name, age);
        
        // Print different types of data
        System.out.println("=== Different Data Types ===");
        System.out.println("Integer: " + 42);
        System.out.println("Double: " + 3.14159);
        System.out.println("Boolean: " + true);
        System.out.println("Character: " + 'A');
        System.out.println("String: " + "Java Programming");
    }
}
