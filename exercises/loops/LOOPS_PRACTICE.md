# Loops Practice Problems

Complete these 20 practice problems to master Java loops (for, while, do-while, nested loops). Write all programs from scratch and test them thoroughly.

## Instructions
- Create a separate Java file for each problem
- Name your files: `Loops01.java`, `Loops02.java`, etc.
- Include a main method to test your solution
- Use proper indentation and comments
- Test with various inputs including edge cases

---

## Problem 1: Number Pattern Generator
**File:** `Loops01.java`

**Description:** Generate various number patterns using nested loops.

**Requirements:**
- Create a right triangle pattern with numbers
- User inputs the number of rows
- Each row contains consecutive numbers starting from 1
- Handle invalid input (negative numbers)

**Sample Output (5 rows):**
```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

**Test Cases:**
- 3 rows → Triangle with 3 rows
- 0 rows → "Invalid input" message

---

## Problem 2: Multiplication Table Generator
**File:** `Loops02.java`

**Description:** Generate multiplication tables with formatting.

**Requirements:**
- Read a number and generate its multiplication table (1-12)
- Format output in columns
- Add a header row
- Use loops for table generation

**Sample Output (table for 7):**
```
Multiplication Table for 7:
7 x 1 = 7
7 x 2 = 14
...
7 x 12 = 84
```

**Test Cases:**
- Number 5 → Complete 5 times table
- Number 1 → 1 times table

---

## Problem 3: Prime Number Checker and Generator
**File:** `Loops03.java`

**Description:** Check if numbers are prime and generate prime sequences.

**Requirements:**
- Create method to check if a number is prime
- Generate all prime numbers between two given numbers
- Count total primes found
- Use efficient loop logic (check only up to √n)

**Test Cases:**
- Range 10-20 → Primes: 11, 13, 17, 19
- Range 1-10 → Primes: 2, 3, 5, 7

---

## Problem 4: Factorial Calculator with Validation
**File:** `Loops04.java`

**Description:** Calculate factorial using different loop types.

**Requirements:**
- Calculate factorial using for loop
- Calculate factorial using while loop
- Handle large numbers (show warning for n > 20)
- Validate input (non-negative integers only)
- Display step-by-step calculation

**Test Cases:**
- 5! → 1 × 2 × 3 × 4 × 5 = 120
- -3 → Invalid input error
- 25 → Warning about large result

---

## Problem 5: Fibonacci Sequence Generator
**File:** `Loops05.java`

**Description:** Generate Fibonacci sequence with multiple display options.

**Requirements:**
- Generate first n Fibonacci numbers
- Display in single line and column format
- Calculate sum of all generated numbers
- Find and highlight even Fibonacci numbers

**Sample Output (n=8):**
```
Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13
Even numbers: 0, 2, 8
Sum: 33
```

**Test Cases:**
- n=10 → First 10 Fibonacci numbers
- n=1 → Just 0

---

## Problem 6: Digital Root Calculator
**File:** `Loops06.java`

**Description:** Calculate digital root by repeatedly summing digits.

**Requirements:**
- Read a number and calculate its digital root
- Show each step of the process
- Digital root = keep summing digits until single digit
- Handle negative numbers (use absolute value)

**Example:**
- 789 → 7+8+9=24 → 2+4=6 (digital root: 6)

**Test Cases:**
- 123 → Steps and final root
- 999 → Steps showing reduction

---

## Problem 7: Star Pattern Gallery
**File:** `Loops07.java`

**Description:** Create multiple star patterns using nested loops.

**Requirements:**
- Implement 4 different patterns: right triangle, left triangle, diamond, hollow square
- User chooses pattern type and size
- Use nested loops for pattern generation
- Add spacing for proper alignment

**Pattern Examples (size 4):**
```
Right Triangle:     Left Triangle:
*                        *
**                      **
***                    ***
****                  ****

Diamond:            Hollow Square:
   *                ****
  ***               *  *
 *****              *  *
  ***               ****
   *
