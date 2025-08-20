# Java Basics Practice Problems

Complete these 20 practice problems to master Java fundamentals. Write all programs from scratch and test them thoroughly.

## Instructions
- Create a separate Java file for each problem
- Name your files: `Problem01.java`, `Problem02.java`, etc.
- Include a main method to test your solution
- Add comments explaining your logic
- Test with different inputs to ensure correctness

---

## Problem 1: Personal Information Display
**File:** `Problem01.java`

**Description:** Create a program that displays your personal information in a formatted way.

**Requirements:**
- Declare variables for: name, age, height (in meters), weight (in kg), and favorite color
- Display all information in a neat format
- Calculate and display your BMI (weight / height²)
- Determine if you're underweight (<18.5), normal (18.5-24.9), or overweight (≥25)

**Sample Output:**
```
=== Personal Information ===
Name: John Doe
Age: 20 years
Height: 1.75 meters
Weight: 70.0 kg
Favorite Color: Blue
BMI: 22.86
Category: Normal weight
```

---

## Problem 2: Currency Converter
**File:** `Problem02.java`

**Description:** Create a simple currency converter program.

**Requirements:**
- Declare exchange rates as constants (USD to EUR: 0.85, USD to GBP: 0.73, USD to JPY: 110.0)
- Ask user for USD amount (use Scanner)
- Convert and display the equivalent in all three currencies
- Format the output to 2 decimal places

**Sample Output:**
```
Enter amount in USD: 100
$100.00 USD equals:
€85.00 EUR
£73.00 GBP
¥11000.00 JPY
```

---

## Problem 3: Temperature Converter
**File:** `Problem03.java`

**Description:** Convert temperatures between Celsius, Fahrenheit, and Kelvin.

**Requirements:**
- Read a temperature value and scale (C, F, or K)
- Convert to all other scales
- Use these formulas:
  - C to F: (C × 9/5) + 32
  - C to K: C + 273.15
  - F to C: (F - 32) × 5/9
  - K to C: K - 273.15

**Sample Output:**
```
Enter temperature: 25
Enter scale (C/F/K): C
25.0°C equals:
77.0°F
298.15K
```

---

## Problem 4: Shopping Receipt Calculator
**File:** `Problem04.java`

**Description:** Calculate total cost including tax for a shopping receipt.

**Requirements:**
- Read prices for 3 items
- Calculate subtotal
- Apply tax rate of 8.5%
- Calculate final total
- Display itemized receipt

**Sample Output:**
```
Item 1 price: $12.50
Item 2 price: $8.99
Item 3 price: $15.75
-----------------
Subtotal: $37.24
Tax (8.5%): $3.17
Total: $40.41
```

---

## Problem 5: Time Duration Calculator
**File:** `Problem05.java`

**Description:** Calculate the duration between two times in hours and minutes.

**Requirements:**
- Read start time (hours and minutes)
- Read end time (hours and minutes)
- Calculate duration in hours and minutes
- Handle cases where end time is next day

**Sample Output:**
```
Start time - Hours: 9, Minutes: 30
End time - Hours: 17, Minutes: 45
Duration: 8 hours and 15 minutes
```

---

## Problem 6: Student Grade Point Calculator
**File:** `Problem06.java`

**Description:** Calculate a student's GPA based on course credits and grades.

**Requirements:**
- Read data for 4 courses: credits and grade points (0-4 scale)
- Calculate total credit hours
- Calculate weighted GPA
- Display results with proper formatting

**Sample Output:**
```
Course 1 - Credits: 3, Grade: 3.7
Course 2 - Credits: 4, Grade: 3.3
Course 3 - Credits: 3, Grade: 4.0
Course 4 - Credits: 2, Grade: 3.0
Total Credits: 12
GPA: 3.50
```

---

## Problem 7: Compound Interest Calculator
**File:** `Problem07.java`

**Description:** Calculate compound interest for an investment.

**Requirements:**
- Read principal amount, annual interest rate, and number of years
- Calculate compound interest using: A = P(1 + r)^t
- Display initial amount, final amount, and interest earned
- Show year-by-year growth

