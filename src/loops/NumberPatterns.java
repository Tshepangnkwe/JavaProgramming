/**
 * NumberPatterns - Create interesting patterns using loops
 * This demonstrates:
 * - Nested loop patterns
 * - Mathematical relationships in patterns
 * - Creative use of loops and conditionals
 * 
 * TODO: Study these patterns and create your own variations
 */
public class NumberPatterns {
    
    public static void main(String[] args) {
        System.out.println("=== Number and Star Patterns ===");
        
        // Pattern 1: Simple triangle
        System.out.println("\n1. Simple star triangle:");
        printStarTriangle(5);
        
        // Pattern 2: Number triangle
        System.out.println("\n2. Number triangle:");
        printNumberTriangle(5);
        
        // Pattern 3: Inverted triangle
        System.out.println("\n3. Inverted star triangle:");
        printInvertedTriangle(5);
        
        // Pattern 4: Diamond pattern
        System.out.println("\n4. Diamond pattern:");
        printDiamond(5);
        
        // Pattern 5: Number pyramid
        System.out.println("\n5. Number pyramid:");
        printNumberPyramid(4);
        
        // Pattern 6: Floyd's triangle
        System.out.println("\n6. Floyd's triangle:");
        printFloydsTriangle(5);
        
        // Pattern 7: Pascal's triangle
        System.out.println("\n7. Pascal's triangle:");
        printPascalsTriangle(5);
        
        // Pattern 8: Hollow rectangle
        System.out.println("\n8. Hollow rectangle:");
        printHollowRectangle(5, 8);
        
        System.out.println("\n=== Challenge Patterns ===");
        System.out.println("Try creating these patterns yourself:");
        System.out.println("1. Hourglass pattern");
        System.out.println("2. Spiral number pattern");
        System.out.println("3. Zigzag pattern");
        System.out.println("4. Heart shape with stars");
        System.out.println("5. Alphabet pyramid");
    }
    
    // Pattern 1: Simple star triangle
    public static void printStarTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // Pattern 2: Number triangle
    public static void printNumberTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    // Pattern 3: Inverted triangle
    public static void printInvertedTriangle(int height) {
        for (int i = height; i >= 1; i--) {
            // Print spaces for alignment
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // Pattern 4: Diamond pattern
    public static void printDiamond(int size) {
        // Upper half (including middle)
        for (int i = 1; i <= size; i++) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = size - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Pattern 5: Number pyramid
    public static void printNumberPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Print numbers increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print numbers decreasing
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    // Pattern 6: Floyd's triangle
    public static void printFloydsTriangle(int rows) {
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    
    // Pattern 7: Pascal's triangle
    public static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Calculate and print Pascal's triangle values
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    
    // Pattern 8: Hollow rectangle
    public static void printHollowRectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                // Print star for border, space for inside
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