```

---

## Problem 8: Number System Converter
**File:** `Loops08.java`

**Description:** Convert numbers between different bases using loops.

**Requirements:**
- Convert decimal to binary, octal, hexadecimal
- Convert from any base to decimal
- Use loops for digit extraction and conversion
- Display conversion steps
- Handle invalid inputs

**Test Cases:**
- 25 decimal → Binary: 11001, Octal: 31, Hex: 19
- 101 binary → Decimal: 5

---

## Problem 9: Password Generator
**File:** `Loops09.java`

**Description:** Generate random passwords with specified criteria.

**Requirements:**
- Generate password of specified length
- Include uppercase, lowercase, digits, symbols
- Ensure at least one character from each category
- Use loops to build password
- Allow regeneration until user is satisfied

**Test Cases:**
- Length 8 → Password with mixed characters
- Length 12 → Longer secure password

---

## Problem 10: GCD and LCM Calculator
**File:** `Loops10.java`

**Description:** Calculate Greatest Common Divisor and Least Common Multiple.

**Requirements:**
- Implement Euclidean algorithm for GCD using loops
- Calculate LCM using GCD formula: LCM(a,b) = (a*b)/GCD(a,b)
- Show step-by-step calculation process
- Handle edge cases (one number is 0)

**Test Cases:**
- GCD(48, 18) → Steps: 48, 18, 12, 6, 0 → GCD: 6
- LCM(12, 8) → GCD: 4, LCM: 24

---

## Problem 11: Sum of Digits Calculator
**File:** `Loops11.java`

**Description:** Calculate various digit-based operations.

**Requirements:**
- Sum of all digits
- Sum of even digits only
- Sum of odd digits only
- Count of each digit (0-9)
- Alternate between adding and subtracting digits

**Test Cases:**
- 12345 → Total sum: 15, Even sum: 6, Odd sum: 9
- 11223 → Digit counts: 1 appears 2 times, 2 appears 2 times, 3 appears 1 time

---

## Problem 12: Palindrome Checker and Generator
**File:** `Loops12.java`

**Description:** Check for palindromes and generate palindromic numbers.

**Requirements:**
- Check if a number is palindrome using loops
- Generate next palindrome after given number
- Find all palindromes in a range
- Work with both numbers and strings

**Test Cases:**
- 121 → Is palindrome
- 123 → Not palindrome, next palindrome: 131
- Range 100-150 → Palindromes: 101, 111, 121, 131, 141

---

## Problem 13: Armstrong Number Explorer
**File:** `Loops13.java`

**Description:** Find and verify Armstrong numbers (narcissistic numbers).

**Requirements:**
- Check if a number is Armstrong number
- Find all Armstrong numbers in a range
- Armstrong number: sum of its digits raised to power of number of digits
- Display calculation process

**Example:**
- 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✓

**Test Cases:**
- 153 → Is Armstrong number
- Range 1-1000 → Find all Armstrong numbers

---

## Problem 14: Mathematical Series Calculator
**File:** `Loops14.java`

**Description:** Calculate various mathematical series using loops.

**Requirements:**
- Sum of natural numbers: 1+2+3+...+n
- Sum of squares: 1²+2²+3²+...+n²
- Sum of cubes: 1³+2³+3³+...+n³
- Alternating series: 1-2+3-4+5-...±n
- Harmonic series: 1+1/2+1/3+...+1/n

**Test Cases:**
- n=5 → Calculate all series types
- n=10 → Display series values and sums

---

## Problem 15: Menu-Driven Calculator
**File:** `Loops15.java`

**Description:** Create a calculator with menu using loops.

**Requirements:**
- Display menu with options: Add, Subtract, Multiply, Divide, Exit
- Use do-while loop for menu repetition
- Perform calculations and display results
- Handle division by zero
- Keep running until user chooses exit

**Menu Example:**
```
Calculator Menu:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Choose option: 
```

---

## Problem 16: Number Guessing Game
**File:** `Loops16.java`

**Description:** Implement a number guessing game with attempts tracking.

**Requirements:**
- Generate random number between 1-100
- User has limited attempts (7 attempts)
- Provide hints: "Too high", "Too low", "Correct"
- Track number of attempts
- Ask if user wants to play again

**Test Cases:**
- Correct guess in 3 attempts → "Excellent!"
- Max attempts reached → "Game over, number was X"

---

## Problem 17: Text Statistics Analyzer
**File:** `Loops17.java`

**Description:** Analyze text statistics using character-by-character processing.

**Requirements:**
- Count vowels, consonants, digits, special characters
- Count words and sentences
- Find most frequent character
- Calculate average word length
- Display detailed statistics

**Test Cases:**
- "Hello World!" → Vowels: 3, Consonants: 7, Words: 2
- "Test 123!" → Mixed character analysis

---

## Problem 18: Banking Transaction Simulator
**File:** `Loops18.java`

**Description:** Simulate banking operations with transaction history.

**Requirements:**
- Menu: Deposit, Withdraw, Check Balance, Transaction History, Exit
- Use loops for menu and transaction processing
- Maintain transaction history in arrays
- Validate sufficient funds for withdrawals
- Calculate and display account summary

**Test Cases:**
- Multiple deposits and withdrawals
- Attempt withdrawal with insufficient funds
- Display complete transaction history

---

## Problem 19: Grade Processing System
**File:** `Loops19.java`

**Description:** Process student grades with comprehensive analysis.

**Requirements:**
- Read grades for multiple students
- Calculate individual and class statistics
- Find highest, lowest, average grades
- Count grades in each letter category
- Display grade distribution

**Test Cases:**
- 5 students with various grades
- Calculate class average and distribution
- Identify top and bottom performers

---

## Problem 20: Matrix Pattern Generator
**File:** `Loops20.java`

**Description:** Generate various matrix patterns using nested loops.

**Requirements:**
- Spiral pattern (numbers arranged in spiral)
- Magic square (if possible for given size)
- Diagonal patterns
- Border pattern (border elements different from inner)
- User chooses matrix size and pattern type

**Spiral Pattern Example (3x3):**
```
1 2 3
8 9 4
7 6 5
```

**Test Cases:**
- 3x3 matrix → Various patterns
- 4x4 matrix → Larger pattern generation

---

## Testing Your Solutions

For each problem, test with:
1. **Small inputs** - easy to verify manually
2. **Large inputs** - test efficiency and limits
3. **Edge cases** - zero, one, negative numbers
4. **Invalid inputs** - non-numeric, out of range
5. **Boundary conditions** - minimum/maximum values

## Loop Types to Practice

1. **For loops**: Known number of iterations
2. **While loops**: Condition-based termination
3. **Do-while loops**: Execute at least once
4. **Nested loops**: Loops within loops
5. **Enhanced for loops**: Array/collection iteration

## Common Loop Patterns

1. **Counter loops**: Incrementing/decrementing counters
2. **Accumulator loops**: Building sums or products
3. **Search loops**: Finding specific values
4. **Validation loops**: Input validation with retry
5. **Menu loops**: Repeating user interface
6. **Processing loops**: Handling data sequences

## Performance Considerations

- Minimize work inside nested loops
- Use break and continue appropriately
- Consider loop invariants
- Avoid infinite loops with proper termination conditions
- Choose appropriate loop type for the task

## Debugging Tips

1. **Trace execution**: Follow loop variables step by step
2. **Use print statements**: Display loop variables during execution
3. **Check termination**: Ensure loops will eventually end
4. **Verify boundaries**: Test first and last iterations
5. **Test empty cases**: What happens with zero iterations?

## Next Steps

After completing these problems:
1. Review your solutions for optimization opportunities
2. Practice combining loops with arrays
3. Move on to Array exercises
4. Explore recursive solutions to loop problems

Remember: Loops are fundamental to programming. Focus on understanding when to use each type and how to control loop execution effectively!
