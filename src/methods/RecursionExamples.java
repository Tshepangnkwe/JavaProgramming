/**
 * RecursionExamples - Learn about recursive methods
 * Recursion is when a method calls itself
 * 
 * TODO: Study these examples and create your own recursive methods
 */
public class RecursionExamples {
    
    // 1. Calculate factorial (n!)
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    public static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        return n * factorial(n - 1);
    }
    
    // 2. Calculate Fibonacci number
    // Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        // Recursive case: fib(n-1) + fib(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    // 3. Calculate power (base^exponent)
    public static double power(double base, int exponent) {
        // Base case: anything to power 0 is 1
        if (exponent == 0) {
            return 1;
        }
        // Handle negative exponents
        if (exponent < 0) {
            return 1.0 / power(base, -exponent);
        }
        // Recursive case: base * power(base, exponent-1)
        return base * power(base, exponent - 1);
    }
    
    // 4. Sum of digits in a number
    // sumOfDigits(123) = 1 + 2 + 3 = 6
    public static int sumOfDigits(int number) {
        // Make number positive if negative
        number = Math.abs(number);
        
        // Base case: single digit
        if (number < 10) {
            return number;
        }
        // Recursive case: last digit + sum of remaining digits
        return (number % 10) + sumOfDigits(number / 10);
    }
    
    // 5. Count digits in a number
    public static int countDigits(int number) {
        // Make number positive if negative
        number = Math.abs(number);
        
        // Base case: single digit
        if (number < 10) {
            return 1;
        }
        // Recursive case: 1 + count of remaining digits
        return 1 + countDigits(number / 10);
    }
    
    // 6. Reverse a number
    // reverseNumber(123) = 321
    public static int reverseNumber(int number) {
        return reverseNumberHelper(number, 0);
    }
    
    private static int reverseNumberHelper(int number, int reversed) {
        // Base case: no more digits
        if (number == 0) {
            return reversed;
        }
        // Recursive case: build reversed number
        return reverseNumberHelper(number / 10, reversed * 10 + number % 10);
    }
    
    // 7. Check if number is palindrome using recursion
    public static boolean isPalindromeNumber(int number) {
        return number == reverseNumber(number);
    }
    
    // 8. Calculate GCD (Greatest Common Divisor) using Euclidean algorithm
    public static int gcd(int a, int b) {
        // Make numbers positive
        a = Math.abs(a);
        b = Math.abs(b);
        
        // Base case: if b is 0, GCD is a
        if (b == 0) {
            return a;
        }
        // Recursive case: gcd(b, a % b)
        return gcd(b, a % b);
    }
    
    // 9. Print numbers from n to 1 (countdown)
    public static void countdown(int n) {
        // Base case: stop when n becomes 0
        if (n <= 0) {
            System.out.println("Blast off!");
            return;
        }
        // Print current number and recurse
        System.out.println(n);
        countdown(n - 1);
    }
    
    // 10. Print numbers from 1 to n (count up)
    public static void countUp(int n) {
        // Base case: stop when n becomes 0 or negative
        if (n <= 0) {
            return;
        }
        // Recurse first, then print (this reverses the order)
        countUp(n - 1);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Recursion Examples ===");
        
        // Test factorial
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Factorial of 0: " + factorial(0));
        
        // Test Fibonacci
        System.out.print("First 10 Fibonacci numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        
        // Test power
        System.out.println("2^5 = " + power(2, 5));
        System.out.println("3^0 = " + power(3, 0));
        System.out.println("2^(-3) = " + power(2, -3));
        
        // Test sum of digits
        System.out.println("Sum of digits in 123: " + sumOfDigits(123));
        System.out.println("Sum of digits in 9876: " + sumOfDigits(9876));
        
        // Test count digits
        System.out.println("Number of digits in 12345: " + countDigits(12345));
        System.out.println("Number of digits in 7: " + countDigits(7));
        
        // Test reverse number
        System.out.println("Reverse of 123: " + reverseNumber(123));
        System.out.println("Reverse of 9876: " + reverseNumber(9876));
        
        // Test palindrome
        System.out.println("Is 121 a palindrome? " + isPalindromeNumber(121));
        System.out.println("Is 123 a palindrome? " + isPalindromeNumber(123));
        
        // Test GCD
        System.out.println("GCD of 48 and 18: " + gcd(48, 18));
        System.out.println("GCD of 100 and 25: " + gcd(100, 25));
        
        // Test countdown and count up
        System.out.println("\nCountdown from 5:");
        countdown(5);
        
        System.out.println("\nCount up to 5:");
        countUp(5);
        
        System.out.println("\n=== Recursion Practice ===");
        System.out.println("Try implementing these yourself:");
        System.out.println("1. Binary search using recursion");
        System.out.println("2. Tower of Hanoi problem");
        System.out.println("3. Tree traversal algorithms");
        System.out.println("4. Recursive array sum");
        System.out.println("5. Find minimum/maximum in array recursively");
    }
}
