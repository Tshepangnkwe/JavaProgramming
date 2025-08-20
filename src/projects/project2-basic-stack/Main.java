/**
 * Main class for Stack Implementation Demo
 * This demonstrates:
 * - Program entry point
 * - Object creation and usage
 * - Stack data structure in action
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Basic Stack Implementation Demo ===");
        System.out.println("This demo shows how a stack data structure works");
        System.out.println("using array-based implementation.");
        System.out.println();
        
        // Option 1: Run automatic demonstration
        System.out.println("Running automatic demonstration first...");
        Stack demoStack = new Stack(5);
        demoStack.demonstrateOperations();
        
        // Option 2: Interactive demo
        System.out.println("\nNow starting interactive demo...");
        StackDemo demo = new StackDemo();
        demo.run();
    }
}
