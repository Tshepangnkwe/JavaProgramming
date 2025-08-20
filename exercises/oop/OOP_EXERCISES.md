# Object-Oriented Programming Exercises

Practice creating classes and working with objects. These exercises will help you understand OOP concepts like encapsulation, constructors, methods, and object interactions.

## Beginner Level - Basic Classes

### Exercise 1: Book Class
**File to create:** `Book.java`

Create a `Book` class with:

**Instance Variables:**
- `title` (String)
- `author` (String)
- `pages` (int)
- `price` (double)
- `isAvailable` (boolean)

**Constructors:**
- Default constructor
- Constructor with title and author
- Constructor with all parameters

**Methods:**
- Getter and setter methods for all variables
- `displayInfo()` - prints book details
- `applyDiscount(double percentage)` - reduces price by percentage
- `isExpensive()` - returns true if price > $20
- `isSameAuthor(Book other)` - compares authors

### Exercise 2: Student Class
**File to create:** `Student.java`

Create a `Student` class with:

**Instance Variables:**
- `studentId` (int)
- `name` (String)
- `email` (String)
- `grades` (double array, max 5 grades)
- `gradeCount` (int)

**Constructors:**
- Constructor with id and name
- Constructor with id, name, and email

**Methods:**
- `addGrade(double grade)` - adds grade to array
- `calculateGPA()` - calculates average grade
- `getLetterGrade()` - returns letter grade based on GPA
- `hasPassingGrade()` - returns true if GPA >= 60
- `displayTranscript()` - shows all grades and GPA

### Exercise 3: Car Class
**File to create:** `Car.java`

Create a `Car` class with:

**Instance Variables:**
- `make` (String)
- `model` (String)
- `year` (int)
- `mileage` (double)
- `fuelLevel` (double) - percentage from 0-100
- `isRunning` (boolean)

**Methods:**
- Constructors with different parameter combinations
- `startEngine()` - starts car if fuel > 0
- `stopEngine()` - stops the car
- `drive(double miles)` - increases mileage, decreases fuel
- `addFuel(double amount)` - adds fuel (max 100%)
- `needsMaintenance()` - true if mileage > 50000
- `getCarAge()` - calculates age based on current year

## Intermediate Level - More Complex Classes

### Exercise 4: Rectangle Class
**File to create:** `Rectangle.java`

Create a `Rectangle` class with:

**Instance Variables:**
- `length` (double)
- `width` (double)

**Methods:**
- Constructor with length and width
- `calculateArea()` - returns area
- `calculatePerimeter()` - returns perimeter
- `isSquare()` - checks if length equals width
- `resize(double factor)` - multiplies both dimensions by factor
- `isSameSize(Rectangle other)` - compares areas
- `canFitInside(Rectangle other)` - checks if this fits in other
- `toString()` - returns formatted string representation

### Exercise 5: Employee Class
**File to create:** `Employee.java`

Create an `Employee` class with:

**Instance Variables:**
- `employeeId` (int)
- `name` (String)
- `department` (String)
- `salary` (double)
- `hoursWorked` (double)
- `isFullTime` (boolean)

**Methods:**
- Multiple constructors
- `calculateWeeklyPay()` - based on salary or hourly rate
- `giveRaise(double percentage)` - increases salary
- `addHours(double hours)` - adds to hours worked
- `isEligibleForBonus()` - true if full-time and hours > 40
- `comparePerformance(Employee other)` - compares based on hours

### Exercise 6: Circle Class
**File to create:** `Circle.java`

Create a `Circle` class with:

**Instance Variables:**
- `radius` (double)
- `centerX` (double)
- `centerY` (double)

**Static Variables:**
- `PI` (constant)

**Methods:**
- Constructor with radius
- Constructor with radius and center coordinates
- `calculateArea()` - πr²
- `calculateCircumference()` - 2πr
- `calculateDiameter()` - 2r
- `moveTo(double x, double y)` - changes center position
- `isPointInside(double x, double y)` - checks if point is inside circle
- `getDistanceFromCenter(double x, double y)` - calculates distance

## Advanced Level - Object Interactions

### Exercise 7: Library System
**Files to create:** `Library.java`, `LibraryBook.java`, `Member.java`

Create a simple library management system:

**LibraryBook Class:**
- `isbn` (String)
- `title`, `author` (String)
- `isCheckedOut` (boolean)
- `checkedOutBy` (String) - member name
- Methods for checking in/out

**Member Class:**
- `memberId` (int)
- `name`, `email` (String)
- `booksCheckedOut` (int)
- `fineAmount` (double)
- Methods for member management

**Library Class:**
- Arrays to store books and members
- Methods to add books/members, check out/in books, calculate fines

### Exercise 8: Shopping Cart System
**Files to create:** `Product.java`, `ShoppingCart.java`, `Customer.java`

