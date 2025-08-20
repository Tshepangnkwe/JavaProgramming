/**
 * LoopExamples - Learn about different types of loops in Java
 * This demonstrates:
 * - for loops
 * - while loops  
 * - do-while loops
 * - nested loops
 * - break and continue statements
 * 
 * TODO: Run this code and then create your own loop programs
 */
public class LoopExamples {
    
    public static void main(String[] args) {
        System.out.println("=== Java Loop Examples ===");
        
        // 1. Basic for loop
        System.out.println("\n1. Basic for loop (1 to 10):");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 2. For loop counting backwards
        System.out.println("\n2. Counting backwards (10 to 1):");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 3. For loop with step increment
        System.out.println("\n3. Even numbers (2, 4, 6, 8, 10):");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 4. While loop example
        System.out.println("\n4. While loop (sum of 1 to 5):");
        int sum = 0;
        int n = 1;
        while (n <= 5) {
            sum += n;
            System.out.println("Adding " + n + ", sum = " + sum);
            n++;
        }
        
        // 5. Do-while loop example
        System.out.println("\n5. Do-while loop (at least one execution):");
        int count = 0;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 3);
        
        // 6. Nested loops - multiplication table
        System.out.println("\n6. Nested loops - 3x3 multiplication table:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println(); // New line after each row
        }
        
        // 7. Break statement example
        System.out.println("\n7. Break statement (stop at 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at " + i);
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 8. Continue statement example
        System.out.println("\n8. Continue statement (skip even numbers):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 9. Enhanced for loop (for-each) with array
        System.out.println("\n9. Enhanced for loop with array:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // 10. Loop with user input simulation
        System.out.println("\n10. Finding first prime number after 10:");
        int candidate = 11;
        boolean found = false;
        while (!found) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(candidate); i++) {
                if (candidate % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("First prime after 10 is: " + candidate);
                found = true;
            } else {
                candidate++;
            }
        }
        
        // Practice challenges
        System.out.println("\n=== Practice Challenges ===");
        System.out.println("Try these yourself:");
        System.out.println("1. Print factorial of a number using loops");
        System.out.println("2. Print Fibonacci series up to n terms");
        System.out.println("3. Find the largest number in an array");
        System.out.println("4. Print a triangle pattern with stars");
        System.out.println("5. Count vowels in a string using loops");
        System.out.println("6. Reverse a number using while loop");
        System.out.println("7. Check if a number is palindrome");
        System.out.println("8. Print all prime numbers between 1 and 100");
    }
}
