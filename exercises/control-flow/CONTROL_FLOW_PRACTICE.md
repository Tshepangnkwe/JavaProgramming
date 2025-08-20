# Control Flow Practice Problems

Complete these 20 practice problems to master Java control flow statements (if-else, switch-case). Write all programs from scratch and test them thoroughly.

## Instructions
- Create a separate Java file for each problem
- Name your files: `ControlFlow01.java`, `ControlFlow02.java`, etc.
- Include a main method to test your solution
- Use proper indentation and comments
- Test with various inputs including edge cases

---

## Problem 1: Grade Letter Converter
**File:** `ControlFlow01.java`

**Description:** Convert numeric grades to letter grades with detailed breakdown.

**Requirements:**
- Read a numeric grade (0-100)
- Convert to letter grade: A (90-100), B (80-89), C (70-79), D (60-69), F (<60)
- Add + or - modifiers (e.g., B+ for 87-89, B for 83-86, B- for 80-82)
- Display grade with descriptive message

**Test Cases:**
- 95 → A (Excellent)
- 87 → B+ (Good)
- 73 → C (Average)
- 55 → F (Failing)

---

## Problem 2: Day of Week Calculator
**File:** `ControlFlow02.java`

**Description:** Determine day of week using switch statement.

**Requirements:**
- Read a number (1-7) representing day of week
- Use switch statement to display day name
- Display whether it's a weekday or weekend
- Handle invalid input (not 1-7)
- Include work/school status message

**Test Cases:**
- 1 → Monday (Weekday - Back to work!)
- 6 → Saturday (Weekend - Relax!)
- 8 → Invalid input

---

## Problem 3: BMI Category Calculator
**File:** `ControlFlow03.java`

**Description:** Calculate BMI and categorize health status.

**Requirements:**
- Read height (in meters) and weight (in kg)
- Calculate BMI = weight / (height²)
- Categorize: Underweight (<18.5), Normal (18.5-24.9), Overweight (25-29.9), Obese (≥30)
- Provide health recommendations for each category
- Handle invalid inputs (negative values)

**Test Cases:**
- Height: 1.75m, Weight: 70kg → Normal weight
- Height: 1.60m, Weight: 100kg → Obese

---

## Problem 4: Traffic Light Simulator
**File:** `ControlFlow04.java`

**Description:** Simulate traffic light behavior with timing.

**Requirements:**
- Read current light color (Red, Yellow, Green)
- Use switch to determine next action and timing
- Red → "Stop! Wait 30 seconds"
- Yellow → "Caution! Light changing in 5 seconds"
- Green → "Go! Light will change in 45 seconds"
- Handle invalid colors

**Test Cases:**
- "Red" → Stop message
- "green" → Go message (case insensitive)
- "Blue" → Invalid color

---

## Problem 5: Age Category Classifier
**File:** `ControlFlow05.java`

**Description:** Classify person into age categories with specific benefits.

**Requirements:**
- Read person's age
- Classify: Child (0-12), Teen (13-19), Adult (20-64), Senior (65+)
- Display category with age-appropriate activities
- Handle negative ages and unrealistic ages (>150)
- Include discount eligibility for certain categories

**Test Cases:**
- Age 8 → Child (Playground activities, Student discount)
- Age 70 → Senior (Senior citizen discount, Health programs)

---

## Problem 6: Password Strength Validator
**File:** `ControlFlow06.java`

**Description:** Validate password strength with multiple criteria.

**Requirements:**
- Read a password string
- Check multiple conditions: length ≥8, has uppercase, has lowercase, has digit, has special character
- Use nested if statements for detailed feedback
- Assign strength score and category (Weak, Fair, Good, Strong)
- Provide specific improvement suggestions

**Test Cases:**
- "pass" → Weak (too short, missing criteria)
- "MySecure123!" → Strong (meets all criteria)

---

## Problem 7: Leap Year Calculator
**File:** `ControlFlow07.java`

**Description:** Determine if a year is a leap year with detailed explanation.

**Requirements:**
- Read a year
- Apply leap year rules: divisible by 4, but not by 100, unless also by 400
- Use nested if-else statements
- Display explanation of why it is/isn't a leap year
- Show February days for that year

**Test Cases:**
- 2024 → Leap year (divisible by 4, not century)
- 1900 → Not leap year (century, not divisible by 400)
- 2000 → Leap year (divisible by 400)