**Sample Output:**
```
Principal: $1000.00
Interest Rate: 5.0%
Years: 3
Year 1: $1050.00
Year 2: $1102.50
Year 3: $1157.63
Interest Earned: $157.63
```

---

## Problem 8: Geometry Calculator
**File:** `Problem08.java`

**Description:** Calculate areas and perimeters of different shapes.

**Requirements:**
- Calculate for circle, rectangle, and triangle
- Read necessary dimensions
- Use Math.PI for circle calculations
- Display all results with 2 decimal places

**Sample Output:**
```
=== Circle ===
Radius: 5.0
Area: 78.54
Circumference: 31.42

=== Rectangle ===
Length: 8.0, Width: 6.0
Area: 48.00
Perimeter: 28.00

=== Triangle ===
Base: 10.0, Height: 6.0
Area: 30.00
```

---

## Problem 9: ASCII Art Generator
**File:** `Problem09.java`

**Description:** Generate simple ASCII art patterns.

**Requirements:**
- Create a rectangle pattern using '*' characters
- Create a triangle pattern
- Create your initials using ASCII characters
- Use variables for dimensions

**Sample Output:**
```
Rectangle (5x3):
*****
*****
*****

Triangle (height 4):
   *
  ***
 *****
*******

Initials: JD
  J   DDD
  J   D  D
J J   D  D
 J    DDD
```

---

## Problem 10: Unit Converter Suite
**File:** `Problem10.java`

**Description:** Create a comprehensive unit converter.

**Requirements:**
- Convert length: meters ↔ feet, kilometers ↔ miles
- Convert weight: kilograms ↔ pounds
- Convert volume: liters ↔ gallons
- Read value and conversion type from user

**Sample Output:**
```
Enter value: 100
Conversions for 100.0:
Length: 328.08 feet, 0.10 kilometers, 0.06 miles
Weight: 220.46 pounds
Volume: 26.42 gallons
```

---

## Problem 11: Payroll Calculator
**File:** `Problem11.java`

**Description:** Calculate employee payroll with deductions.

**Requirements:**
- Read hourly wage and hours worked
- Calculate gross pay (overtime at 1.5x after 40 hours)
- Calculate deductions: tax (15%), insurance ($50), retirement (5%)
- Display detailed pay stub

**Sample Output:**
```
Hours worked: 45
Hourly rate: $20.00
Regular pay (40 hrs): $800.00
Overtime pay (5 hrs): $150.00
Gross pay: $950.00
Tax (15%): $142.50
Insurance: $50.00
Retirement (5%): $47.50
Net pay: $710.00
```

---

## Problem 12: Loan Payment Calculator
**File:** `Problem12.java`

**Description:** Calculate monthly loan payments.

**Requirements:**
- Read loan amount, annual interest rate, and loan term (years)
- Calculate monthly payment using loan formula
- Display total amount paid and total interest
- Show amortization for first 3 months

**Sample Output:**
```
Loan amount: $10000.00
Annual rate: 5.0%
Term: 2 years
Monthly payment: $438.71
Total paid: $10529.04
Total interest: $529.04
```

---

## Problem 13: Distance and Speed Calculator
**File:** `Problem13.java`

**Description:** Calculate distance, speed, and time relationships.

**Requirements:**
- Read any two values (distance, speed, time)
- Calculate the missing value
- Handle different units (km/h, mph, m/s)
- Display all three values in multiple units

**Sample Output:**
```
Distance: 120 km
Time: 2 hours
Calculated speed: 60 km/h (37.28 mph, 16.67 m/s)
```

---

## Problem 14: Triangle Properties Calculator
**File:** `Problem14.java`

**Description:** Calculate properties of a triangle given three sides.

