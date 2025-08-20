/**
 * BasicMethods - Learn about method creation and usage
 * This file contains examples of different types of methods
 * 
 * TODO: Study each method and then create your own versions
 */
public class BasicMethods {
    
    // 1. Method with no parameters and no return value
    public static void greetUser() {
        System.out.println("Hello! Welcome to Java programming!");
    }
    
    // 2. Method with parameters but no return value
    public static void greetUserByName(String name) {
        System.out.println("Hello, " + name + "! Nice to meet you!");
    }
    
    // 3. Method with parameters and return value
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }
    
    // 4. Method that returns a boolean
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    // 5. Method that works with strings
    public static String makeUpperCase(String text) {
        return text.toUpperCase();
    }
    
    // 6. Method with multiple parameters of different types
    public static void displayPersonInfo(String name, int age, double height) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " meters");
    }
    
    // 7. Method that calculates and returns a value
    public static double calculateCircleArea(double radius) {
        final double PI = 3.14159;
        return PI * radius * radius;
    }
    
    // 8. Method that finds maximum of three numbers
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    
    // 9. Method that counts vowels in a string
    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
    
    // 10. Method that checks if a string is a palindrome
    public static boolean isPalindrome(String text) {
        // Remove spaces and convert to lowercase
        text = text.replace(" ", "").toLowerCase();
        
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Example of method overloading (same name, different parameters)
    public static double calculateArea(double radius) {
        // Circle area
        return 3.14159 * radius * radius;
    }
    
    public static double calculateArea(double length, double width) {
        // Rectangle area
        return length * width;
    }
    
    public static double calculateArea(double base, double height, boolean isTriangle) {
        // Triangle area (if isTriangle is true)
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return base * height; // Rectangle
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Basic Methods Examples ===");
        
        // Test all methods
        greetUser();
        greetUserByName("Alice");
        
        int sum = addTwoNumbers(5, 3);
        System.out.println("5 + 3 = " + sum);
        
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
        
        System.out.println("Uppercase 'hello': " + makeUpperCase("hello"));
        
        displayPersonInfo("John", 25, 1.75);
        
        double area = calculateCircleArea(5.0);
        System.out.printf("Circle area (radius=5): %.2f\n", area);
        
        int max = findMax(10, 25, 15);
        System.out.println("Max of 10, 25, 15: " + max);
        
        int vowelCount = countVowels("Hello World");
        System.out.println("Vowels in 'Hello World': " + vowelCount);
        
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome("racecar"));
        System.out.println("Is 'A man a plan a canal Panama' a palindrome? " + 
                          isPalindrome("A man a plan a canal Panama"));
        
        // Method overloading examples
        System.out.println("\n=== Method Overloading ===");
        System.out.println("Circle area (r=3): " + calculateArea(3.0));
        System.out.println("Rectangle area (4x5): " + calculateArea(4.0, 5.0));
        System.out.println("Triangle area (base=6, height=4): " + calculateArea(6.0, 4.0, true));
    }
}