---

## Problem 8: Quiz Score Analyzer
**File:** `ControlFlow08.java`

**Description:** Analyze quiz performance with detailed feedback.

**Requirements:**
- Read number of questions and correct answers
- Calculate percentage
- Determine performance level: Excellent (≥90%), Good (80-89%), Average (70-79%), Poor (<70%)
- Provide specific study recommendations
- Handle edge cases (0 questions, more correct than total)

**Test Cases:**
- 20 questions, 18 correct → 90% Excellent
- 15 questions, 8 correct → 53% Poor

---

## Problem 9: Triangle Type Identifier
**File:** `ControlFlow09.java`

**Description:** Identify triangle type based on side lengths.

**Requirements:**
- Read three side lengths
- First check if triangle is valid (sum of any two sides > third side)
- Classify: Equilateral (all equal), Isosceles (two equal), Scalene (all different)
- Check if right triangle (a² + b² = c²)
- Handle invalid triangles with explanation

**Test Cases:**
- 3, 4, 5 → Valid, Scalene, Right triangle
- 5, 5, 5 → Valid, Equilateral
- 1, 2, 5 → Invalid triangle

---

## Problem 10: Banking Transaction Processor
**File:** `ControlFlow10.java`

**Description:** Process different banking transactions with validation.

**Requirements:**
- Read transaction type (Deposit, Withdraw, Transfer, Balance)
- Read current balance and transaction amount
- Use switch for transaction types
- Validate sufficient funds for withdrawals
- Apply transaction fees for certain operations
- Display new balance and transaction status

**Test Cases:**
- Balance: $1000, Withdraw: $200 → Success, New balance: $800
- Balance: $100, Withdraw: $200 → Failed, Insufficient funds

---

## Problem 11: Weather Advisory System
**File:** `ControlFlow11.java`

**Description:** Provide weather advisories based on conditions.

**Requirements:**
- Read temperature and weather condition (Sunny, Rainy, Snowy, Cloudy)
- Use nested if-else and switch statements
- Provide clothing recommendations
- Issue weather warnings for extreme conditions
- Suggest activities based on weather

**Test Cases:**
- 35°C, Sunny → Heat warning, wear light clothes
- -10°C, Snowy → Cold warning, wear heavy coat

---

## Problem 12: Student Scholarship Eligibility
**File:** `ControlFlow12.java`

**Description:** Determine scholarship eligibility with multiple criteria.

**Requirements:**
- Read GPA, family income, and extracurricular activities count
- Apply multiple criteria: GPA ≥3.5, Income <$50,000, Activities ≥2
- Use nested conditions to determine scholarship type
- Merit scholarship (high GPA), Need-based (low income), Activity scholarship
- Calculate scholarship amount based on eligibility

**Test Cases:**
- GPA: 3.8, Income: $30,000, Activities: 3 → Multiple scholarships eligible
- GPA: 2.5, Income: $80,000, Activities: 1 → No scholarships

---

## Problem 13: Movie Ticket Pricing
**File:** `ControlFlow13.java`

**Description:** Calculate movie ticket price with various discounts.

**Requirements:**
- Read customer age, day of week, time (Matinee/Evening)
- Base price: $12
- Discounts: Child (<12): 50%, Senior (≥65): 30%, Student (13-25): 20%
- Matinee discount: Additional 25%
- Weekend surcharge: $2
- Use nested if statements for complex pricing

**Test Cases:**
- Age 8, Tuesday Matinee → Child + Matinee discount
- Age 70, Saturday Evening → Senior + Weekend surcharge

---

## Problem 14: Grade Point Average Calculator
**File:** `ControlFlow14.java`

**Description:** Calculate GPA with grade validation and academic status.

**Requirements:**
- Read 5 course grades (A, B, C, D, F)
- Convert letters to points: A=4, B=3, C=2, D=1, F=0
- Calculate GPA
- Determine academic status: Dean's List (≥3.75), Good Standing (≥2.0), Probation (<2.0)
- Handle invalid grade letters

**Test Cases:**
- Grades: A, A, B, B, A → GPA: 3.6, Good Standing
- Grades: C, D, F, D, C → GPA: 1.4, Probation

---

## Problem 15: Shipping Cost Calculator
**File:** `ControlFlow15.java`

**Description:** Calculate shipping costs based on multiple factors.