**Product Class:**
- `productId`, `name` (String)
- `price` (double)
- `category` (String)
- `inStock` (boolean)

**ShoppingCart Class:**
- Array of products
- Methods to add/remove products, calculate total, apply discounts

**Customer Class:**
- `customerId`, `name`, `email` (String)
- `shoppingCart` (ShoppingCart object)
- Methods for customer operations

### Exercise 9: Bank Account System Extended
**Files to create:** `BankCustomer.java`, `SavingsAccount.java`, `CheckingAccount.java`

Extend the bank account concept:

**BankCustomer Class:**
- `customerId`, `name`, `phone` (String)
- Array of bank accounts
- Methods to manage multiple accounts

**SavingsAccount Class:** (extends BankAccount concept)
- Additional interest rate functionality
- Minimum balance requirements

**CheckingAccount Class:** (extends BankAccount concept)
- Overdraft protection
- Check writing functionality

## Class Interaction Exercises

### Exercise 10: School Management System
**Files to create:** `School.java`, `Teacher.java`, `Course.java`, `Classroom.java`

Create a comprehensive school system where:
- Teachers can teach multiple courses
- Courses have enrolled students
- Classrooms have capacity limits
- School manages all entities

### Exercise 11: Restaurant Management
**Files to create:** `Restaurant.java`, `Menu.java`, `Order.java`, `Table.java`

Create a restaurant system with:
- Menu items with prices
- Tables with seating capacity
- Orders that track items and calculate bills
- Restaurant that manages everything

## Object Array Practice

### Exercise 12: Contact Manager
**File to create:** `ContactManager.java`

Create a system that manages an array of Person objects:

- Add new contacts
- Search by name or phone
- Update contact information
- Delete contacts
- Sort contacts alphabetically
- Export contact list

### Exercise 13: Grade Book System
**Files to create:** `GradeBook.java`, `Assignment.java`

Create a teacher's grade book:

**Assignment Class:**
- `name`, `maxPoints` (String, double)
- `dueDate` (String)
- Array of student scores

**GradeBook Class:**
- Array of students
- Array of assignments
- Methods to add grades, calculate averages, generate reports

## Static Methods and Variables Practice

### Exercise 14: Utility Classes
**Files to create:** `MathUtility.java`, `DateUtility.java`, `StringUtility.java`

Create utility classes with only static methods:

**MathUtility:**
- Statistical calculations (mean, median, mode)
- Number theory functions
- Geometry calculations

**DateUtility:**
- Date validation
- Day of week calculation
- Age calculation

**StringUtility:**
- Advanced string manipulations
- Text formatting
- String analysis

## Testing Your Classes

For each exercise, create comprehensive test programs:

```java
public static void main(String[] args) {
    // Create objects
    Book book1 = new Book("Java Programming", "John Doe", 500, 45.99);
    Book book2 = new Book("Python Basics", "Jane Smith", 300, 35.50);
    
    // Test methods
    book1.displayInfo();
    book1.applyDiscount(10);
    System.out.println("After discount: $" + book1.getPrice());
    
    // Test object interactions
    System.out.println("Same author? " + book1.isSameAuthor(book2));
}
```

## Design Principles to Practice

1. **Encapsulation**: Make fields private, provide public methods
2. **Constructor Overloading**: Multiple ways to create objects
3. **Input Validation**: Check parameters in methods
4. **Meaningful Names**: Use descriptive class and method names
5. **Single Responsibility**: Each class should have one main purpose
6. **Object Interaction**: Objects should work together naturally

## Common Patterns to Implement

1. **Builder Pattern**: Multiple constructors for flexible object creation
2. **Validation Pattern**: Validate input in setters and methods
3. **State Management**: Track object state (active/inactive, etc.)
4. **Comparison Methods**: Compare objects based on different criteria
5. **Factory Methods**: Static methods that create objects
6. **Utility Classes**: Classes with only static methods

## Progress Checklist

Mark off as you complete:

- [ ] Basic classes with fields and methods
- [ ] Constructor overloading
- [ ] Getter and setter methods
- [ ] Input validation in methods
- [ ] Object comparison methods
- [ ] toString() method implementation
- [ ] Static methods and variables
- [ ] Object arrays and collections
- [ ] Class interactions and relationships
- [ ] Complex multi-class systems

## Tips for Success

1. **Start Small**: Begin with simple classes, add complexity gradually
2. **Test Everything**: Create thorough test cases for all methods
3. **Think Real-World**: Model classes after real-world objects
4. **Use Proper Naming**: Follow Java naming conventions
5. **Document Your Code**: Add comments explaining complex logic
6. **Handle Edge Cases**: Consider null values, negative numbers, etc.
7. **Practice Debugging**: Use print statements to trace execution

Remember: The goal is to understand how objects model real-world entities and how they interact with each other. Take your time and focus on understanding the concepts rather than rushing through the exercises.
