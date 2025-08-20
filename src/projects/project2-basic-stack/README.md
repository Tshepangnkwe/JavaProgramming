# Project 2: Basic Stack Implementation

## Overview
A complete implementation of a stack data structure using arrays, demonstrating fundamental DSA concepts including LIFO (Last In, First Out) operations, error handling, and practical applications.

## Features
- **Core Stack Operations**: Push, Pop, Peek
- **Stack Status**: Check if empty, full, or get current size
- **Advanced Operations**: Search, Clear, Display
- **Interactive Demo**: Menu-driven interface for hands-on learning
- **Practical Examples**: Real-world applications of stack data structure
- **Error Handling**: Proper overflow and underflow detection

## Key Learning Concepts

### 1. Data Structure Implementation
- **Array-based Stack**: Using arrays to implement stack
- **Index Management**: Using `top` pointer to track stack position
- **Capacity Management**: Handling fixed-size limitations

### 2. LIFO Principle
- **Last In, First Out**: Understanding stack behavior
- **Push Operation**: Adding elements to the top
- **Pop Operation**: Removing elements from the top
- **Peek Operation**: Viewing top element without removal

### 3. Error Handling
- **Stack Overflow**: Detecting when stack is full
- **Stack Underflow**: Detecting when stack is empty
- **Boundary Checking**: Preventing array index errors

### 4. Algorithm Complexity
- **Time Complexity**: O(1) for all basic operations
- **Space Complexity**: O(n) where n is the stack size

## How to Run

1. **Navigate to the project directory:**
   ```bash
   cd src/projects/project2-basic-stack
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
=== Stack Demo Menu ===
1. Create Stack
2. Push Element
3. Pop Element
4. Peek at Top
5. Display Stack
6. Search Element
7. Clear Stack
8. Demonstrate Applications
9. Auto Demo
0. Exit
Choose an option (0-9): 1

Enter the size of the stack: 5
Stack of size 5 created successfully!
```

## Code Structure

### Stack.java
- **Purpose**: Core stack implementation with all basic operations
- **Key Methods**:
  - `push(int value)`: Add element to top of stack
  - `pop()`: Remove and return top element
  - `peek()`: View top element without removing
  - `isEmpty()`: Check if stack is empty
  - `isFull()`: Check if stack is full
  - `display()`: Show all elements in stack
  - `search(int value)`: Find element position from top

### StackDemo.java
- **Purpose**: Interactive demonstration and practical applications
- **Key Features**:
  - Menu-driven interface
  - Input validation
  - Practical application examples:
    - String reversal
    - Balanced parentheses checking
    - Undo operation simulation

### Main.java
- **Purpose**: Entry point that runs both automatic and interactive demos
- **Flow**: Automatic demonstration followed by interactive menu

## Stack Operations Details

### Push Operation
```java
public boolean push(int value) {
    if (isFull()) {
        System.out.println("Stack Overflow!");
        return false;
    }
    top++;
    array[top] = value;
    return true;
}
```

### Pop Operation
```java
public int pop() {
    if (isEmpty()) {
        System.out.println("Stack Underflow!");
        return -1;
    }
    int poppedValue = array[top];
    top--;
    return poppedValue;
}
```

### Peek Operation
```java
public int peek() {
    if (isEmpty()) {
        return -1;
    }
    return array[top];
}
```

## Practical Applications Demonstrated

### 1. String Reversal
- Push each character onto stack
- Pop characters to get reversed string
- **Example**: "HELLO" → "OLLEH"

### 2. Balanced Parentheses
- Push opening parentheses onto stack
- Pop for each closing parenthesis
- Stack should be empty for balanced expression

### 3. Undo Operations
- Each operation pushes state onto stack
- Undo pops the last state
- Common in text editors and applications

## Learning Exercises

1. **Extend the Stack** to handle different data types (String, Double)
2. **Implement Dynamic Stack** that can grow in size
3. **Add More Applications**:
   - Expression evaluation
   - Function call tracking
   - Browser history simulation
4. **Performance Testing**: Measure operation times
5. **Memory Usage**: Track space efficiency

## Common Stack Applications

1. **Function Calls**: Programming language runtime stacks
2. **Expression Evaluation**: Converting infix to postfix notation
3. **Undo/Redo**: Text editors, image editors
4. **Browser History**: Back button functionality
5. **Balanced Symbols**: Compiler syntax checking
6. **Depth-First Search**: Graph traversal algorithms

## Error Scenarios and Handling

### Stack Overflow
- **Cause**: Attempting to push when stack is full
- **Handling**: Return false and display error message
- **Prevention**: Check `isFull()` before pushing

### Stack Underflow
- **Cause**: Attempting to pop from empty stack
- **Handling**: Return error value (-1) and display message
- **Prevention**: Check `isEmpty()` before popping

## Time and Space Complexity

| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Push      | O(1)           | O(1)             |
| Pop       | O(1)           | O(1)             |
| Peek      | O(1)           | O(1)             |
| Search    | O(n)           | O(1)             |
| Display   | O(n)           | O(1)             |

## Advantages and Disadvantages

### Advantages
- **Simple Implementation**: Easy to understand and code
- **Fast Operations**: O(1) for basic operations
- **Memory Efficient**: No extra pointers needed
- **Cache Friendly**: Sequential memory access

### Disadvantages
- **Fixed Size**: Cannot grow beyond initial capacity
- **Memory Waste**: May allocate more than needed
- **No Random Access**: Can only access top element

## Next Steps

After mastering this stack implementation, consider:

1. **Linked List Stack**: Dynamic size implementation
2. **Generic Stack**: Support multiple data types
3. **Thread-Safe Stack**: Concurrent programming
4. **Queue Implementation**: Another fundamental data structure
5. **Advanced Applications**: Expression parsers, compilers

## Troubleshooting

**Issue**: "Stack Overflow" error
- **Solution**: Check if stack is full before pushing

**Issue**: "Stack Underflow" error
- **Solution**: Check if stack is empty before popping

**Issue**: Wrong search results
- **Solution**: Remember search returns position from top (1-based)

This project provides a solid foundation for understanding data structures and prepares you for more advanced DSA concepts!
