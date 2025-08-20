/**
 * Stack class - Array-based implementation of Stack data structure
 * This demonstrates:
 * - Data structure implementation
 * - Array manipulation
 * - Error handling
 * - LIFO (Last In, First Out) principle
 */
public class Stack {
    private int[] array;
    private int top;
    private int maxSize;
    
    // Constructor to create a stack with given size
    public Stack(int size) {
        this.maxSize = size;
        this.array = new int[maxSize];
        this.top = -1; // Stack is empty initially
    }
    
    // Method to check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    
    // Method to check if stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
    
    // Method to get current size of stack
    public int size() {
        return top + 1;
    }
    
    // Method to push an element onto the stack
    public boolean push(int value) {
        // Check if stack is full
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return false;
        }
        
        // Increment top and add element
        top++;
        array[top] = value;
        System.out.println("Pushed: " + value);
        return true;
    }
    
    // Method to pop an element from the stack
    public int pop() {
        // Check if stack is empty
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop from empty stack");
            return -1; // Return -1 to indicate error
        }
        
        // Get the top element and decrement top
        int poppedValue = array[top];
        top--;
        System.out.println("Popped: " + poppedValue);
        return poppedValue;
    }
    
    // Method to peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek");
            return -1;
        }
        
        return array[top];
    }
    
    // Method to display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        
        System.out.print("Stack contents (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    
    // Method to clear the stack
    public void clear() {
        top = -1;
        System.out.println("Stack cleared");
    }
    
    // Method to search for an element in the stack
    public int search(int value) {
        for (int i = top; i >= 0; i--) {
            if (array[i] == value) {
                return top - i + 1; // Return position from top (1-based)
            }
        }
        return -1; // Element not found
    }
    
    // Method to get all elements as a string
    public String toString() {
        if (isEmpty()) {
            return "Empty Stack";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Stack[");
        for (int i = 0; i <= top; i++) {
            sb.append(array[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    // Method to demonstrate stack operations step by step
    public void demonstrateOperations() {
        System.out.println("\n=== Stack Operations Demonstration ===");
        
        // Show initial state
        System.out.println("1. Initial state:");
        display();
        System.out.println("Is empty: " + isEmpty());
        System.out.println("Size: " + size());
        
        // Push some elements
        System.out.println("\n2. Pushing elements 10, 20, 30:");
        push(10);
        push(20);
        push(30);
        display();
        
        // Peek at top element
        System.out.println("\n3. Peek at top element:");
        System.out.println("Top element: " + peek());
        display();
        
        // Pop elements
        System.out.println("\n4. Popping elements:");
        pop();
        display();
        pop();
        display();
        
        // Search for element
        System.out.println("\n5. Searching for element 10:");
        int position = search(10);
        if (position != -1) {
            System.out.println("Element 10 found at position " + position + " from top");
        } else {
            System.out.println("Element 10 not found");
        }
        
        // Show final state
        System.out.println("\n6. Final state:");
        display();
        System.out.println("Size: " + size());
        System.out.println("=======================================");
    }
}
