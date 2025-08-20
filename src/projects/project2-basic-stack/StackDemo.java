import java.util.Scanner;

/**
 * StackDemo class provides interactive demonstration of stack operations
 * This demonstrates:
 * - User interaction
 * - Menu-driven programming
 * - Practical usage of stack
 * - Input validation
 */
public class StackDemo {
    private Stack stack;
    private Scanner scanner;
    
    // Constructor
    public StackDemo() {
        this.scanner = new Scanner(System.in);
    }
    
    // Method to create a new stack
    public void createStack() {
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        
        if (size <= 0) {
            System.out.println("Invalid size! Stack size must be positive.");
            return;
        }
        
        this.stack = new Stack(size);
        System.out.println("Stack of size " + size + " created successfully!");
    }
    
    // Method to push element
    public void pushElement() {
        if (stack == null) {
            System.out.println("Please create a stack first!");
            return;
        }
        
        System.out.print("Enter value to push: ");
        int value = scanner.nextInt();
        stack.push(value);
    }
    
    // Method to pop element
    public void popElement() {
        if (stack == null) {
            System.out.println("Please create a stack first!");
            return;
        }
        
        int poppedValue = stack.pop();
        if (poppedValue != -1) {
            System.out.println("Successfully popped: " + poppedValue);
        }
    }
    
    // Method to peek at top element
    public void peekElement() {
        if (stack == null) {
            System.out.println("Please create a stack first!");
            return;
        }
        
        int topElement = stack.peek();
        if (topElement != -1) {
            System.out.println("Top element: " + topElement);
        }
    }
    
    // Method to display stack
    public void displayStack() {
        if (stack == null) {
            System.out.println("Please create a stack first!");
            return;
        }
        
        stack.display();
        System.out.println("Stack size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Is full: " + stack.isFull());
    }
    
    // Method to search for element
    public void searchElement() {
        if (stack == null) {
            System.out.println("Please create a stack first!");
            return;
        }
        
        System.out.print("Enter value to search: ");
        int value = scanner.nextInt();
        
        int position = stack.search(value);
        if (position != -1) {
            System.out.println("Element " + value + " found at position " + position + " from top");
        } else {
            System.out.println("Element " + value + " not found in stack");
        }
    }
    
    // Method to clear stack
    public void clearStack() {
        if (stack == null) {
            System.out.println("Please create a stack first!");
            return;
        }
        
        stack.clear();
    }
    
    // Method to demonstrate practical applications
    public void demonstrateApplications() {
        System.out.println("\n=== Stack Applications Demo ===");
        
        // 1. Reverse a string using stack
        reverseStringDemo();
        
        // 2. Check balanced parentheses
        balancedParenthesesDemo();
        
        // 3. Undo operation simulation
        undoOperationDemo();
        
        System.out.println("================================");
    }
    
    // Demo 1: Reverse a string using stack
    private void reverseStringDemo() {
        System.out.println("\n1. Reversing a string using stack:");
        String text = "HELLO";
        Stack charStack = new Stack(text.length());
        
        System.out.println("Original string: " + text);
        
        // Push each character onto stack
        for (int i = 0; i < text.length(); i++) {
            charStack.push(text.charAt(i));
        }
        
        // Pop each character to get reversed string
        System.out.print("Reversed string: ");
        while (!charStack.isEmpty()) {
            char ch = (char) charStack.pop();
            System.out.print(ch);
        }
        System.out.println();
    }
    
    // Demo 2: Check balanced parentheses (simplified)
    private void balancedParenthesesDemo() {
        System.out.println("\n2. Checking balanced parentheses:");
        String expression = "(())";
        Stack parenStack = new Stack(expression.length());
        boolean isBalanced = true;
        
        System.out.println("Expression: " + expression);
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') {
                parenStack.push(1); // Use 1 to represent '('
            } else if (ch == ')') {
                if (parenStack.isEmpty()) {
                    isBalanced = false;
                    break;
                } else {
                    parenStack.pop();
                }
            }
        }
        
        if (!parenStack.isEmpty()) {
            isBalanced = false;
        }
        
        System.out.println("Is balanced: " + isBalanced);
    }
    
    // Demo 3: Undo operation simulation
    private void undoOperationDemo() {
        System.out.println("\n3. Undo operation simulation:");
        Stack undoStack = new Stack(5);
        
        System.out.println("Performing operations:");
        undoStack.push(100); // Operation 1: Set value to 100
        undoStack.push(200); // Operation 2: Set value to 200
        undoStack.push(300); // Operation 3: Set value to 300
        
        System.out.println("Current value: " + undoStack.peek());
        
        System.out.println("Undoing last operation:");
        undoStack.pop();
        System.out.println("Current value: " + undoStack.peek());
        
        System.out.println("Undoing another operation:");
        undoStack.pop();
        System.out.println("Current value: " + undoStack.peek());
    }
    
    // Method to display menu
    public void displayMenu() {
        System.out.println("\n=== Stack Demo Menu ===");
        System.out.println("1. Create Stack");
        System.out.println("2. Push Element");
        System.out.println("3. Pop Element");
        System.out.println("4. Peek at Top");
        System.out.println("5. Display Stack");
        System.out.println("6. Search Element");
        System.out.println("7. Clear Stack");
        System.out.println("8. Demonstrate Applications");
        System.out.println("9. Auto Demo");
        System.out.println("0. Exit");
        System.out.print("Choose an option (0-9): ");
    }
    
    // Method to run the demo
    public void run() {
        System.out.println("Welcome to Stack Data Structure Demo!");
        
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    createStack();
                    break;
                case 2:
                    pushElement();
                    break;
                case 3:
                    popElement();
                    break;
                case 4:
                    peekElement();
                    break;
                case 5:
                    displayStack();
                    break;
                case 6:
                    searchElement();
                    break;
                case 7:
                    clearStack();
                    break;
                case 8:
                    demonstrateApplications();
                    break;
                case 9:
                    if (stack == null) {
                        stack = new Stack(5);
                    }
                    stack.demonstrateOperations();
                    break;
                case 0:
                    System.out.println("Thank you for using Stack Demo!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