**Requirements:**
- Read three side lengths
- Check if triangle is valid
- Calculate perimeter and area (using Heron's formula)
- Determine triangle type (equilateral, isosceles, scalene)
- Check if right triangle

**Sample Output:**
```
Side A: 3.0
Side B: 4.0  
Side C: 5.0
Valid triangle: Yes
Perimeter: 12.0
Area: 6.0
Type: Scalene
Right triangle: Yes
```

---

## Problem 15: Roman Numeral Converter
**File:** `Problem15.java`

**Description:** Convert numbers to Roman numerals (1-100).

**Requirements:**
- Read an integer (1-100)
- Convert to Roman numerals using standard rules
- Display both number and Roman numeral
- Handle special cases (4, 9, 40, 90)

**Sample Output:**
```
Enter number (1-100): 47
47 in Roman numerals: XLVII

Breakdown:
40 = XL
5 = V
1 = I
1 = I
```

---

## Problem 16: Binary/Decimal Converter
**File:** `Problem16.java`

**Description:** Convert between binary and decimal numbers.

**Requirements:**
- Read a number and its base (2 for binary, 10 for decimal)
- Convert to the other base
- Display conversion steps
- Handle numbers up to 8 bits for binary

**Sample Output:**
```
Enter number: 25
Enter base (2 or 10): 10
25 in binary: 11001

Conversion steps:
25 ÷ 2 = 12 remainder 1
12 ÷ 2 = 6 remainder 0
6 ÷ 2 = 3 remainder 0
3 ÷ 2 = 1 remainder 1
1 ÷ 2 = 0 remainder 1
```

---

## Problem 17: Calendar Date Calculator
**File:** `Problem17.java`

**Description:** Calculate day of the year and days remaining.

**Requirements:**
- Read month and day
- Calculate day of the year (1-365, ignore leap years)
- Calculate days remaining in the year
- Display month name and season

**Sample Output:**
```
Enter month (1-12): 3
Enter day (1-31): 15
Date: March 15
Day of year: 74
Days remaining: 291
Season: Spring
```

---

## Problem 18: Password Strength Checker
**File:** `Problem18.java`

**Description:** Check password strength based on criteria.

**Requirements:**
- Read a password string
- Check length (minimum 8 characters)
- Check for uppercase letters, lowercase letters, digits
- Calculate and display strength score (0-100)
- Provide improvement suggestions

**Sample Output:**
```
Enter password: MyPass123
Length: 9 characters ✓
Uppercase letters: ✓
Lowercase letters: ✓
Digits: ✓
Special characters: ✗
Strength: 80/100 (Strong)
Suggestion: Add special characters
```

---

## Problem 19: Tip Calculator
**File:** `Problem19.java`

**Description:** Calculate tips and split bills among multiple people.

**Requirements:**
- Read bill amount, tip percentage, and number of people
- Calculate tip amount and total bill
- Calculate amount per person
- Show breakdown for different tip percentages (15%, 18%, 20%)

**Sample Output:**
```
Bill amount: $85.50
Tip percentage: 18%
Number of people: 4

Tip amount: $15.39
Total bill: $100.89
Per person: $25.22

Quick reference:
15% tip: $23.89 per person
18% tip: $25.22 per person
20% tip: $25.65 per person
```

---

## Problem 20: Scientific Calculator
**File:** `Problem20.java`

**Description:** Create a scientific calculator with multiple operations.

**Requirements:**
- Read two numbers and an operation (+, -, *, /, %, ^)
- Perform the calculation
- Handle division by zero
- Include additional functions: square root, square, absolute value
- Display result with proper formatting

**Sample Output:**
```
Enter first number: 16
Enter operation (+, -, *, /, %, ^, sqrt, sq, abs): sqrt
Result: 4.0

Additional calculations for 16:
Square: 256.0
Square root: 4.0
Absolute value: 16.0
```

---

## Testing Your Solutions

For each problem, test with:
1. **Normal cases** - typical input values
2. **Edge cases** - minimum/maximum values, zero
3. **Invalid input** - negative numbers where not allowed
4. **Boundary conditions** - exactly at limits

## Evaluation Criteria

Your solutions should demonstrate:
- [ ] Correct variable declarations and initialization
- [ ] Proper use of data types
- [ ] Accurate calculations
- [ ] Good input/output formatting
- [ ] Meaningful variable names
- [ ] Appropriate comments
- [ ] Error handling where needed

## Next Steps

After completing these problems:
1. Review your solutions for improvements
2. Try solving them in different ways
3. Move on to Control Flow exercises
4. Combine concepts from multiple problems

Remember: The goal is to practice writing Java code yourself. Don't look for solutions online - work through the logic step by step!