**Requirements:**
- Read package weight, destination (Domestic/International), and shipping speed (Standard/Express)
- Base rates: Domestic $5, International $15
- Weight surcharge: $2 per kg over 1kg
- Express surcharge: 50% of base cost
- Free shipping for orders over $100
- Insurance required for packages over 5kg

**Test Cases:**
- 2kg, Domestic, Express → Calculate with surcharges
- 0.5kg, International, Standard → Base international rate

---

## Problem 16: Tax Bracket Calculator
**File:** `ControlFlow16.java`

**Description:** Calculate income tax using progressive tax brackets.

**Requirements:**
- Read annual income
- Apply tax brackets: $0-$10K (0%), $10K-$40K (15%), $40K-$85K (25%), >$85K (35%)
- Calculate tax owed in each bracket
- Display total tax and effective tax rate
- Handle negative income

**Test Cases:**
- Income: $50,000 → Tax in multiple brackets
- Income: $5,000 → Only first bracket

---

## Problem 17: Parking Fee Calculator
**File:** `ControlFlow17.java`

**Description:** Calculate parking fees with time-based pricing.

**Requirements:**
- Read entry time and exit time (24-hour format)
- First hour: $3, Additional hours: $2 each
- Maximum daily fee: $20
- Weekend rate: 50% higher
- Validation member discount: 20%
- Handle overnight parking

**Test Cases:**
- 9:00 to 12:00 weekday → 3 hours parking
- 23:00 to 8:00 weekend → Overnight parking

---

## Problem 18: Course Prerequisites Checker
**File:** `ControlFlow18.java`

**Description:** Check if student meets course prerequisites.

**Requirements:**
- Read student's completed courses and desired course
- Use switch to define prerequisites for different courses
- Check if all prerequisites are met
- Display missing prerequisites if any
- Handle courses with no prerequisites

**Test Cases:**
- Want: "Calculus II", Have: "Calculus I" → Eligible
- Want: "Data Structures", Have: "Intro Programming" → Missing "Advanced Programming"

---

## Problem 19: Insurance Premium Calculator
**File:** `ControlFlow19.java`

**Description:** Calculate insurance premium based on risk factors.

**Requirements:**
- Read age, gender, smoking status, driving record
- Base premium: $500
- Age adjustments: <25 (+$200), 25-65 (no change), >65 (+$100)
- Smoking: +$300
- Poor driving record: +$400
- Use nested conditions for complex calculations

**Test Cases:**
- Age 22, Male, Smoker, Good record → Higher premium
- Age 45, Female, Non-smoker, Good record → Lower premium

---

## Problem 20: Game Score Ranking System
**File:** `ControlFlow20.java`

**Description:** Rank players based on game scores with tie-breaking.

**Requirements:**
- Read scores for 3 players
- Rank players from highest to lowest
- Handle ties with appropriate messages
- Assign ranks: Gold (1st), Silver (2nd), Bronze (3rd)
- Display final rankings with score differences

**Test Cases:**
- Scores: 95, 87, 95 → Tie for first place
- Scores: 100, 85, 70 → Clear ranking

---

## Testing Your Solutions

For each problem, test with:
1. **Valid inputs** - normal expected values
2. **Boundary cases** - minimum/maximum values
3. **Invalid inputs** - out of range, wrong type
4. **Edge cases** - empty strings, zero values
5. **Multiple conditions** - test all branches

## Evaluation Criteria

Your solutions should demonstrate:
- [ ] Correct use of if-else statements
- [ ] Proper switch statement implementation
- [ ] Nested conditions where appropriate
- [ ] Input validation and error handling
- [ ] Clear and logical flow
- [ ] Meaningful variable names
- [ ] Proper code formatting and comments

## Common Patterns to Practice

1. **Simple if-else**: Basic true/false decisions
2. **Multi-way if-else**: Multiple conditions with else-if
3. **Nested if-else**: Conditions within conditions
4. **Switch statements**: Multiple discrete choices
5. **Input validation**: Checking for valid data
6. **Range checking**: Values within acceptable bounds
7. **Complex conditions**: Multiple criteria using && and ||

## Next Steps

After completing these problems:
1. Review your solutions for simplification opportunities
2. Try combining multiple control structures
3. Move on to Loop exercises
4. Practice debugging logical errors

Remember: Focus on understanding the logic flow rather than memorizing syntax. Think through the problem step by step before coding!
