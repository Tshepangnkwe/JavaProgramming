# Method Exercises

Complete these exercises to practice writing methods in Java. Start with easier ones and progress to more challenging problems.

## Beginner Level

### Exercise 1: Basic Method Creation
**File to create:** `MathUtils.java`

Create a class called `MathUtils` with the following static methods:

1. `add(int a, int b)` - returns the sum of two integers
2. `subtract(int a, int b)` - returns the difference of two integers
3. `multiply(int a, int b)` - returns the product of two integers
4. `divide(double a, double b)` - returns the division (handle division by zero)
5. `isPositive(int number)` - returns true if the number is positive
6. `isNegative(int number)` - returns true if the number is negative
7. `absolute(int number)` - returns the absolute value of a number

### Exercise 2: String Methods
**File to create:** `StringHelper.java`

Create methods that work with strings:

1. `countCharacters(String text)` - returns the number of characters
2. `reverseString(String text)` - returns the string reversed
3. `isEmptyOrNull(String text)` - checks if string is null or empty
4. `capitalize(String text)` - capitalizes the first letter
5. `removeSpaces(String text)` - removes all spaces from the string
6. `countWords(String text)` - counts the number of words
7. `isPalindrome(String text)` - checks if the string is a palindrome

### Exercise 3: Number Utilities
**File to create:** `NumberUtils.java`

Create methods for number operations:

1. `isEven(int number)` - checks if a number is even
2. `isOdd(int number)` - checks if a number is odd
3. `isPrime(int number)` - checks if a number is prime
4. `factorial(int n)` - calculates factorial of n
5. `sumOfDigits(int number)` - sums all digits in a number
6. `countDigits(int number)` - counts number of digits
7. `reverseNumber(int number)` - reverses the digits of a number

## Intermediate Level

### Exercise 4: Array Methods
**File to create:** `ArrayOperations.java`

Create methods that work with arrays:

1. `findMax(int[] array)` - finds the maximum value in array
2. `findMin(int[] array)` - finds the minimum value in array
3. `calculateSum(int[] array)` - sums all elements
4. `calculateAverage(int[] array)` - calculates average
5. `reverseArray(int[] array)` - reverses the array in place
6. `contains(int[] array, int value)` - checks if array contains value
7. `sortArray(int[] array)` - sorts the array (implement bubble sort)
8. `removeDuplicates(int[] array)` - returns array without duplicates

### Exercise 5: Validation Methods
**File to create:** `Validator.java`

Create methods for data validation:

1. `isValidEmail(String email)` - validates email format
2. `isValidPhoneNumber(String phone)` - validates phone format
3. `isValidPassword(String password)` - validates password strength
4. `isValidAge(int age)` - validates age (0-150)
5. `isValidGrade(double grade)` - validates grade (0-100)
6. `isValidDate(int day, int month, int year)` - validates date
7. `isValidCreditCard(String cardNumber)` - basic credit card validation

### Exercise 6: Conversion Methods
**File to create:** `Converter.java`

Create methods for unit conversions:

1. `celsiusToFahrenheit(double celsius)` - temperature conversion
2. `fahrenheitToCelsius(double fahrenheit)` - temperature conversion
3. `metersToFeet(double meters)` - length conversion
4. `feetToMeters(double feet)` - length conversion
5. `kgToPounds(double kg)` - weight conversion
6. `poundsToKg(double pounds)` - weight conversion
7. `hoursToMinutes(int hours)` - time conversion
8. `minutesToHours(double minutes)` - time conversion

## Advanced Level

### Exercise 7: Mathematical Functions
**File to create:** `AdvancedMath.java`

Create advanced mathematical methods:

1. `power(double base, int exponent)` - calculate power without Math.pow()
2. `squareRoot(double number)` - calculate square root using Newton's method
3. `gcd(int a, int b)` - greatest common divisor using Euclidean algorithm
4. `lcm(int a, int b)` - least common multiple
5. `fibonacci(int n)` - nth Fibonacci number (implement iteratively)
6. `isPerfectNumber(int number)` - checks if number equals sum of its divisors
7. `primeFactors(int number)` - returns array of prime factors

### Exercise 8: Pattern Methods
**File to create:** `PatternMaker.java`

Create methods that print patterns:

1. `printTriangle(int height)` - prints triangle of stars
2. `printInvertedTriangle(int height)` - prints inverted triangle
3. `printDiamond(int size)` - prints diamond pattern
4. `printNumberPyramid(int height)` - prints pyramid with numbers
5. `printMultiplicationTable(int number)` - prints multiplication table
6. `printFibonacciSeries(int count)` - prints first n Fibonacci numbers

### Exercise 9: Search and Sort Methods
**File to create:** `SearchSort.java`

Implement search and sorting algorithms:

1. `linearSearch(int[] array, int target)` - returns index of target or -1
2. `binarySearch(int[] sortedArray, int target)` - binary search implementation
3. `bubbleSort(int[] array)` - bubble sort algorithm
4. `selectionSort(int[] array)` - selection sort algorithm
5. `insertionSort(int[] array)` - insertion sort algorithm
6. `findSecondLargest(int[] array)` - finds second largest element
7. `findKthLargest(int[] array, int k)` - finds kth largest element

## Method Overloading Practice

### Exercise 10: Calculator with Overloading
**File to create:** `FlexibleCalculator.java`

Create overloaded methods for a calculator:

1. `calculate(int a, int b)` - adds two integers
2. `calculate(double a, double b)` - adds two doubles
3. `calculate(int a, int b, char operation)` - performs operation (+, -, *, /)
4. `calculate(double a, double b, char operation)` - same for doubles
5. `calculate(int[] numbers)` - sums array of integers
6. `calculate(double[] numbers)` - sums array of doubles

## Testing Your Methods

For each exercise, create a `main` method that tests all your methods with different inputs. Include:

- Normal cases
- Edge cases (empty arrays, null strings, zero values)
- Invalid inputs
- Boundary conditions

## Example Test Structure:

```java
public static void main(String[] args) {
    System.out.println("Testing MathUtils class:");
    
    // Test add method
    System.out.println("5 + 3 = " + add(5, 3)); // Expected: 8
    System.out.println("0 + 0 = " + add(0, 0)); // Expected: 0
    System.out.println("-5 + 3 = " + add(-5, 3)); // Expected: -2
    
    // Test more methods...
}
```

## Tips for Success:

1. **Start Simple**: Begin with basic methods and gradually increase complexity
2. **Test Thoroughly**: Test each method with various inputs
3. **Handle Edge Cases**: Consider null inputs, empty arrays, negative numbers
4. **Use Meaningful Names**: Choose descriptive method and variable names
5. **Add Comments**: Document what each method does
6. **Validate Input**: Check for invalid parameters and handle appropriately
7. **Follow Conventions**: Use camelCase for method names, start with lowercase

## Next Steps:

After completing these exercises, you'll have solid experience with:
- Method creation and calling
- Parameter passing and return values
- Method overloading
- Input validation
- Algorithm implementation
- Testing and debugging

Good luck with your practice! Remember, the key to learning programming is writing lots of code yourself.
