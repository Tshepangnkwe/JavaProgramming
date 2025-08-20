/**
 * Person class - Basic example of Object-Oriented Programming
 * This demonstrates:
 * - Class creation
 * - Instance variables (fields)
 * - Constructors
 * - Getter and setter methods
 * - Instance methods
 * 
 * TODO: Study this class and create similar classes for other objects
 */
public class Person {
    // Instance variables (private for encapsulation)
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String address;
    
    // Default constructor (no parameters)
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.email = "";
        this.phoneNumber = "";
        this.address = "";
    }
    
    // Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "";
        this.phoneNumber = "";
        this.address = "";
    }
    
    // Constructor with all parameters
    public Person(String name, int age, String email, String phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    // Getter methods (to access private variables)
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    // Setter methods (to modify private variables)
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        }
    }
    
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // Instance methods (behavior)
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
    
    public void displayFullInfo() {
        System.out.println("=== Person Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + (email.isEmpty() ? "Not provided" : email));
        System.out.println("Phone: " + (phoneNumber.isEmpty() ? "Not provided" : phoneNumber));
        System.out.println("Address: " + (address.isEmpty() ? "Not provided" : address));
        System.out.println("==========================");
    }
    
    public boolean isAdult() {
        return age >= 18;
    }
    
    public boolean isSenior() {
        return age >= 65;
    }
    
    public String getAgeGroup() {
        if (age < 13) {
            return "Child";
        } else if (age < 20) {
            return "Teenager";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
    
    public void celebrateBirthday() {
        age++;
        System.out.println("Happy Birthday, " + name + "! You are now " + age + " years old.");
    }
    
    public boolean hasSameNameAs(Person other) {
        return this.name.equalsIgnoreCase(other.name);
    }
    
    public boolean isOlderThan(Person other) {
        return this.age > other.age;
    }
    
    public int getAgeDifference(Person other) {
        return Math.abs(this.age - other.age);
    }
    
    // Override toString method for easy printing
    @Override
    public String toString() {
        return String.format("Person[name=%s, age=%d, email=%s]", name, age, email);
    }
    
    // Override equals method to compare persons
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Person person = (Person) obj;
        return age == person.age && 
               name.equals(person.name) && 
               email.equals(person.email);
    }
    
    // Static method (belongs to the class, not instances)
    public static Person createChildPerson(String name, int age) {
        if (age < 18) {
            return new Person(name, age);
        } else {
            System.out.println("Warning: Age " + age + " is not a child. Creating anyway.");
            return new Person(name, age);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Person Class Examples ===");
        
        // Create persons using different constructors
        Person person1 = new Person();
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 30, "bob@email.com", "123-456-7890", "123 Main St");
        
        // Display initial information
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Person 3: " + person3);
        
        // Modify person1 using setters
        person1.setName("Charlie");
        person1.setAge(22);
        person1.setEmail("charlie@email.com");
        
        System.out.println("\nAfter updating person1:");
        person1.displayFullInfo();
        
        // Test instance methods
        System.out.println("\n=== Method Testing ===");
        person2.introduce();
        System.out.println("Is " + person2.getName() + " an adult? " + person2.isAdult());
        System.out.println("Age group: " + person2.getAgeGroup());
        
        person2.celebrateBirthday();
        
        // Compare persons
        System.out.println("\n=== Person Comparisons ===");
        System.out.println("Do person1 and person2 have the same name? " + 
                          person1.hasSameNameAs(person2));
        System.out.println("Is person2 older than person3? " + 
                          person2.isOlderThan(person3));
        System.out.println("Age difference between person2 and person3: " + 
                          person2.getAgeDifference(person3) + " years");
        
        // Static method example
        System.out.println("\n=== Static Method Example ===");
        Person child = Person.createChildPerson("Emma", 10);
        child.displayFullInfo();
        
        System.out.println("\n=== Practice Exercises ===");
        System.out.println("Try creating these yourself:");
        System.out.println("1. Add a 'profession' field with getter/setter");
        System.out.println("2. Create a method to calculate birth year");
        System.out.println("3. Add validation for email format");
        System.out.println("4. Create a method to format phone number");
        System.out.println("5. Add a method to get initials from name");
    }
}
